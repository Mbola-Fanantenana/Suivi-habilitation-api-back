package com.back.api.controller;

import com.back.api.model.BarModel;
import com.back.api.repository.BarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("https://localhost:3000/")
public class BarController {

    @Autowired
    BarRepository barRepository;

    @GetMapping("/bar")
    List<BarModel> getBar() {
        return barRepository.getBar();
    }
}
