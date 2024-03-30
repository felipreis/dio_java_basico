import java.util.Scanner;
import java.util.Locale;


public class ContaTerminal {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int numero;
        String agencia,nomeCliente;
        double saldo;

        System.out.println("Por Favor digite o número da agência:");
        numero = scanner.nextInt();

        System.out.println("Por Favor digite o nome do cliente:");
        scanner.nextLine();
        nomeCliente  = scanner.nextLine();

        System.out.println("Por Favor digite a agência:");
        agencia = scanner.next();

        System.out.println("Por Favor digite o saldo:");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente +  " obrigado por criar uma conta em nosso banco, sua agência é " + agencia +  " conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");





    }
}
