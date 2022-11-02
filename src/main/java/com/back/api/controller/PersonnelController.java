package com.back.api.controller;

import com.back.api.model.PersonnelModel;
import com.back.api.repository.PersonnelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PersonnelController {
    @Autowired
    PersonnelRepository personnelRepository;

    @GetMapping("/personnels")
    public List<PersonnelModel> getAllPersonnels() {
        return personnelRepository.getPersonnels();
    }

    @GetMapping("/personnel/{persId}")
    public PersonnelModel getPersonnel(@PathVariable("persId") Long persId) {
        return personnelRepository.getPersonnelById(persId);
    }

    @PostMapping("/savePersonnel")
    public int savePersonnel(@RequestBody PersonnelModel personnelModel) {
        return personnelRepository.savePersonnel(personnelModel);
    }

    @PutMapping("/updatePersonnel/{persId}")
    public int updatePersonnel(@PathVariable("persId") Long persId, @RequestBody PersonnelModel personnelModel) {
        PersonnelModel personnelModel1 = personnelRepository.getPersonnelById(persId);
        personnelModel1.setPersCodeExp(personnelModel.getPersCodeExp());
        personnelModel1.setPersNom(personnelModel.getPersNom());
        personnelModel1.setPersPrenom(personnelModel.getPersPrenom());
        personnelModel1.setPersLogin(personnelModel.getPersLogin());
        personnelModel1.setPersMat(personnelModel.getPersMat());
        personnelModel1.setPersCIN(personnelModel.getPersCIN());
        personnelModel1.setPersNumTel(personnelModel.getPersNumTel());
        personnelModel1.setPersEmail(personnelModel.getPersEmail());
        return personnelRepository.updatePersonnel(personnelModel1);
    }

    @DeleteMapping("/deletePersonnel/{persId}")
    public int deleteMapping(@PathVariable("persId") Long persId) {
        return personnelRepository.deletePersonnel(persId);
    }

    @DeleteMapping("/deleteAllPersonnel")
    public int deleteAllPersonnels() {
        return personnelRepository.deletePersonnels();
    }
}
