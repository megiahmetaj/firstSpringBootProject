package com.example.springboot.demo.myfirtsspringbootproject.components;

import org.springframework.stereotype.Component;

@Component
public class TextUtilsComponent {
    public String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}
