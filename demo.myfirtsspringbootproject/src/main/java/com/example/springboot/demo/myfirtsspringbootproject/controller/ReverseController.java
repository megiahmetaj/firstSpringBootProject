package com.example.springboot.demo.myfirtsspringbootproject.controller;

import com.example.springboot.demo.myfirtsspringbootproject.components.TextUtilsComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReverseController {

    private final TextUtilsComponent textUtilsComponent;

    @Autowired
    public ReverseController(TextUtilsComponent textUtilsComponent) {
        this.textUtilsComponent = textUtilsComponent;
    }

    @GetMapping("/reverse/{text}")
    public String reverse(@PathVariable String text){
        return textUtilsComponent.reverse(text);
    }
}
