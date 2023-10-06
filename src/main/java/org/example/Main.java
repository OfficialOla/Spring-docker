package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Main {
    @GetMapping("/message")
    public ResponseEntity<?> getMessage(){
        String response = "Welcome to my first docker lesson";
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);

    }
}