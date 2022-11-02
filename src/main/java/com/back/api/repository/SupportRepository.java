package com.back.api.repository;

import com.back.api.model.SupportModel;

import java.util.List;

public interface SupportRepository {
    int saveSupport(SupportModel supp);
    int updateSupport(SupportModel supportModel);
    SupportModel findSupportId(Long supportId);
    int deleteSupport(Long supportId);
    int deleteSupports();
    List<SupportModel> getSupports();
}
