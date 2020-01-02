package com.cicd.cicdjavaapp;

import org.apache.coyote.Response;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class CicdJavaAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(CicdJavaAppApplication.class, args);
    }

    @RestController
    class HelloController {
		ResponseEntity<String> hello(){
			return ResponseEntity.ok("Hello CIDI Java Application");
		}
    }

}
