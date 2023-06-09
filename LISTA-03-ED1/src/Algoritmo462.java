import java.util.Scanner;

public class Algoritmo462 {
    public static double media(double x, double y, double z) {
        double ma = (x + y + z) / 3;
        return ma;
    }


    public static void main(String[] args) {
        double n1, n2, n3, m;
        Scanner sc = new Scanner(System.in);

        System.out.println("\ndigite nota 1: ");
        n1 = sc.nextDouble();

        System.out.println("\ndigite nota 2: ");
        n2 = sc.nextDouble();

        System.out.println("\ndigite nota 3: ");
        n3 = sc.nextDouble();

        m = Algoritmo462.media(n1, n2, n3);
        System.out.println("\nmedia aritimetica e " + m);
        System.out.println("\nmedia armazenada em variavavel " + m);
        System.out.println("\n");
    }
}

