import java.util.Scanner;
import java.util.Stack;
public class Numero02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a chave do item a ser removido: ");
        int pilha = sc.nextInt();

        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(2);
        stack.push(8);
        stack.push(1);
        stack.push(9);

        Stack<Integer> Stack = new Stack<>();

        while (!stack.empty()) {
            int item = stack.pop();
            if (item != pilha) {
                Stack.push(item);
            }
        }

        while (!Stack.empty()) {
            stack.push(Stack.pop());
        }

        System.out.println("Pilha original após a remoção: " + stack);
    }
}