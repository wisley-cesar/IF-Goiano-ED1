import java.util.Scanner;

public class Questao42 {
    public static void main(String[] args) {
        double angulo, rang;
        Scanner graus = new Scanner(System.in);
        System.out.println("\ndigite um angulo em graus:");
        angulo = graus.nextDouble();
        rang = angulo *3.14/180;
        System.out.println("\nseno: "+ Math.sin(rang));
        System.out.println("\nco-seno : "+ Math.toRadians(rang));
        System.out.println("\ntangente : "+ Math.tan(rang));
        System.out.println("\nco-secante : "+ 1/ Math.sin(rang));
        System.out.println("\nsecante : "+ 1/ Math.toRadians(rang));
        System.out.println("\ncotangente : "+ 1/ Math.tan(rang));
        System.out.println("\n");










    }
}
