package com.back.api.controller;

import com.back.api.model.TermineModel;
import com.back.api.repository.TermineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:3000/")
public class TermineController {
    @Autowired
    TermineRepository termineRepository;

    @GetMapping("/termine")
    List<TermineModel> getTermine() {
        return termineRepository.getTermine();
    }
}
