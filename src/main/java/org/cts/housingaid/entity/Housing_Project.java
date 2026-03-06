package org.cts.housingaid.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(schema =  "HousingProject")

public class Housing_Project {
    @Id
    private int projectId;
    private String projectTitle;
    private String projectDescription;
    private Date projectStartDate;
    private Date projectEndDate;
    private long projectNumberOfHouse;
    private String projectStatus;
    private long numberOfHouses;

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getProjectTitle() {
        return projectTitle;
    }

    public void setProjectTitle(String projectTitle) {
        this.projectTitle = projectTitle;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    public Date getProjectStartDate() {
        return projectStartDate;
    }

    public void setProjectStartDate(Date projectStartDate) {
        this.projectStartDate = projectStartDate;
    }

    public Date getProjectEndDate() {
        return projectEndDate;
    }

    public void setProjectEndDate(Date projectEndDate) {
        this.projectEndDate = projectEndDate;
    }

    public long getProjectNumberOfHouse() {
        return projectNumberOfHouse;
    }

    public void setProjectNumberOfHouse(long projectNumberOfHouse) {
        this.projectNumberOfHouse = projectNumberOfHouse;
    }

    public String getProjectStatus() {
        return projectStatus;
    }

    public void setProjectStatus(String projectStatus) {
        this.projectStatus = projectStatus;
    }

    public long getNumberOfHouses() {
        return numberOfHouses;
    }

    public void setNumberOfHouses(long numberOfHouses) {
        this.numberOfHouses = numberOfHouses;
    }
}
