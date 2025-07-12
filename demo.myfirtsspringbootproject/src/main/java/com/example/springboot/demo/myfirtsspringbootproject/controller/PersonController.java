package com.example.springboot.demo.myfirtsspringbootproject.controller;

import com.example.springboot.demo.myfirtsspringbootproject.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {
    @GetMapping("/people")
    public List<Person> getPeople(){
        return List.of(
                new Person("Anna", 20),
                new Person("Tom", 23)
        );

    }

}
