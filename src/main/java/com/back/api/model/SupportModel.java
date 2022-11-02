package com.back.api.model;

public class SupportModel {

    private Long supportId;
    private String supportCode;
    private String supportDesc;

    public SupportModel() {

    }

    public SupportModel(Long supportId, String supportCode, String supportDesc) {
        this.supportId = supportId;
        this.supportCode = supportCode;
        this.supportDesc = supportDesc;
    }

    public SupportModel(String supportCode, String supportDesc) {
        this.supportCode = supportCode;
        this.supportDesc = supportDesc;
    }

    public Long getSupportId() {
        return supportId;
    }

    public void setSupportId(Long supportId) {
        this.supportId = supportId;
    }

    public String getSupportCode() {
        return supportCode;
    }

    public void setSupportCode(String supportCode) {
        this.supportCode = supportCode;
    }

    public String getSupportDesc() {
        return supportDesc;
    }

    public void setSupportDesc(String supportDesc) {
        this.supportDesc = supportDesc;
    }
}
