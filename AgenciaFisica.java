package org.example;

public class AgenciaFisica {
    private int ID_Agencia;
    private String nome;


    public AgenciaFisica(int ID_Agencia, String nome) {
        this.ID_Agencia = ID_Agencia;
        this.nome = nome;

    }

    public void exibirDados() {
        System.out.println("Agência- ID = " + ID_Agencia + ", Nome = " + nome);
    }




}