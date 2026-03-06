package org.cts.housingaid.entity;

import java.time.LocalDate;

public class Allocation {
    private int applicationId;
    private int allocationId;
    private int unitId;
    private int officierId;
    private LocalDate date;
    private String status;

    public int getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(int applicationId) {
        this.applicationId = applicationId;
    }

    public int getAllocationId() {
        return allocationId;
    }

    public void setAllocationId(int allocationId) {
        this.allocationId = allocationId;
    }

    public int getUnitId() {
        return unitId;
    }

    public void setUnitId(int unitId) {
        this.unitId = unitId;
    }

    public int getOfficierId() {
        return officierId;
    }

    public void setOfficierId(int officierId) {
        this.officierId = officierId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String isStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
