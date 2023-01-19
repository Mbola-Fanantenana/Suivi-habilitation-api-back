package com.back.api.controller;

import com.back.api.model.DateModel;
import com.back.api.repository.DateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("https://localhost:3000")
public class DateController {
    @Autowired
    DateRepository dateRepository;

    @GetMapping("/currentDate")
    List<DateModel> getCurrentDate(){
        return dateRepository.getCurrentDate();
    }
}
