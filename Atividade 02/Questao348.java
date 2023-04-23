import java.sql.SQLOutput;
import java.util.Scanner;

public class Questao348 {
    public static void main(String[] args) {

        int L;
        String[] nomes = new String[5];
        double[] pr1 = new double[5];
        double[] pr2 = new double[5];
        double[] media = new double[5];

        Scanner sc = new Scanner(System.in);

        // entrada de dados
        for (L = 0; L <= 4; L++) {
            System.out.println("\nDigite o nome do " + (L+1) + " o aluno:");
            nomes[L] = sc.nextLine();

            System.out.println("Digite a primeira nota do " + nomes[L] + ":");
            pr1[L] = sc.nextDouble();

            System.out.println("Digite a segunda nota do " + nomes[L] + ":");
            pr2[L] = sc.nextDouble();

            media[L] = (pr1[L] + pr2[L]) / 2;

            sc.nextLine(); // limpa o buffer do teclado
        }

        // saída de dados
        System.out.println("\n\n\n\t\t\t\tRELACAO FINAL");
        for (L = 0; L <= 4; L++) {
            System.out.println("\n" + (L+1) + " - " + nomes[L]);
            System.out.println(pr1[L] + "\t" + pr2[L] + "\t" + media[L]);
        }

        System.out.println("\n");
    }
}


