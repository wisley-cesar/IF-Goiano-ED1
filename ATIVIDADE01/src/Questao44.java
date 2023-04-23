import java.util.Scanner;

public class Questao44 {
    public static void main(String[] args) {
        double num, base, logaritmo;
        Scanner calcularAlgaritimo = new Scanner(System.in);
        num = calcularAlgaritimo.nextDouble();
        System.out.println("\n entre com a base :");
        base = calcularAlgaritimo.nextDouble();
        logaritmo = Math.log(num)/Math.log(base);
        System.out.println("\n logaritmo deb"+ num + "bna baseb"+"be:b"+logaritmo );
        System.out.println("\n");
    }
}
