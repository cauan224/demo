package com.example.aula3.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/d")
@RestController
public class Welcom {
@RequestMapping
    public String bem(){
        return "bem vindo";
    }

}
