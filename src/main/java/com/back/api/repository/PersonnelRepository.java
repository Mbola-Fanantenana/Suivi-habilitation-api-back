package com.back.api.repository;

import com.back.api.model.PersonnelModel;

import java.util.List;

public interface PersonnelRepository {
    int savePersonnel(PersonnelModel personnel);
    int updatePersonnel(PersonnelModel personnel);
    PersonnelModel getPersonnelById(Long persId);
    int deletePersonnel(Long persId);
    int deletePersonnels();
    List<PersonnelModel> getPersonnels();
    //List<PersonnelModel> getPersRoles();
}
