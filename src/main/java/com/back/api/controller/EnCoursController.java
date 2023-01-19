package com.back.api.controller;

import com.back.api.model.EnCoursModel;
import com.back.api.repository.EnCoursRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("https://localhost:3000/")
public class EnCoursController {
    @Autowired
    EnCoursRepository enCoursRepository;

    @GetMapping("/encours")
    List<EnCoursModel> getEnCours() {
        return enCoursRepository.getEncours();
    }
}
