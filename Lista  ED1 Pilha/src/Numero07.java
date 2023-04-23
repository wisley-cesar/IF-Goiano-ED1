import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class Numero07 {
    public static void inverterFila(Queue<Integer> fila) {
        Stack<Integer> pilha = new Stack<>();

        // Empilhar todos os elementos da fila na pilha
        while (!fila.isEmpty()) {
            pilha.push(fila.remove());
        }

        // Desempilhar todos os elementos da pilha de volta para a fila
        while (!pilha.isEmpty()) {
            fila.add(pilha.pop());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<>();

        // Preencher a fila com valores aleatórios
        for (int i = 0; i < 20; i++) {
            fila.add((int) (Math.random() * 100));
        }

        System.out.println("Fila antes da inversão: " + fila);

        inverterFila(fila);

        System.out.println("Fila depois da inversão: " + fila);
    }
}

