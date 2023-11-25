package org.example;

public class Formiga {

    private String nome;
    private int identificador;
    private String especie;

    public Formiga(String nome, int identificador, String especie) {
        this.nome = nome;
        this.identificador = identificador;
        this.especie = especie;
    }

    public String getNome() {
        return nome;
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getEspecie() {
        return especie;
    }


}
