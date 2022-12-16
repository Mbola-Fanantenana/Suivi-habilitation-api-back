package com.back.api.repository;

import com.back.api.model.HabilitationModel;

import java.util.List;

public interface HabilitationRepository {
    int saveHabilitation(HabilitationModel habilitation);
    int updateHabilitation(HabilitationModel habilitation);
    HabilitationModel getHabById(Long habId);
    int deleteHabilitation(Long habId);
    int deleteAllHabilitations();
    List<HabilitationModel> getAllHabilitations();
    List<HabilitationModel> getRapportFin();
}
