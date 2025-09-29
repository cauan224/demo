package com.example.aula3.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/bemVindo")
@RestController
public class bemVindo {
   @RequestMapping
   public String mensagem() {
       return "Bem-vindo ao sistema";

   }

}
