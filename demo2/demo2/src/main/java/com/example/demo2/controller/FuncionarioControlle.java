package com.example.demo2.controller;

import com.example.demo2.model.Funcionariol;
import com.example.demo2.repository.FuncionarioRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;



    @RestController
    @RequestMapping("/funcionarios")
    public class FuncionarioControlle {
        private FuncionarioRepository funcionarioRepository;

        public FuncionarioControlle(FuncionarioRepository funcionarioRepository) {
            this.funcionarioRepository = funcionarioRepository;
        }

        @GetMapping
        public List<Funcionariol> getAllFuncionarios() {
            return funcionarioRepository.findAll();
        }

        @PostMapping
        public ResponseEntity<Funcionariol> createFuncionario(@RequestBody Funcionariol funcionario) {
            Funcionariol savedFuncionario = funcionarioRepository.save(funcionario);
            return  ResponseEntity.status(HttpStatus.CREATED).body(savedFuncionario);
        }
    }

