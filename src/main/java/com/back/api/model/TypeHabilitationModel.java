package com.back.api.model;

public class TypeHabilitationModel {

    private Long typeHabId;
    private String typeHabCode;
    private String typeHabDesc;

    public TypeHabilitationModel() {

    }

    public TypeHabilitationModel(Long typeHabId, String typeHabCode, String typeHabDesc) {
        this.typeHabId = typeHabId;
        this.typeHabCode = typeHabCode;
        this.typeHabDesc = typeHabDesc;
    }

    public TypeHabilitationModel(String typeHabCode, String typeHabDesc) {
        this.typeHabCode = typeHabCode;
        this.typeHabDesc = typeHabDesc;
    }

    public Long getTypeHabId() {
        return typeHabId;
    }

    public void setTypeHabId(Long typeHabId) {
        this.typeHabId = typeHabId;
    }

    public String getTypeHabCode() {
        return typeHabCode;
    }

    public void setTypeHabCode(String typeHabCode) {
        this.typeHabCode = typeHabCode;
    }

    public String getTypeHabDesc() {
        return typeHabDesc;
    }

    public void setTypeHabDesc(String typeHabDesc) {
        this.typeHabDesc = typeHabDesc;
    }
}
