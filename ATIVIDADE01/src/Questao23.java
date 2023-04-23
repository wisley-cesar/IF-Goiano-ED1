import java.util.Scanner;

public class Questao23 {
    public static void main(String[] args) {
        Scanner algarismo = new Scanner(System.in);
        System.out.println("digite um numero com 3 algarismo");
        int a = algarismo.nextInt();
        int b;
        b = (a % 100) / 10;
        algarismo.close();
        System.out.println("algarismo da casa das deszenas:"+b);
        System.out.println("");



    }
}