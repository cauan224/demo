package com.example.demo2.model;

import jakarta.persistence.*;

import java.util.UUID;


@Entity
    @Table(name = "funcionarios")
    public class Funcionariol {
    @Id
    @GeneratedValue
        private UUID uuid;
    @Column(nullable = false)
        private String nome;
    @Column(nullable = false)
        private String email;
    @Column(nullable = false)
    private String cpf;
    @Column(nullable = false)
    private String telefone;
    @Column(nullable = false)
    private String RG;
    @Column(nullable = false)
    private Sexo sexo;
    @Column(nullable = false)
    private String dataNascimento;
    @Enumerated(EnumType.STRING)
        private Setor setor;

    @OneToOne(cascade = CascadeType.ALL)
        private Endereco endereco;

    public Funcionariol() {
    }

    public Funcionariol(UUID uuid, String nome, String email, String cpf, String telefone, String RG, Sexo sexo, String dataNascimento, Setor setor, Endereco endereco) {
        this.uuid = uuid;
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.telefone = telefone;
        this.RG = RG;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.setor = setor;
        this.endereco = endereco;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}


