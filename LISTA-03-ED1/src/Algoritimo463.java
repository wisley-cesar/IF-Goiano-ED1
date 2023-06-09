import java.util.Scanner;

public class Algoritimo463 {
    public static double radiano(double rang) {
        double p1 = Math.PI;
        rang = rang * p1 / 180;
        return rang;
    }
    public static void main(String[] args) {

        double ang, r;
        Scanner sc = new Scanner(System.in);

        System.out.println("\nDigite o angulo em graus: ");
        ang = sc.nextDouble();

        r= Algoritimo463.radiano(ang);
        System.out.println("\nGraus: " + ang + " radianos: " + r);
        System.out.println("\n");
    }
}
