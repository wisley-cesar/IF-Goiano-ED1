
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o valor de m: ");
        int m = scanner.nextInt();

        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 20; i >= 1; i--) {
            stack.push(i);
        }

        int count = 1;
        while (stack.size() > 1) {
            int num = stack.pop();
            if (count % m != 0) {
                stack.insertElementAt(num, 0);
            }
            count++;
        }

        System.out.println("A pessoa sobrevivente é a número " + stack.pop());
    }
}