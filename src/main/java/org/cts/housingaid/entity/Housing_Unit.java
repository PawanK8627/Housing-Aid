package org.cts.housingaid.entity;

public class Housing_Unit {
    private Integer projectID;
    private String housingLocation;
    private Integer housingUnitId;
    private String housingType;
    private Integer housingCapacity;
    private String housingStatus;
    private String housingField;

    public Integer getProjectID() {
        return projectID;
    }

    public void setProjectID(Integer projectID) {
        this.projectID = projectID;
    }

    public String getHousingLocation() {
        return housingLocation;
    }

    public void setHousingLocation(String housingLocation) {
        this.housingLocation = housingLocation;
    }

    public Integer getHousingUnitId() {
        return housingUnitId;
    }

    public void setHousingUnitId(Integer housingUnitId) {
        this.housingUnitId = housingUnitId;
    }

    public String getHousingType() {
        return housingType;
    }

    public void setHousingType(String housingType) {
        this.housingType = housingType;
    }

    public Integer getHousingCapacity() {
        return housingCapacity;
    }

    public void setHousingCapacity(Integer housingCapacity) {
        this.housingCapacity = housingCapacity;
    }

    public String getHousingStatus() {
        return housingStatus;
    }

    public void setHousingStatus(String housingStatus) {
        this.housingStatus = housingStatus;
    }

    public String getHousingField() {
        return housingField;
    }

    public void setHousingField(String housingField) {
        this.housingField = housingField;
    }
}
