package org.cts.housingaid.entity;

public class Resource {
    private String resourceId;
    private String projectId;
    private String resourceStatus;
    private long resourceQuantity;
    private String resourceType;

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getResourceStatus() {
        return resourceStatus;
    }

    public void setResourceStatus(String resourceStatus) {
        this.resourceStatus = resourceStatus;
    }

    public long getResourceQuantity() {
        return resourceQuantity;
    }

    public void setResourceQuantity(long resourceQuantity) {
        this.resourceQuantity = resourceQuantity;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }
}
