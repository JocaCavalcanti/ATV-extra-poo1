package org.example;

public class Funcionario {
    private int ID_Funcionario;
    private String nome;


    public Funcionario(int ID_Funcionario, String nome) {
        this.ID_Funcionario = ID_Funcionario;
        this.nome = nome;

    }

    public void exibirDados() {
        System.out.println("Funcionário- ID = " + ID_Funcionario + ", Nome = " + nome);
    }




}
