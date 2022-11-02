package com.back.api.model;

public class EtablissementModel {

    private Long etabId;
    private String etabCode;
    private String etabDesc;

    public EtablissementModel() {

    }

    public EtablissementModel(Long etabId, String etabCode, String etabDesc) {
        this.etabId = etabId;
        this.etabCode = etabCode;
        this.etabDesc = etabDesc;
    }

    public EtablissementModel(String etabCode, String etabDesc) {
        this.etabCode = etabCode;
        this.etabDesc = etabDesc;
    }

    public Long getEtabId() {
        return etabId;
    }

    public void setEtabId(Long etabId) {
        this.etabId = etabId;
    }

    public String getEtabCode() {
        return etabCode;
    }

    public void setEtabCode(String etabCode) {
        this.etabCode = etabCode;
    }

    public String getEtabDesc() {
        return etabDesc;
    }

    public void setEtabDesc(String etabDesc) {
        this.etabDesc = etabDesc;
    }
}
