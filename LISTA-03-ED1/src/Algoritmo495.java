import java.util.Scanner;

public class Algoritmo495 {
    public static void ordena(String[] vet) {
        int tam = vet.length;
        String aux;
        for (int i = 0; i < tam - 1; i++) {
            for (int j = i + 1; j < tam; j++) {
                if (vet[i].compareToIgnoreCase(vet[j]) > 0) {
                    aux = vet[i];
                    vet[i] = vet[j];
                    vet[j] = aux;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nome = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite nome " + (i + 1) + ": ");
            nome[i] = sc.nextLine();
        }

        Algoritmo495.ordena(nome);

        System.out.println("\n\nNOMES ORDENADOS\n");
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + " - " + nome[i]);
        }
    }
}

