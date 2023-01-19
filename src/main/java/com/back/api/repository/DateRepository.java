package com.back.api.repository;

import com.back.api.model.DateModel;

import java.util.List;

public interface DateRepository {
    List<DateModel> getCurrentDate();
}
