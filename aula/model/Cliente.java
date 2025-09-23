package com.example.aula.model;

import jakarta.persistence.*;
@Entity
@Table(name = "tab_cliente")
public class Cliente {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(nullable = false)
        private String nome;
        @Column(nullable = false)
        private String dataNascimento;
        @Column(nullable = false, unique = true)
        private String protocolo;

        public Cliente() {
        }

    public Cliente(Long id, String nome, String dataNascimento, String protocolo) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.protocolo = protocolo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(String protocolo) {
        this.protocolo = protocolo;
    }
}

