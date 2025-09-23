package com.example.aula.controller;

import com.example.aula.Service.ClienteServeci;
import com.example.aula.model.Cliente;
import com.example.aula.repository.ClienteRepo;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/clientes")
public class controlleCliente {


        private ClienteServeci clienteServeci;

    public controlleCliente(ClienteServeci clienteServeci) {
        this.clienteServeci = clienteServeci;
    }

    @GetMapping
        public List<Cliente>listatodos(){
            return clienteServeci.listarTodos();
        }
        @PostMapping
        public ResponseEntity<Cliente> salvar(@RequestBody Cliente cliente) {
            clienteServeci.salvar(cliente);
            return ResponseEntity.status(HttpStatus.CREATED).body(cliente);
        }
    }


