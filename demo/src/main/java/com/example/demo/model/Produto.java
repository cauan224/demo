package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tab_produto")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(nullable = false)
    private String nome;

    @Column(nullable = false,unique = true)
    private String precounitoario;

    public Produto(Long id, String nome, String precounitoario) {
        this.id = id;
        this.nome = nome;
        this.precounitoario = precounitoario;
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

    public String getPrecounitoario() {
        return precounitoario;
    }

    public void setPrecounitoario(String precounitoario) {
        this.precounitoario = precounitoario;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", precounitoario='" + precounitoario + '\'' +
                '}';
    }
}
