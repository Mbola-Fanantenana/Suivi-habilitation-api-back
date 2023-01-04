package com.back.api.model;

public class BarModel {
    private String persCodeExp;
    private Long total;

    public BarModel() {

    }

    public BarModel(String persCodeExp, Long total) {
        this.persCodeExp = persCodeExp;
        this.total = total;
    }

    public String getPersCodeExp() {
        return persCodeExp;
    }

    public void setPersCodeExp(String persCodeExp) {
        this.persCodeExp = persCodeExp;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }
}
