package com.back.api.repository;

import com.back.api.model.TypeHabilitationModel;

import java.util.List;

public interface TypeHabilitationRepository {
    int saveTypeHab(TypeHabilitationModel type);
    int updateHab(TypeHabilitationModel type);
    TypeHabilitationModel findTypeById(Long typeHabId);
    int deleteTypeHab(Long typeHabId);
    int deleteAllType();
    List<TypeHabilitationModel> getAllTypes();
}
