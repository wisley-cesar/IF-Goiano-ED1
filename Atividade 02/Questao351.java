import java.util.Scanner;

public class Questao351 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        String[] nomes = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("\nnome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }
        System.out.print("\nDigite o numero da pessoa: ");
        num = scanner.nextInt();
        while (num < 1 || num > 5) {
            System.out.print("Numero invalido, digite novamente: ");
            num = scanner.nextInt();
        }
        System.out.println("O nome da pessoa na posicao " + num + " e " + nomes[num - 1]);

    }
}