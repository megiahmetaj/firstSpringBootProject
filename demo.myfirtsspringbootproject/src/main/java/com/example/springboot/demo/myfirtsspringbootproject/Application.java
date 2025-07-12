package com.example.springboot.demo.myfirtsspringbootproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// eshte annotation me i rendesishem ne nje projekt springboot
// vendoset zakonisht mbi klasen kryesore te aplikacionit
// dhe kombinon 3 annotation e tjera te Spring-ut
// @SpringBootApplication = @Configuration + @EnableAutoConfiguration + @ComponentScan
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
