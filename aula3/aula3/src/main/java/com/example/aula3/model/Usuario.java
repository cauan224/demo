package com.example.aula3.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "tab_usuario")
public class Usuario {
    @Id @GeneratedValue (strategy = GenerationType.UUID)
    private UUID id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false,unique = true)
    private String email;


    @Column(nullable = false)
    private String senha;

//
//    public Usuario() {
//    }
//
//    public Usuario(UUID id, String nome, String email, String senha) {
//        this.id = id;
//        this.nome = nome;
//        this.email = email;
//        this.senha = senha;
//    }
//
//    public UUID getId() {
//        return id;
//    }
//
//    public void setId(UUID id) {
//        this.id = id;
//    }
//
//    public String getNome() {
//        return nome;
//    }
//
//    public void setNome(String nome) {
//        this.nome = nome;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getSenha() {
//        return senha;
//    }
//
//    public void setSenha(String senha) {
//        this.senha = senha;
//    }
}

