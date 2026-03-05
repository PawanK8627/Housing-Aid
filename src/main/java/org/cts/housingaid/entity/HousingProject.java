package org.cts.housingaid.entity;

import java.time.LocalDate;

public class HousingProject {

    private String projectId;
    private String projectTitle;
    private String projectDescription;
    private LocalDate projectStartDate;
    private LocalDate projectEndDate;
    private long projectBudget;
    private String projectStatus;
    private long numberOfHouses;


    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
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

    public LocalDate getProjectStartDate() {
        return projectStartDate;
    }

    public void setProjectStartDate(LocalDate projectStartDate) {
        this.projectStartDate = projectStartDate;
    }

    public LocalDate getProjectEndDate() {
        return projectEndDate;
    }

    public void setProjectEndDate(LocalDate projectEndDate) {
        this.projectEndDate = projectEndDate;
    }

    public long getProjectBudget() {
        return projectBudget;
    }

    public void setProjectBudget(long projectBudget) {
        this.projectBudget = projectBudget;
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
