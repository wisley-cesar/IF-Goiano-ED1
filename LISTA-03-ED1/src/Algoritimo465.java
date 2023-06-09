import java.util.Scanner;

public class Algoritimo465 {
    public static void verificaMaiorNumero(int num1, int num2) {
        if (num1 > num2) {
            System.out.println("O número " + num1 + " é maior que " + num2);
        } else {
            System.out.println("O número " + num2 + " é maior que " + num1);
        }


    }


    public static void main(String[] args) {

        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero 1:");
        num1 = sc.nextInt();
        System.out.println("Digite o numero 2:");
        num2 = sc.nextInt();

        Algoritimo465.verificaMaiorNumero(num1, num2);
    }
}
