package com.example.springboot.demo.myfirtsspringbootproject.components;

import org.springframework.stereotype.Component;

@Component
public class CalculatorComponent {
    public int add(int a, int b){
        return a+b;
    }
}
