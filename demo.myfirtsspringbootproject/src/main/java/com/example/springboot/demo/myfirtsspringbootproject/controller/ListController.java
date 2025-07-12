package com.example.springboot.demo.myfirtsspringbootproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ListController {

    @GetMapping("/names")
    public List<String> name(){
        return List.of("Tom", "Ana", "John");
    }

}
