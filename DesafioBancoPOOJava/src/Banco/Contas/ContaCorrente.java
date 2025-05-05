package Banco.Contas;

public class ContaCorrente extends Conta {

    public void imprimirExtrato(){
        System.out.printf("===== CONTA CORRENTE =====\n");
        super.imprimirInformacoesComuns();
        super.imprimirHistoricoTransacoes();
    }

}
