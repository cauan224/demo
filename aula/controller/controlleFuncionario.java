package com.example.aula.controller;

import com.example.aula.model.Funcionario;
import com.example.aula.repository.FuncionarioRepo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/funcionarios")
public class controlleFuncionario {


        private FuncionarioRepo funcionarioRepo;

        public  controlleFuncionario(FuncionarioRepo funcionarioRepo) {
            this.funcionarioRepo = funcionarioRepo;
        }

        @GetMapping
        public List<Funcionario>listatodos(){
            return funcionarioRepo.findAll();
        }
        @PostMapping
        public ResponseEntity<Funcionario> salva (@RequestBody Funcionario funcionario) {
            funcionarioRepo.save(funcionario);
            return ResponseEntity.status(HttpStatus.CREATED).body(funcionario);

        }

    }

