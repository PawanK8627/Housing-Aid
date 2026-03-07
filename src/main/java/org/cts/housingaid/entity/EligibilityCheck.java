package org.cts.housingaid.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;
@Entity
@Table(schema="EligibilityCheck")
public class EligibilityCheck {
    @Id
    private Long id;
    private int chechId;
    private int applicationId;
    private int officarId;
    private String result;
    private LocalDate date;
    private String notes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getChechId() {
        return chechId;
    }

    public void setChechId(int chechId) {
        this.chechId = chechId;
    }

    public int getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(int applicationId) {
        this.applicationId = applicationId;
    }

    public int getOfficarId() {
        return officarId;
    }

    public void setOfficarId(int officarId) {
        this.officarId = officarId;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
