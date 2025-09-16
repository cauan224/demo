package com.example.demo2.model;

import jakarta.persistence.*;

import java.util.UUID;


@Entity
@Table(name="tab_endereco")
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)


    private UUID uuid;
    @Column(nullable = false)
    private String logradouro;
    @Column(nullable = false)
    private String numero;
    @Column (nullable = false)
    private String complemento;
    @Column (nullable = false)
    private String cidade;
    @Column (nullable = false)
    private String cep;
    @Column (nullable = false)
    private String uf;
    public Endereco() {
    }

    public Endereco(UUID uuid, String logradouro, String numero, String complemento, String cidade, String cep, String uf) {
        this.uuid = uuid;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cidade = cidade;
        this.cep = cep;
        this.uf = uf;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
}

