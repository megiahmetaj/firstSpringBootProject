package com.example.springboot.demo.myfirtsspringbootproject.controller;

import com.example.springboot.demo.myfirtsspringbootproject.components.MathUtilityComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {
    @Autowired
    private MathUtilityComponent mathUtilityComponent;

    @GetMapping("/math/square/{x}")
    public int square(@PathVariable int x){
        return  mathUtilityComponent.square(x);
    }

    @GetMapping("/math/cube/{x}")
    public int cube(@PathVariable int x){
        return mathUtilityComponent.cube(x);
    }
}
