import java.util.Scanner;

public class Questao41 {
    public static void main(String[] args) {
        double a, b,c, d, mp;
        Scanner Numeros = new Scanner(System.in);
        System.out.println("\nentre com 1 numero");
        a = Numeros.nextDouble();
        System.out.println("\nentre com 2 numero");
        b = Numeros.nextDouble();
        System.out.println("\nentre com 3 numero");
        c = Numeros.nextDouble();

        System.out.println("\nentre com 4 numero");
        d = Numeros.nextDouble();
        mp = ((a*1 + b*2 + c*3 + d*4)/10);
        System.out.println("\nmedia ponderada: "+ mp);
        System.out.println("\n");







    }
}
