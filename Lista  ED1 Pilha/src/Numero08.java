import java.util.Random;
import java.util.Stack;
public class Numero08 {
    public static void main(String[] args) {
        Stack<Integer> p = new Stack<>(); // Pilha para números positivos
        Stack<Integer> n = new Stack<>(); // Pilha para números negativos
        Random random = new Random();

        // Sortear 1000 números aleatórios entre -100 e 100
        for (int i = 0; i < 1000; i++) {
            int numero = random.nextInt(201) - 100; // Gera números entre -100 e 100

            if (numero > 0) {
                p.push(numero); // Inserir na pilha de positivos
            } else if (numero < 0) {
                n.push(numero); // Inserir na pilha de negativos
            } else if (!p.isEmpty() && !n.isEmpty()) {
                // Se for zero, retirar um elemento de cada pilha e imprimir
                System.out.println(p.pop() + ", " + n.pop());
            }
        }
    }
}
