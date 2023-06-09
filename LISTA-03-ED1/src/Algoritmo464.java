import java.util.Scanner;

public class Algoritmo464 {
    public static  double graus(double gang){

        double p1 = Math.PI;
        gang = gang * 180/ p1;
        return  gang;

    }

    public static void main(String[] args) {

        double ang, g;
        Scanner sc = new Scanner(System.in);

        System.out.println("\nDigite angulo em radianos: ");
        ang = sc.nextDouble();

        g = Algoritmo464.graus(ang);
        System.out.println("\nradianos: "+ ang + " graus " + g);
        System.out.println("\n");
    }
}
