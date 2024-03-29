package com.back.api.model;

import java.sql.Date;
public class HabilitationModel {
    private Long habId;
    private Date habDateDebut;
    private Date habDateFin;
    private boolean statusDebut;
    private boolean statusFin;
    private String habCaisse;
    private String habCaisseSortant;
    private String persCodeExp;
    private String typeHabCode;
    private String etabCode;
    private String etabCodeSortant;
    private String supportCode;
    private String roleFonction;
    private String foncInterim;

    private HabilitationModel() {

    }

    public HabilitationModel(Long habId, Date habDateDebut, Date habDateFin, boolean statusDebut, boolean statusFin, String habCaisse, String habCaisseSortant, String persCodeExp, String typeHabCode, String etabCode, String etabCodeSortant, String supportCode, String roleFonction, String foncInterim) {
        this.habId = habId;
        this.habDateDebut = habDateDebut;
        this.habDateFin = habDateFin;
        this.statusDebut = statusDebut;
        this.statusFin = statusFin;
        this.habCaisse = habCaisse;
        this.etabCodeSortant = etabCodeSortant;
        this.habCaisseSortant = habCaisseSortant;
        this.persCodeExp = persCodeExp;
        this.typeHabCode = typeHabCode;
        this.etabCode = etabCode;
        this.supportCode = supportCode;
        this.roleFonction = roleFonction;
        this.foncInterim = foncInterim;
    }

    public HabilitationModel(Date habDateDebut, Date habDateFin, boolean statusDebut, boolean statusFin, String habCaisse, String habCaisseSortant, String persCodeExp, String typeHabCode, String etabCode, String etabCodeSortant, String supportCode, String roleFonction, String foncInterim) {
        this.habDateDebut = habDateDebut;
        this.habDateFin = habDateFin;
        this.statusDebut = statusDebut;
        this.statusFin = statusFin;
        this.habCaisse = habCaisse;
        this.habCaisseSortant = habCaisseSortant;
        this.persCodeExp = persCodeExp;
        this.typeHabCode = typeHabCode;
        this.etabCode = etabCode;
        this.etabCodeSortant = etabCodeSortant;
        this.supportCode = supportCode;
        this.roleFonction = roleFonction;
        this.foncInterim = foncInterim;
    }

    public Long getHabId() {
        return habId;
    }

    public void setHabId(Long habId) {
        this.habId = habId;
    }

    public Date getHabDateDebut() {
        return habDateDebut;
    }

    public void setHabDateDebut(Date habDateDebut) {
        this.habDateDebut = habDateDebut;
    }

    public Date getHabDateFin() {
        return habDateFin;
    }

    public void setHabDateFin(Date habDateFin) {
        this.habDateFin = habDateFin;
    }

    public boolean isStatusDebut() {
        return statusDebut;
    }

    public void setStatusDebut(boolean statusDebut) {
        this.statusDebut = statusDebut;
    }

    public boolean isStatusFin() {
        return statusFin;
    }

    public void setStatusFin(boolean statusFin) {
        this.statusFin = statusFin;
    }

    public String getHabCaisse() {
        return habCaisse;
    }

    public void setHabCaisse(String habCaisse) {
        this.habCaisse = habCaisse;
    }

    public String getHabCaisseSortant() {
        return habCaisseSortant;
    }

    public void setHabCaisseSortant(String habCaisseSortant) {
        this.habCaisseSortant = habCaisseSortant;
    }

    public String getPersCodeExp() {
        return persCodeExp;
    }

    public void setPersCodeExp(String persCodeExp) {
        this.persCodeExp = persCodeExp;
    }

    public String getTypeHabCode() {
        return typeHabCode;
    }

    public void setTypeHabCode(String typeHabCode) {
        this.typeHabCode = typeHabCode;
    }

    public String getEtabCode() {
        return etabCode;
    }

    public void setEtabCode(String etabCode) {
        this.etabCode = etabCode;
    }

    public String getEtabCodeSortant() {
        return etabCodeSortant;
    }

    public void setEtabCodeSortant(String etabCodeSortant) {
        this.etabCodeSortant = etabCodeSortant;
    }

    public String getSupportCode() {
        return supportCode;
    }

    public void setSupportCode(String supportCode) {
        this.supportCode = supportCode;
    }

    public String getRoleFonction() {
        return roleFonction;
    }

    public void setRoleFonction(String roleFonction) {
        this.roleFonction = roleFonction;
    }

    public String getFoncInterim() {
        return foncInterim;
    }

    public void setFoncInterim(String foncInterim) {
        this.foncInterim = foncInterim;
    }
}
