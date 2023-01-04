package com.back.api.model;

public class PieModel {
    private String etabCode;
    private Long total;

    public PieModel() {

    }

    public PieModel(String etabCode, Long total) {
        this.etabCode = etabCode;
        this.total = total;
    }

    public String getEtabCode() {
        return etabCode;
    }

    public void setEtabCode(String etabCode) {
        this.etabCode = etabCode;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }
}
