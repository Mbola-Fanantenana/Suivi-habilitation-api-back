package com.back.api.controller;

import com.back.api.model.TypeHabilitationModel;
import com.back.api.repository.TypeHabilitationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("https://localhost:3000/")
public class TypeHabilitationController {
    @Autowired
    TypeHabilitationRepository typeHabilitationRepository;

    @GetMapping("/typehabilitations")
    public List<TypeHabilitationModel> getAllTypeHabilitation() {
        return typeHabilitationRepository.getAllTypes();
    }

    @GetMapping("/typehabilitation/{typeHabId}")
    public TypeHabilitationModel getTypeHabilitation(@PathVariable("typeHabId") Long typeHahId) {
        return typeHabilitationRepository.findTypeById(typeHahId);
    }

    @PostMapping("/saveTypeHabilitation")
    public int saveTypeHabilitation(@RequestBody TypeHabilitationModel typeModel) {
        return typeHabilitationRepository.saveTypeHab(typeModel);
    }

    @PutMapping("/updateTypeHabilitation/{typeHabId}")
    public int updateTypeHabilitation(@PathVariable("typeHabId") Long typeHahId, @RequestBody TypeHabilitationModel typeModel) {
        TypeHabilitationModel typeHabilitationModel = typeHabilitationRepository.findTypeById(typeHahId);
        typeHabilitationModel.setTypeHabCode(typeModel.getTypeHabCode());
        typeHabilitationModel.setTypeHabDesc(typeModel.getTypeHabDesc());
        return typeHabilitationRepository.updateHab(typeHabilitationModel);
    }

    @DeleteMapping("/deleteTypeHabilitation/{typeHabId}")
    public int deleteTypeHabilitation(@PathVariable("typeHabId") Long typeHahId) {
        return typeHabilitationRepository.deleteTypeHab(typeHahId);
    }

    @DeleteMapping("/deleteAllType")
    public int deleteAllTypeHabilitation() {
        return typeHabilitationRepository.deleteAllType();
    }
}

