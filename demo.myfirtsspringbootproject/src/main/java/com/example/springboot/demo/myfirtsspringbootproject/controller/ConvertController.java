package com.example.springboot.demo.myfirtsspringbootproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ConvertController {
    private static final double EUR_TO_USD_RATE = 1.1;

    @GetMapping("/convert/eur-to-usd/{amount}")
    public Map<String, Object> convert(@PathVariable double amount) {
            Map<String, Object> response = new HashMap<>();
            response.put("eur", amount);
            response.put("usd", amount * EUR_TO_USD_RATE);
            return response;
    }

}
