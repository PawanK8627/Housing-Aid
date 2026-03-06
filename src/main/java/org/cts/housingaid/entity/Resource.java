package org.cts.housingaid.entity;

public class Resource {
    private Integer resourceID;
    private Integer projectID;
    private Integer resourceType;
    private Integer resourceQuantity;
    private Integer resourceStatus;

    public Integer getResourceID() {
        return resourceID;
    }

    public void setResourceID(Integer resourceID) {
        this.resourceID = resourceID;
    }

    public Integer getProjectID() {
        return projectID;
    }

    public void setProjectID(Integer projectID) {
        this.projectID = projectID;
    }

    public Integer getResourceType() {
        return resourceType;
    }

    public void setResourceType(Integer resourceType) {
        this.resourceType = resourceType;
    }

    public Integer getResourceQuantity() {
        return resourceQuantity;
    }

    public void setResourceQuantity(Integer resourceQuantity) {
        this.resourceQuantity = resourceQuantity;
    }

    public Integer getResourceStatus() {
        return resourceStatus;
    }

    public void setResourceStatus(Integer resourceStatus) {
        this.resourceStatus = resourceStatus;
    }
}
