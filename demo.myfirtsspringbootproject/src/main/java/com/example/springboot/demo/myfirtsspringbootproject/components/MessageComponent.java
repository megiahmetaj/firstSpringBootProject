package com.example.springboot.demo.myfirtsspringbootproject.components;

import org.springframework.stereotype.Component;

// Kjo klase eshte nje komponent qe duhet ta menaxhosh vet
// dhe ta krijosh automatikisht kur nis app
// nuk eshte nevoja te krijojme vete objektin me new
// Spring krijon nje objekt nga kjo klase
// Ky objekt ruhet ne kontekstin e springut dhe nje lloj memorie te perbashket
// mund ta perdorim kete objekt kudo tjeter ne app me annotation @Autowired
@Component
public class MessageComponent {
    public String getMessage(){
        return "Hello World!";
    }

}
