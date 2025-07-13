package com.example.springboot.demo.myfirtsspringbootproject.controller;

import com.example.springboot.demo.myfirtsspringbootproject.components.TextUtilsComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReverseController {

    @Autowired
    private TextUtilsComponent textUtilsComponent;

    @GetMapping("/reverse/{text}")
    public String reverse(@PathVariable String text){
        return textUtilsComponent.reverse(text);
    }
}
