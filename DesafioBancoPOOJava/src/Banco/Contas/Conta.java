package Banco.Contas;

import Banco.Cliente;
import Banco.Interfaces.IConta;

import java.util.ArrayList;
import java.util.List;

public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL_CONTA_CORRENTE = 1;
    private List<Transacao> historicoTransacoes;

    protected int agencia;
    protected int numeroConta;
    protected double saldo = 0;

    public Conta(){
        this.agencia = AGENCIA_PADRAO;
        this.numeroConta = SEQUENCIAL_CONTA_CORRENTE++;
        this.historicoTransacoes = new ArrayList<>();
    }

    public void sacar(double valor){
        if(valor <= 0){
            System.out.printf("Erro ao fazer saque. Valor digitado menor ou igual a 0. ");
        }
        else if(this.saldo < valor){
            System.out.printf("Erro ao fazer saque. Saldo insuficiente.");
        }
        else {
            this.saldo -= valor;
            Transacao transacao = new Transacao("Saque", valor);
            historicoTransacoes.add(transacao);
        }
    }

    public void depositar(double valor){
        if(valor > 0) {
            this.saldo += valor;
            Transacao transacao = new Transacao("Depósito", valor);
            historicoTransacoes.add(transacao);
        }
        else{
            System.out.println("\nValor de depósito inválido.");
        }
    }

    public void transfererir(double valor, IConta contaDestino){
        if (contaDestino == null) {
            System.out.printf("Conta para depósito não existe.");
        } else if (this.saldo >= valor) {
            contaDestino.depositar(valor);
            this.saldo -= valor;

            String numeroContaDestino = String.valueOf(contaDestino.getNumeroConta());
            String descricaoTransacao = "Transferência de Conta " + this.numeroConta + " para Conta " + numeroContaDestino;

            Transacao transacao = new Transacao(descricaoTransacao, valor);
            historicoTransacoes.add(transacao);
        }
    }

    public int getAgencia(){
        return agencia;
    }

    public int getNumeroConta(){
        return numeroConta;
    }

    public double getSaldo(){
        return saldo;
    }

    protected void imprimirInformacoesComuns(){
        System.out.printf("Agencia: %d \n" +
                        "Numero da Conta: %d \n" +
                        "Saldo: %.2f \n",
                this.agencia, this.numeroConta, this.saldo);
    }
    protected void imprimirHistoricoTransacoes() {
        if (historicoTransacoes.isEmpty()) {
            System.out.println("Não há transações para exibir.");
        } else {
            System.out.println("============================\n"+"Histórico de Transações da Conta: " + this.numeroConta + "\n============================");
            for (Transacao transacao : historicoTransacoes) {
                System.out.println(transacao);
            }
        }
    }

}
