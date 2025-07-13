package com.example.springboot.demo.myfirtsspringbootproject.controller;

import com.example.springboot.demo.myfirtsspringbootproject.components.CalculatorComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CalculatorController {

    @Autowired
    private final CalculatorComponent calculatorComponent;

    public CalculatorController(CalculatorComponent calculatorComponent) {
        this.calculatorComponent = calculatorComponent;
    }
// Menyra 1
//    @GetMapping("/calculator/add/{a}/{b}")
//    public int add(@PathVariable int a, @PathVariable int b){
//        return calculatorComponent.add(a,b);
//    }

    // Menyra 2
    @GetMapping("/add")
    public String add(@RequestParam int a, @RequestParam int b){
        int rezult = calculatorComponent.add(a, b);
        return "Rezultati: " + rezult;
    }
}
