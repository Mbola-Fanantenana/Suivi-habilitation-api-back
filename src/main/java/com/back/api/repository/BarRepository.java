package com.back.api.repository;

import com.back.api.model.BarModel;

import java.util.List;

public interface BarRepository {
    List<BarModel> getBar();
}
