package com.example.demo2.model;

public enum Setor {
    ENGENHEIORO ("Engenharia"),
    SAUDE("Saúde"),
    JURIDICO("Jurídico"),;

    private String Texto;

    Setor(String texto) {
        Texto = texto;
    }

    public String getTexto() {
        return Texto;
    }
}
