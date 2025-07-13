package com.example.springboot.demo.myfirtsspringbootproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/convert")
public class ConvertController {
    private static final double EUR_TO_USD_RATE = 1.1;

    @GetMapping("/eur-to-usd/{amount}")
    public String convertEurToUsd(@PathVariable double amount) {
            double result = amount * EUR_TO_USD_RATE;
            return amount + " EUR = " + String.format("%.2f", result) + " USD";
    }

}
