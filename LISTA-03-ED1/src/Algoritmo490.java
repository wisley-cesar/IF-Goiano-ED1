import java.util.Scanner;

public class Algoritmo490 {
    public static int restantes(String vet, int tam, String x) {
        int cont = 0;
        for (int i = 0; i < tam; i++) {
            if (vet.charAt(i) == x.charAt(0)) {
                vet = vet.substring(0, i) + 'u' + vet.substring(i + 1);
                cont++;
            }
        }
        return cont;
    }
    public static void main(String[] args) {
        String[] nome = new String[10];
        int[] resultados = new int[10];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite uma palavra em letras minúsculas " + i + ": ");
            nome[i] = scanner.nextLine();
            resultados[i] = Algoritmo490.restantes(nome[i], nome[i].length(), "c");
        }

        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + " - " + nome[i]);
        }
    }
}

