import java.util.Scanner;

public class Algoritmo480 {
    public static int reverso(int num) {
        int soma = 0, r;
        while (num != 0) {
            r = num % 10;
            soma = soma * 10 + r;
            num = num / 10;
        }
        return soma;
    }
    public static void main(String[] args) {
        int n, x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        n = sc.nextInt();
        x = Algoritmo480.reverso(n);
        System.out.println(n + " - " + x);
        if (x == n) {
            System.out.println("É um número capicua.");
        } else {
            System.out.println("Não é um número capicua.");
        }
    }
}

