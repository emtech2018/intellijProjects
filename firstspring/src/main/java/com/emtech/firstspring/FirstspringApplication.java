package com.emtech.firstspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import static java.util.List.*;
import static java.util.Optional.of;

@SpringBootApplication
@RestController
public class FirstspringApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstspringApplication.class, args);
    }
    @GetMapping
    public List<String> hallo(){
        List <String> signatures = new ArrayList<>();
        signatures.add("hallo1");
        signatures.add("hallo2");
        return signatures;

    }

}
