package com.back.api.model;


public class PersonnelModel {
    private Long persId;
    private String persCodeExp;
    private String persNom;
    private String persPrenom;
    private String persLogin;
    private String persMat;
    private Long persCIN;
    private Long persNumTel;
    private String persEmail;

    public PersonnelModel() {

    }

    public PersonnelModel(Long persId, String persCodeExp, String persNom, String persPrenom, String persLogin, String persMat, Long persCIN, Long persNumTel, String persEmail) {
        this.persId = persId;
        this.persCodeExp = persCodeExp;
        this.persNom = persNom;
        this.persPrenom = persPrenom;
        this.persLogin = persLogin;
        this.persMat = persMat;
        this.persCIN = persCIN;
        this.persNumTel = persNumTel;
        this.persEmail = persEmail;
    }

    public PersonnelModel(String persCodeExp, String persNom, String persPrenom, String persLogin, String persMat, Long persCIN, Long persNumTel, String persEmail) {
        this.persCodeExp = persCodeExp;
        this.persNom = persNom;
        this.persPrenom = persPrenom;
        this.persLogin = persLogin;
        this.persMat = persMat;
        this.persCIN = persCIN;
        this.persNumTel = persNumTel;
        this.persEmail = persEmail;
    }

    public Long getPersId() {
        return persId;
    }

    public void setPersId(Long persId) {
        this.persId = persId;
    }

    public String getPersCodeExp() {
        return persCodeExp;
    }

    public void setPersCodeExp(String persCodeExp) {
        this.persCodeExp = persCodeExp;
    }

    public String getPersNom() {
        return persNom;
    }

    public void setPersNom(String persNom) {
        this.persNom = persNom;
    }

    public String getPersPrenom() {
        return persPrenom;
    }

    public void setPersPrenom(String persPrenom) {
        this.persPrenom = persPrenom;
    }

    public String getPersLogin() {
        return persLogin;
    }

    public void setPersLogin(String persLogin) {
        this.persLogin = persLogin;
    }

    public String getPersMat() {
        return persMat;
    }

    public void setPersMat(String persMat) {
        this.persMat = persMat;
    }

    public Long getPersCIN() {
        return persCIN;
    }

    public void setPersCIN(Long persCIN) {
        this.persCIN = persCIN;
    }

    public Long getPersNumTel() {
        return persNumTel;
    }

    public void setPersNumTel(Long persNumTel) {
        this.persNumTel = persNumTel;
    }

    public String getPersEmail() {
        return persEmail;
    }

    public void setPersEmail(String persEmail) {
        this.persEmail = persEmail;
    }
}
