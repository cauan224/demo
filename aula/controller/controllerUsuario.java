package com.example.aula.controller;

import com.example.aula.model.Usuario;
import com.example.aula.repository.UsuarioRepo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping ("/usuarios")
public class controllerUsuario {


     private UsuarioRepo usuarioRepo;

     public controllerUsuario (UsuarioRepo usuarioRepo) {
         this.usuarioRepo = usuarioRepo;
     }
     @GetMapping
        public List<Usuario> listatodos(){
            return usuarioRepo.findAll();
        }
        @PostMapping
        public ResponseEntity<Usuario> salvar(@RequestBody Usuario usuario) {
         usuarioRepo.save(usuario);
         return ResponseEntity.status(HttpStatus.CREATED).body(usuario);
        }

    }

