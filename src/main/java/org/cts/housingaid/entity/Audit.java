package org.cts.housingaid.entity;

public class Audit {
    private String auditId;
    private String auditOfficerId;
    private String auditStatus;
    private String auditFindings;
    private String auditScope;
    private String auditDate;

    public String getAuditId() {
        return auditId;
    }

    public void setAuditId(String auditId) {
        this.auditId = auditId;
    }

    public String getAuditOfficerId() {
        return auditOfficerId;
    }

    public void setAuditOfficerId(String auditOfficerId) {
        this.auditOfficerId = auditOfficerId;
    }

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
    }

    public String getAuditFindings() {
        return auditFindings;
    }

    public void setAuditFindings(String auditFindings) {
        this.auditFindings = auditFindings;
    }

    public String getAuditScope() {
        return auditScope;
    }

    public void setAuditScope(String auditScope) {
        this.auditScope = auditScope;
    }

    public String getAuditDate() {
        return auditDate;
    }

    public void setAuditDate(String auditDate) {
        this.auditDate = auditDate;
    }
}
