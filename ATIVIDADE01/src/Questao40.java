import java.util.Scanner;

public class Questao40 {
    public static void main(String[] args) {
        int quoc, rest, val1, val2;
        Scanner valorInterio = new Scanner(System.in);
        System.out.println("entre com o dividendo: ");
        val1 = valorInterio.nextInt();
        System.out.println("entre com o divisor: ");
        val2 = valorInterio.nextInt();
        quoc = val1/val2;
        rest = val1%val2;
        System.out.println("\n\n\n");
        System.out.println("\ndividendo : "+ val1 );
        System.out.println("\ndivisor : "+ val2);
        System.out.println("\nquociente : "+ quoc);
        System.out.println("\nresto  : "+ rest);
        System.out.println("");




    }
}
