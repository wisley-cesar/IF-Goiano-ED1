import java.util.Scanner;

public class Questao46 {
    public static void main(String[] args) {
        double saldo, nsaldo;
        Scanner saldoDeAplicacao = new Scanner(System.in);
        System.out.println("\ndigite saldo:");
        saldo = saldoDeAplicacao.nextDouble();
        nsaldo = saldo * 1.01;
        System.out.println("\nnovo saldo:" + nsaldo);
        System.out.println("\n");
    }





}
