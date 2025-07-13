package com.example.springboot.demo.myfirtsspringbootproject.service;

import org.springframework.stereotype.Service;

@Service
public class LanguageService {
    public String sayHello(String lang){
        return switch (lang.toLowerCase()) {
            case "en" -> "Hello";
            case "al" -> "Pershendetje";
            case "it" -> "Ciao";
            case "fr" -> "Bonjour";
            case "de" -> "Hallo";
            case "es" -> "Hola";
            case "tr" -> "Merhaba";
            default -> "Hello default";
        };
    }
}
