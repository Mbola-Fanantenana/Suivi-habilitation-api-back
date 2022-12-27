package com.back.api.controller;

import com.back.api.model.HabilitationModel;
import com.back.api.repository.HabilitationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:3000/")
public class HabilitationController {
    @Autowired
    HabilitationRepository habilitationRepository;

    @GetMapping("/habilitations")
    public List<HabilitationModel> getAllHabilitations() {
        return habilitationRepository.getAllHabilitations();
    }

    @GetMapping("/vHabilitations")
    public List<HabilitationModel> getRapportHabilitation() {
        return habilitationRepository.getRapportFin();
    }


    @GetMapping("/habilitation/{habId}")
    public HabilitationModel getHabById(@PathVariable("habId") Long habId) {
        return habilitationRepository.getHabById(habId);
    }

    @PostMapping("/saveHabilitation")
    public int saveHabilitation(@RequestBody HabilitationModel habilitationModel) {
        return habilitationRepository.saveHabilitation(habilitationModel);
    }

    @PutMapping("/updateHabilitation/{habId}")
    public int updateHabilitation(@PathVariable("habId") Long habId, @RequestBody HabilitationModel habilitationModel) {
        HabilitationModel habilitationModel1 = habilitationRepository.getHabById(habId);

        habilitationModel1.setHabDateDebut(habilitationModel.getHabDateDebut());
        habilitationModel1.setHabDateFin(habilitationModel.getHabDateFin());
        habilitationModel1.setStatusDebut(habilitationModel.isStatusDebut());
        habilitationModel1.setStatusFin(habilitationModel.isStatusFin());
        habilitationModel1.setHabCaisse(habilitationModel.getHabCaisse());
        habilitationModel1.setPersCodeExp(habilitationModel.getPersCodeExp());
        habilitationModel1.setTypeHabCode(habilitationModel.getTypeHabCode());
        habilitationModel1.setEtabCode(habilitationModel.getEtabCode());
        habilitationModel1.setSupportCode(habilitationModel.getSupportCode());
        habilitationModel1.setRoleFonction(habilitationModel.getRoleFonction());
        habilitationModel1.setFoncInterim(habilitationModel.getFoncInterim());

        return habilitationRepository.updateHabilitation(habilitationModel1);
    }

    @DeleteMapping("/deleteAllHabilitations")
    public int deleteAllHabilitations() {
        return habilitationRepository.deleteAllHabilitations();
    }

    @DeleteMapping("/deleteHabilitation/{habId}")
    public int deleteHabilitation(@PathVariable("habId") Long habId) {
        return habilitationRepository.deleteHabilitation(habId);
    }

}
