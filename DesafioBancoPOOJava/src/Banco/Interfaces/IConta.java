package Banco.Interfaces;

public interface IConta {

    void sacar(double valor);
    void depositar(double valor);
    void transfererir(double valor, IConta contaDestino);
    void imprimirExtrato();
    int getNumeroConta();
    int getAgencia();
    double getSaldo();
}
