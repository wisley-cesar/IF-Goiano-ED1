import java.util.*;
public class SorteioPilha {
    public static void main(String[] args) {
        // Sorteio dos números da Fase 1
        List<Integer> numerosSorteadosFase1 = sortearNumeros(1, 9, 100);

        // Criação das pilhas da Fase 1
        Stack<Integer> pilha1 = new Stack<>();
        Stack<Integer> pilha2 = new Stack<>();
        Stack<Integer> pilha3 = new Stack<>();

        // Preenchimento das pilhas da Fase 1
        for (Integer numero : numerosSorteadosFase1) {
            if (numero >= 1 && numero <= 3)
                pilha1.push(numero);
            else if (numero >= 4 && numero <= 6)
                pilha2.push(numero);
            else if (numero >= 7 && numero <= 9)
                pilha3.push(numero);
        }

        // Sorteio dos números da Fase 2
        List<Integer> numerosSorteadosFase2 = sortearNumeros(1, 3, 100);

        // Execução da Fase 2
        for (Integer numero : numerosSorteadosFase2) {
            if (!pilha1.isEmpty() && !pilha2.isEmpty() && !pilha3.isEmpty()) {
                Stack<Integer> pilhaEscolhida;
                if (numero == 1)
                    pilhaEscolhida = pilha1;
                else if (numero == 2)
                    pilhaEscolhida = pilha2;
                else
                    pilhaEscolhida = pilha3;

                Integer numeroTopo1 = pilha1.isEmpty() ? null : pilha1.peek();
                Integer numeroTopo2 = pilha2.isEmpty() ? null : pilha2.peek();
                Integer numeroTopo3 = pilha3.isEmpty() ? null : pilha3.peek();

                System.out.println("Empilhando os números " + numeroTopo1 + " e " + numeroTopo2 + " na pilha " + numero);

                pilhaEscolhida.push(numeroTopo1);
                pilhaEscolhida.push(numeroTopo2);

                pilha1.pop();
                pilha2.pop();
            } else {
                break;
            }
        }

        // Impressão das pilhas
        System.out.println("Pilha 1:\tPilha 2:\tPilha 3:");
        while (!pilha1.isEmpty() || !pilha2.isEmpty() || !pilha3.isEmpty()) {
            Integer num1 = pilha1.isEmpty() ? null : pilha1.pop();
            Integer num2 = pilha2.isEmpty() ? null : pilha2.pop();
            Integer num3 = pilha3.isEmpty() ? null : pilha3.pop();
            System.out.printf("%-4s\t\t%-4s\t\t%-4s%n", num1, num2, num3);
        }

        System.out.println("O programa foi encerrado porque a pilha 3 está vazia");
    }

    // Método para sortear números
    public static List<Integer> sortearNumeros(int min, int max, int quantidade) {
        List<Integer> numeros = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < quantidade; i++) {
            int numeroSorteado = random.nextInt(max - min + 1) + min;
            numeros.add(numeroSorteado);
        }

        return numeros;
    }
}
