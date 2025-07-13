package com.example.springboot.demo.myfirtsspringbootproject.controller;

import com.example.springboot.demo.myfirtsspringbootproject.service.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LanguageController {

    private final LanguageService languageService;

    @Autowired
    public LanguageController(LanguageService languageService) {
        this.languageService = languageService;
    }

    @GetMapping("/language/{lang}")
    public String sayHello(@PathVariable String lang){
        return languageService.sayHello(lang);
    }
}
