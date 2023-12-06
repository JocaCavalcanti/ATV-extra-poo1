package org.example;

public class Conta {
    private int ID_Conta;
    private int ID_Cliente;
    private int ID_Agencia;


    public Conta(int ID_Conta, int ID_Cliente, int ID_Agencia) {
        this.ID_Conta = ID_Conta;
        this.ID_Cliente = ID_Cliente;
        this.ID_Agencia = ID_Agencia;

    }

    public void exibirDados() {
        System.out.println("Cont-: ID = " + ID_Conta + ", ID Cliente = " + ID_Cliente + ", ID Agência = " + ID_Agencia);
    }


}