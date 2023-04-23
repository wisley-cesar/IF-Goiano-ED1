import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

public class Numero05 {
    public static void main(String[] args) {
        Queue<Integer> filaF = new LinkedList<>();
        Stack<Integer> pilhaP = new Stack<>();

        // Gerando 1000 números aleatórios entre 1 e 2000
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            int numero = random.nextInt(2000) + 1;
            if (!filaF.contains(numero)) {
                filaF.offer(numero);
            } else {
                pilhaP.push(numero);
            }
        }

        // Imprimindo a fila F
        System.out.println("Fila F:");
        while (!filaF.isEmpty()) {
            System.out.print(filaF.poll() + " ");
        }

        // Imprimindo a pilha P
        System.out.println("\nPilha P:");
        while (!pilhaP.isEmpty()) {
            System.out.print(pilhaP.pop() + " ");
        }
    }
}

