package com.back.api.controller;

import com.back.api.model.SupportModel;
import com.back.api.repository.SupportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SupportController {
    @Autowired
    SupportRepository supportRepository;

    @GetMapping("/supports")
    public List<SupportModel> getSupports() {
        return supportRepository.getSupports();
    }

    @GetMapping("/support/{supportId}")
    public SupportModel getSupportById(@PathVariable("supportId") Long supportId) {
        return supportRepository.findSupportId(supportId);
    }

    @PostMapping("/saveSupport")
    public int createSupport(@RequestBody SupportModel supp) {
        return supportRepository.saveSupport(supp);
    }

    @PutMapping("/updateSupport/{supportId}")
    public int updateSupport(@PathVariable("supportId") Long supportId, @RequestBody SupportModel supportModel) {
        SupportModel support = supportRepository.findSupportId(supportId);
        support.setSupportCode(supportModel.getSupportCode());
        support.setSupportDesc(supportModel.getSupportDesc());
        return supportRepository.updateSupport(support);
    }

    @DeleteMapping("/deleteSupport/{supportId}")
    public int deleteSupport(@PathVariable("supportId") Long supportId) {
        return supportRepository.deleteSupport(supportId);
    }

    @DeleteMapping("/deleteAllSupport")
    public int deleteAll() {
        return supportRepository.deleteSupports();
    }
}
