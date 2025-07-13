package com.example.springboot.demo.myfirtsspringbootproject.service;

import org.springframework.stereotype.Service;

@Service
public class CounterService {
    private int counter = 0;

    public synchronized int increment(){
        return ++counter;
    }

}
