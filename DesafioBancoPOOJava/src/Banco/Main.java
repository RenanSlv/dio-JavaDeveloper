package Banco;

import Banco.Contas.Conta;

public class Main {
    public static void main(String[] args){
        Banco banco = new Banco();
        Cliente cliente1 = new Cliente("Maria", "12345678912");
        Cliente cliente2 = new Cliente("João", "98765432112");

        banco.adicionarCliente(cliente1);
        banco.adicionarCliente(cliente2);
        banco.listarTodosOsClientes();

        cliente1.criarConta("corrente");
        cliente1.criarConta("poupanca");
        cliente1.listarContas();

        Conta contaPoupancaMaria = cliente1.getConta(2);
        Conta contaCorrenteMaria = cliente1.getConta(1);
        contaPoupancaMaria.depositar(15000);
        contaPoupancaMaria.transfererir(3000,contaCorrenteMaria);
        contaCorrenteMaria.sacar(2000);
        cliente1.listarContas();

        cliente2.criarConta("investimento");
        cliente2.criarConta("corrente");

        Conta contaCorrenteJoao = cliente2.getConta(3);
        contaCorrenteJoao.depositar(25000);
        contaCorrenteJoao.transfererir(5000, contaCorrenteMaria);
        contaCorrenteJoao.sacar(2500);
        cliente2.listarContas();

        cliente1.listarContas();
        cliente2.listarContas();

    }
}
