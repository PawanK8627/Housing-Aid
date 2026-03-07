package Entity;

import java.util.Date;

//@Entity
public class HousingApplication {
    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long applicationId;

    //@ManyToOne
    //@JoinColumn(name = "citizenId", nullable = false)
    private Citizen citizen;

    private Long programId;
    private Date submittedDate;
    private String status; // PENDING, APPROVED, REJECTED

    // Getter and Setter for applicationId
    public Long getApplicationId() {
        return applicationId;
    }
    public void setApplicationId(Long applicationId) {
        this.applicationId = applicationId;
    }

    // Getter and Setter for citizen
    public Citizen getCitizen() {
        return citizen;
    }
    public void setCitizen(Citizen citizen) {
        this.citizen = citizen;
    }

    // Getter and Setter for programId
    public Long getProgramId() {
        return programId;
    }
    public void setProgramId(Long programId) {
        this.programId = programId;
    }

    // Getter and Setter for submittedDate
    public Date getSubmittedDate() {
        return submittedDate;
    }
    public void setSubmittedDate(Date submittedDate) {
        this.submittedDate = submittedDate;
    }

    // Getter and Setter for status
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}
