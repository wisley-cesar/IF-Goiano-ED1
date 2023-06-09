import java.util.Scanner;

public class Algoritmo497 {

    public static void ordena(int[] vet, int tam) {
        for (int i = 0; i < tam - 1; i++) {
            for (int j = i + 1; j < tam; j++) {
                if (vet[i] > vet[j]) {
                    int temp = vet[i];
                    vet[i] = vet[j];
                    vet[j] = temp;
                }
            }
        }
    }

    public class Busca {
        public static int busca(int[] vet, int tam, int chave) {
            int inicio = 0, fim = tam - 1;
            while (inicio <= fim) {
                int meio = (inicio + fim) / 2;
                if (chave == vet[meio]) {
                    return meio;
                } else if (chave < vet[meio]) {
                    fim = meio - 1;
                } else {
                    inicio = meio + 1;
                }
            }
            return -1;
        }
    }

    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] num = new int[10];
            int n, c;
            System.out.println("Digite 10 numeros:");
            for (int i = 0; i < 10; i++) {
                System.out.print("Digite o " + (i + 1) + "o numero: ");
                num[i] = sc.nextInt();
            }
            System.out.print("Digite o numero de busca: ");
            n = sc.nextInt();
            Algoritmo497.ordena(num, 10);
            c = Busca.busca(num, 10, n);
            System.out.println("\nVETOR ORDENADO:");
            for (int i = 0; i < 10; i++) {
                System.out.println((i + 1) + " - " + num[i]);
            }
            if (c >= 0) {
                System.out.println("\nPosicao no vetor: " + (c + 1));
            } else {
                System.out.println("\nNao encontrado");
            }
        }
    }
}

