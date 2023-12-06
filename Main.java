package org.example;

public class Main {
    public static void main(String[] args) {
        Banco banco1 = new Banco(1, "Bradesco", "Rua agamenon, 534");
        Cliente cliente1 = new Cliente(1, "João");
        AgenciaFisica agencia1 = new AgenciaFisica(101, "Agência cordeiro");
        Conta conta1 = new Conta(1001, 1231, 101);
        Funcionario funcionario1 = new Funcionario(10001, "Pedro");

        Banco banco2 = new Banco(3, "Itau", "Rua torta, 227");
        Cliente cliente2 = new Cliente(1, "Iuri");
        AgenciaFisica agencia2 = new AgenciaFisica(101, "Agência norteWay");
        Conta conta2 = new Conta(1453, 632, 176);
        Funcionario funcionario2 = new Funcionario(10886, "Alex");

        banco1.exibirDados();
        cliente1.exibirDados();
        agencia1.exibirDados();
        conta1.exibirDados();
        funcionario1.exibirDados();

        banco2.exibirDados();
        cliente2.exibirDados();
        agencia2.exibirDados();
        conta2.exibirDados();
        funcionario2.exibirDados();




    }
}