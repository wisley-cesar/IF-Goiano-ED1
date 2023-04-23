import java.util.Scanner;
import java.util.Stack;
public class Numero01 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite uma sequência de caracteres: ");
    String sequencia = sc.nextLine();

    // operação de imprimir o texto na ordem inversa
    Stack<Character>stack = new Stack<>();
    for (int i = 0 ; i <sequencia.length();i++){
        stack.push(sequencia.charAt(i));
    }
    System.out.println("Texto na ordem inversa: ");
    while (!stack.empty()) {
        System.out.print(stack.pop());

    }
    System.out.println();
    // Operação de verificar se o texto é um palíndromo
    sequencia = sequencia.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    stack.clear();
    for (int i = 0; i < sequencia.length(); i++) {
        stack.push(sequencia.charAt(i));
    }
    String reversed = "";
    while (!stack.empty()) {
        reversed += stack.pop();
    }
    if (sequencia.equals(reversed)) {
        System.out.println("A sequência é um palíndromo. ");
    } else {
        System.out.println("A sequência não é um palíndromo.");
    }
}
}
