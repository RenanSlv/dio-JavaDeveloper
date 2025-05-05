package Banco.Contas;

public class ContaPoupanca extends Conta{

    public void imprimirExtrato(){
        System.out.printf("===== CONTA POUPANÇA =====\n");
        super.imprimirInformacoesComuns();
        super.imprimirHistoricoTransacoes();
    }

}
