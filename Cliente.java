package org.example;

public class Cliente {
    private int ID_Cliente;
    private String nome;


    public Cliente(int ID_Cliente, String nome) {
        this.ID_Cliente = ID_Cliente;
        this.nome = nome;

    }

    public void exibirDados() {
        System.out.println("Cliente- ID = " + ID_Cliente + ", Nome = " + nome);
    }



}
