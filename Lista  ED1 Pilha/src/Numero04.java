import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
public class Numero04 {
    public static void main(String[] args) {
        Queue<Integer> filaF1 = new LinkedList<>();
        Queue<Integer> filaF2 = new LinkedList<>();

        // Populando a fila F1 com 100 números aleatórios entre 1 e 100
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int numero = random.nextInt(100) + 1;
            filaF1.offer(numero);
        }

        // Invertendo a fila F1 e armazenando na fila F2
        while (!filaF1.isEmpty()) {
            filaF2.offer(filaF1.poll());
        }

        // Imprimindo a fila F2 com os elementos invertidos
        System.out.println("Fila F2 (ordem invertida):");
        while (!filaF2.isEmpty()) {
            System.out.print(filaF2.poll() + " ");
        }
    }
}


