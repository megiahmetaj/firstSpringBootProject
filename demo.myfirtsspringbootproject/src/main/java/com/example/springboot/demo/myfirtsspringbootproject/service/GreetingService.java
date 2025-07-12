package com.example.springboot.demo.myfirtsspringbootproject.service;

import org.springframework.stereotype.Service;

// tregon qe kjo klase eshte nje sherbim logjik dhe ka business logic te app
@Service
public class GreetingService {

    public String greet(){
        return "Hello from GreetingService";
    }
}
