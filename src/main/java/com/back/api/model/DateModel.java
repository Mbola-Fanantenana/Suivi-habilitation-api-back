package com.back.api.model;

import java.util.Date;

public class DateModel {
    private Date current_date;

    public DateModel() {

    }

    public DateModel(Date current_date) {
        this.current_date = current_date;
    }

    public Date getCurrent_date() {
        return current_date;
    }

    public void setCurrent_date(Date current_date) {
        this.current_date = current_date;
    }
}
