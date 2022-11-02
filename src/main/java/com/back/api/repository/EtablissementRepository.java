package com.back.api.repository;

import com.back.api.model.EtablissementModel;

import java.util.List;

public interface EtablissementRepository {
    int saveEtab(EtablissementModel etab);
    int updateEtab(EtablissementModel updated);
    EtablissementModel findEtabById(Long etabId);
    int deleteEtab(Long etabId);
    int deleteAllEtab();
    List<EtablissementModel> getAllEtab();
}
