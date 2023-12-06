package org.example;

public class Banco {
    private int ID_Banco;
    private String nome;
    private String endereco;


    public Banco(int ID_Banco, String nome, String endereco) {
        this.ID_Banco = ID_Banco;
        this.nome = nome;
        this.endereco = endereco;

    }

    public void exibirDados() {
        System.out.println("Banco- ID = " + ID_Banco + ", Nome = " + nome + ", Endereço = " + endereco);
    }



}
