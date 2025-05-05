package Banco;

import Banco.Contas.Conta;
import Banco.Contas.ContaCorrente;
import Banco.Contas.ContaPoupanca;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String nome;
    private String cpf;
    private List<Conta> contas = new ArrayList<>();

    public Cliente(String nome, String cpf){
        this.nome = nome;

        if(isCpfValido(cpf)){
            this.cpf = cpf;
        }
        else{
            throw new IllegalArgumentException("CPF inválido. Não foi possivel criar o usuário.");
        }
    }

    // Método para validar o CPF
    public boolean isCpfValido(String cpf) {
        // Verifica se o CPF tem exatamente 11 dígitos e se todos os caracteres são números
        if (cpf == null || cpf.length() != 11) {
            return false;
        }

        // Verifica se todos os caracteres são números
        for (int i = 0; i < cpf.length(); i++) {
            if (!Character.isDigit(cpf.charAt(i))) {
                return false;
            }
        }

        // CPF válido
        return true;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCpf(){
        return this.cpf;
    }

    @Override
    public String toString(){
        return "====================\n" +
               "Nome: " + this.nome + "\nCPF: " + this.cpf +
               "\n====================";
    }

    public void criarConta(String tipoDeConta) {
        Conta conta = null;
        if ("CORRENTE".equalsIgnoreCase(tipoDeConta)) {
            conta = new ContaCorrente();
        } else if ("POUPANCA".equalsIgnoreCase(tipoDeConta)) {
            conta = new ContaPoupanca();
        }

        if (conta == null) {
            System.out.println("\nErro: Tipo de conta inválido. Não foi possível criar a conta.");
        } else {
            this.contas.add(conta);
            System.out.println("\nConta " + tipoDeConta.toLowerCase() + " criada com sucesso!");
        }

    }

    public void listarContas(){
        System.out.println(this.toString());
        if(contas.isEmpty())
            System.out.printf("============\n"+"O Cliente ainda não possui uma conta."+"\n============\n");
        for(Conta conta : this.contas){
            conta.imprimirExtrato();
        }
    }

    public Conta getConta(int numeroConta) {
        for (Conta conta : contas) {
            if (conta.getNumeroConta() == numeroConta) {
                return conta;
            }
        }
        return null;  // Caso não exista o numero da conta
    }



}
