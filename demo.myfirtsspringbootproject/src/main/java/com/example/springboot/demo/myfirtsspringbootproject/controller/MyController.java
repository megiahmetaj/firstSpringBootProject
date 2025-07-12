package com.example.springboot.demo.myfirtsspringbootproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// klasa sherben si api(app programing i...)
// kthen pergjigje direkt si tekst ose json
@RestController
public class MyController {

    // lidh metoden Java me nje URL te caktuar
    @GetMapping("/hello")
    public String getMassage(){
        return "Hellooo!";
    }


}
