package com.cicd.cicdjavaapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class CicdJavaApp {

    public static void main(String[] args) {
        SpringApplication.run(CicdJavaApp.class, args);
    }

    @RestController
    class HelloController {
        @GetMapping
		ResponseEntity<String> hello(){
			return ResponseEntity.ok("Hello Test CIDI Java Application");
		}
    }

}
