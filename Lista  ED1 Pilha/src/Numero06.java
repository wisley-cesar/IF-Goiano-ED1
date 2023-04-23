import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;
public class Numero06 {
    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<>();
        Stack<Integer> pilha = new Stack<>();

        // Gerando 1000 números aleatórios positivos e 1000 números aleatórios negativos
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            fila.offer(random.nextInt(1000)); // números positivos
            fila.offer(random.nextInt(1000) * -1); // números negativos
        }

        // Processando a fila e a pilha
        while (!fila.isEmpty()) {
            int numero = fila.poll();
            if (numero >= 0) { // se for um número positivo
                pilha.push(numero);
            } else { // se for um número negativo
                if (!pilha.isEmpty()) { // se a pilha não estiver vazia
                    int topo = pilha.pop();
                    System.out.println("Número retirado da pilha: " + topo);
                } else {
                    System.out.println("A pilha está vazia!");
                }
            }
        }
    }
}

