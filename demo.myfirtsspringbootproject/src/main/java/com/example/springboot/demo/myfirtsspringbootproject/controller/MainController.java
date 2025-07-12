package com.example.springboot.demo.myfirtsspringbootproject.controller;

import com.example.springboot.demo.myfirtsspringbootproject.components.MessageComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Ky annotation tregon qe kjo klase eshte nje controller
// pra pergjigjet ndaj kerkesave HTTP
// Kjo klase komunikon me web-in
// E ben klasen te pergatis pergjigjet direkt si text
// kur dikush shkon tek localhost:8080/mesazh
//do te merrte kerkesen dhe do te kthente pergjigje
@RestController
public class MainController {

    // tregon qe spring duhet te injektoje automatikisht nje objekt tte tipit message component
    // pa perdorur keywordin new
    @Autowired
    private MessageComponent messageComponent;

    // ky eshte nje annotation per url qe do vendosim
    // i thote springut qe kur vjen nje kerkes GET te /mesazh
    // thirr metoden me posht
    @GetMapping("/mesazh")
    public String shfaqMesazhin(){
        return messageComponent.getMessage();
    }
}

