package org.cts.housingaid.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "HousingUnit")
public class HousingUnit {

    @Id
    private int housingUnitId;
    private int projectId;
    private String location;
    private String housingUnitType;
    private int housingUnitCapacity;
    private String housingUnitStatus;

    public int getHousingUnitId() {
        return housingUnitId;
    }

    public void setHousingUnitId(int housingUnitId) {
        this.housingUnitId = housingUnitId;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getHousingUnitType() {
        return housingUnitType;
    }

    public void setHousingUnitType(String housingUnitType) {
        this.housingUnitType = housingUnitType;
    }

    public int getHousingUnitCapacity() {
        return housingUnitCapacity;
    }

    public void setHousingUnitCapacity(int housingUnitCapacity) {
        this.housingUnitCapacity = housingUnitCapacity;
    }

    public String getHousingUnitStatus() {
        return housingUnitStatus;
    }

    public void setHousingUnitStatus(String housingUnitStatus) {
        this.housingUnitStatus = housingUnitStatus;
    }
}
