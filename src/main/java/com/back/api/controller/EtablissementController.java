package com.back.api.controller;

import com.back.api.model.EtablissementModel;
import com.back.api.repository.EtablissementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:3000/")
public class EtablissementController {
    @Autowired
    EtablissementRepository etablissementRepository;

    @GetMapping("/etablissements")
    public List<EtablissementModel> getAllEtablissement() {
        return etablissementRepository.getAllEtab();
    }

    @GetMapping("/etablissement/{etabId}")
    public EtablissementModel getEtab(@PathVariable("etabId") Long etabId) {
        return etablissementRepository.findEtabById(etabId);
    }

    @PostMapping("/saveEtablissement")
    public int saveEtablissement(@RequestBody EtablissementModel etabModel) {
            return etablissementRepository.saveEtab(etabModel);
    }

    @PutMapping("/updateEtablissement/{etabId}")
    public int updateEtablissement(@PathVariable("etabId") Long etabId, @RequestBody EtablissementModel etabModel) {
        EtablissementModel etablissement = etablissementRepository.findEtabById(etabId);
            etablissement.setEtabCode(etabModel.getEtabCode());
            etablissement.setEtabDesc(etabModel.getEtabDesc());
        return etablissementRepository.updateEtab(etablissement);
    }

    @DeleteMapping("/deleteEtablissement/{etabId}")
    public int deleteEtablissement(@PathVariable("etabId") Long etabId) {
        return etablissementRepository.deleteEtab(etabId);
    }

    @DeleteMapping("/deleteAllEtab")
    public int deleteAllEtab() {
        return etablissementRepository.deleteAllEtab();
    }
}
