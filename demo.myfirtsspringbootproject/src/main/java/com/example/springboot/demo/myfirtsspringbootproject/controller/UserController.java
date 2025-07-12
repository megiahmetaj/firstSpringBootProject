package com.example.springboot.demo.myfirtsspringbootproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user/{name}")
    public String greetUser(@PathVariable String name){
        //merr vleren e evariablit name nga URL
        return "Hello " + name ;
    }
}
