import java.util.Scanner;
import java.util.Stack;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a expressão matemática: ");
        String expressao = scanner.nextLine();

        if (verificarParametrizacao(expressao)) {
            System.out.println("Expressão correta.");
        } else {
            System.out.println("Expressão incorreta.");
        }
    }

    public static boolean verificarParametrizacao(String expressao) {
        Stack<Character> pilha = new Stack<>();

        for (int i = 0; i < expressao.length(); i++) {
            char caractere = expressao.charAt(i);

            if (caractere == '(' || caractere == '[' || caractere == '{') {
                pilha.push(caractere);
            } else if (caractere == ')' || caractere == ']' || caractere == '}') {
                if (pilha.isEmpty()) {
                    return false; // Fechamento sem abertura correspondente
                } else {
                    char topo = pilha.pop();
                    if ((caractere == ')' && topo != '(') ||
                            (caractere == ']' && topo != '[') ||
                            (caractere == '}' && topo != '{')) {
                        return false; // Fechamento não corresponde à abertura
                    }
                }
            }
        }

        return pilha.isEmpty(); // Verifica se todas as aberturas foram fechadas
    }
}

