import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o numero da Conta: ");
        int numeroConta = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite o numero da Agencia: ");
        String numeroAgencia = sc.nextLine();

        System.out.println("Digite o seu Nome Completo: ");
        String nomeCompletoUsuario = sc.nextLine();

        System.out.println("Digite o Saldo: ");
        double saldo = sc.nextDouble();

        System.out.println(String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s," +
                " conta %d e seu saldo %.2f já está disponível para saque.",
                nomeCompletoUsuario, numeroAgencia, numeroConta, saldo));


    }
}
