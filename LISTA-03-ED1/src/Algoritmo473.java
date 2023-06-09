import java.util.Scanner;

public class Algoritmo473 {
    public static int maiuscula(String letra) {
        if (!letra.equals("A") && !letra.equals("a") && !letra.equals("E") && !letra.equals("e")
                && !letra.equals("I") && !letra.equals("i") && !letra.equals("O") && !letra.equals("o")
                && !letra.equals("U") && !letra.equals("u")) {
            return 1;
        } else {
            return 0;
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String c;
        int x;

        System.out.print("\nDigite letra: ");
        c = sc.nextLine();

        x = Algoritmo473.maiuscula(c);

        if (x == 1) {
            System.out.println("\nÉ uma consoante.");
        } else {
            System.out.println("\nNão é uma consoante.");
        }
    }
}

