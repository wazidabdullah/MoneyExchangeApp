package com.example.moneyexchangeapp;

public class UploadKycDocument {

    private String docType;
    private String docNumber;
    private String docPath;

    public UploadKycDocument(String docType, String docNumber, String docPath) {
        this.docType = docType;
        this.docNumber = docNumber;
        this.docPath = docPath;
    }

    public String getDocType() {
        return docType;
    }

    public String getDocNumber() {
        return docNumber;
    }

    public String getDocPath() {
        return docPath;
    }
}
