package com.example.springboot.demo.myfirtsspringbootproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Map;

@RestController
public class InfoController {

    @GetMapping("/info")
    public Map<String, Object> getInfo() {
        return Map.of("status", "active",
                "time", LocalDateTime.now(),
                "userID", 1234);
    }
}
