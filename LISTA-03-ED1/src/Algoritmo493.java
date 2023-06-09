import java.util.Scanner;

public class Algoritmo493 {
    public static int busca(int[] vet, int tam) {
        int x;
        for (int i = 0; i < tam - 1; i++) {
            if (vet[i] < vet[i + 1]) {
                x = 0;
                return x;
            }
        }
        x = 1;
        return x;
    }


    public class BuscaL {
        public static int buscaL(int[] vet, int tam) {
            int x;
            for (int i = 0; i < tam - 1; i++) {
                if (vet[i] > vet[i + 1]) {
                    x = 0;
                    return x;
                }
            }
            x = 1;
            return x;
        }
    }

    public class VerificaOrdem {
        public static int verificaOrdem(int[] vetor, int t) {
            int r = Algoritmo493.busca(vetor, t);
            if (r == 1) {
                return 2;
            } else {
                r = BuscaL.buscaL(vetor, t);
                if (r == 1) {
                    return 1;
                } else {
                    return 0;
                }
            }
        }
    }

    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] num = new int[10];
            for (int i = 0; i < 10; i++) {
                System.out.print("Digite numero : " + (i + 1) + ": ");
                num[i] = sc.nextInt();
            }
            int c = VerificaOrdem.verificaOrdem(num, 10);
            if (c == 1) {
                System.out.println("\nORDENACAO CRESCENTE");
            } else if (c == 2) {
                System.out.println("\nORDENACAO DECRESCENTE");
            } else {
                System.out.println("\nNAO ESTA ORDENADO");
            }
        }
    }
}
