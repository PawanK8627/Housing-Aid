package Entity;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "EligibilityCheck")   // Correct usage of @Table
public class Eligibilitycheck {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long checkId;

    @ManyToOne
    @JoinColumn(name = "applicationId", nullable = false)
    private HousingApplication application;

    private Long officerId;

    private String result; // ELIGIBLE / NOT_ELIGIBLE

    private LocalDate date;

    private String notes;

    // Getter and Setter for checkId
    public Long getCheckId() {
        return checkId;
    }
    public void setCheckId(Long checkId) {
        this.checkId = checkId;
    }

    // Getter and Setter for application
    public HousingApplication getApplication() {
        return application;
    }
    public void setApplication(HousingApplication application) {
        this.application = application;
    }

    // Getter and Setter for officerId
    public Long getOfficerId() {
        return officerId;
    }
    public void setOfficerId(Long officerId) {
        this.officerId = officerId;
    }

    // Getter and Setter for result
    public String getResult() {
        return result;
    }
    public void setResult(String result) {
        if (!result.equalsIgnoreCase("ELIGIBLE") && !result.equalsIgnoreCase("NOT_ELIGIBLE")) {
            throw new IllegalArgumentException("Result must be either ELIGIBLE or NOT_ELIGIBLE");
        }
        this.result = result;
    }

    // Getter and Setter for date
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        if (date.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("Date cannot be in the future");
        }
        this.date = date;
    }

    // Getter and Setter for notes
    public String getNotes() {
        return notes;
    }
    public void setNotes(String notes) {
        if ("NOT_ELIGIBLE".equalsIgnoreCase(this.result) && (notes == null || notes.trim().isEmpty())) {
            throw new IllegalArgumentException("Reason must be provided when application is marked NOT_ELIGIBLE");
        }
        this.notes = notes;
    }
}
