package org.cts.housingaid.entity;

public class CitizenDocument {
    private int documentInd;
    private int citizenId;
    private String docType;
    private String fileUrl;
    private String uploadedDate;
    private String verificationStatus;

    public int getDocumentInd() {
        return documentInd;
    }

    public void setDocumentInd(int documentInd) {
        this.documentInd = documentInd;
    }

    public int getCitizenId() {
        return citizenId;
    }

    public void setCitizenId(int citizenId) {
        this.citizenId = citizenId;
    }

    public String getDocType() {
        return docType;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public String getUploadedDate() {
        return uploadedDate;
    }

    public void setUploadedDate(String uploadedDate) {
        this.uploadedDate = uploadedDate;
    }

    public String getVerificationStatus() {
        return verificationStatus;
    }

    public void setVerificationStatus(String verificationStatus) {
        this.verificationStatus = verificationStatus;
    }
}
