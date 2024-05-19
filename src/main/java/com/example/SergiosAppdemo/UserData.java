package com.example.SergiosAppdemo;


public class UserData {
    public UserData(String nome, String provincia) {
        this.nome = nome;
        this.provincia = provincia;
        this.outPut = "Ciao" + " " + getNome() + " , " + "Com'e il tempo in " + getProvincia() + "?";
    }

    private String nome;
    private String provincia;
    public String outPut;

    public String getNome() {
        return nome;
    }

    public String getProvincia() {
        return provincia;
    }
}
