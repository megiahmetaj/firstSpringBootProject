package com.example.springboot.demo.myfirtsspringbootproject.components;

import org.springframework.stereotype.Component;

@Component
public class UtilityComponent {
    public String toUpper(String text){
        return text.toUpperCase();
    }
}
