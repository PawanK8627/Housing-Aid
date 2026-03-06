package org.cts.housingaid.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "HousingUnit")
public class Housing_Unit {
    @Id
    private int projectID;
    private String housingLocation;
    private int housingUnitId;
    private String housingType;
    private int housingCapacity;
    private String housingStatus;

    public int getProjectID() {
        return projectID;
    }

    public void setProjectID(int projectID) {
        this.projectID = projectID;
    }

    public String getHousingLocation() {
        return housingLocation;
    }

    public void setHousingLocation(String housingLocation) {
        this.housingLocation = housingLocation;
    }

    public int getHousingUnitId() {
        return housingUnitId;
    }

    public void setHousingUnitId(int housingUnitId) {
        this.housingUnitId = housingUnitId;
    }

    public String getHousingType() {
        return housingType;
    }

    public void setHousingType(String housingType) {
        this.housingType = housingType;
    }

    public int getHousingCapacity() {
        return housingCapacity;
    }

    public void setHousingCapacity(int housingCapacity) {
        this.housingCapacity = housingCapacity;
    }

    public String getHousingStatus() {
        return housingStatus;
    }

    public void setHousingStatus(String housingStatus) {
        this.housingStatus = housingStatus;
    }

}
