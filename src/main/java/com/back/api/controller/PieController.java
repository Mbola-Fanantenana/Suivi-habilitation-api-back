package com.back.api.controller;

import com.back.api.model.PieModel;
import com.back.api.repository.PieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:3000/")
public class PieController {

    @Autowired
    PieRepository pieRepository;

    @GetMapping("/pie")
    List<PieModel> getPie() {
        return pieRepository.getPie();
    }
}
