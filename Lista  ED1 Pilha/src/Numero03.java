import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Numero03 {
    public static void main(String[] args) {
        Queue<Aviao> filaDeEspera = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Listar o número de aviões aguardando na fila de decolagem");
            System.out.println("2 - Autorizar a decolagem do primeiro avião da fila");
            System.out.println("3 - Adicionar um avião à fila de espera");
            System.out.println("4 - Listar todos os aviões na fila de espera");
            System.out.println("5 - Listar as características do primeiro avião da fila");
            System.out.println("0 - Sair");

            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Número de aviões aguardando na fila de decolagem: " + filaDeEspera.size());
                    break;

                case 2:
                    if (!filaDeEspera.isEmpty()) {
                        Aviao aviao = filaDeEspera.poll();
                        System.out.println("Autorizada a decolagem do avião " + aviao.getNome() + " (ID " + aviao.getId() + ")");
                    } else {
                        System.out.println("Não há aviões na fila de espera");
                    }
                    break;

                case 3:
                    System.out.print("Digite o nome do avião: ");
                    String nome = sc.next();
                    int id = filaDeEspera.size() + 1;
                    Aviao aviao = new Aviao(id, nome);
                    filaDeEspera.offer(aviao);
                    System.out.println("Avião " + nome + " (ID " + id + ") adicionado à fila de espera");
                    break;

                case 4:
                    System.out.println("Aviões na fila de espera:");
                    for (Aviao a : filaDeEspera) {
                        System.out.println("Avião " + a.getNome() + " (ID " + a.getId() + ")");
                    }
                    break;

                case 5:
                    if (!filaDeEspera.isEmpty()) {
                        Aviao primeiroAviao = filaDeEspera.peek();
                        System.out.println("Características do primeiro avião na fila de espera:");
                        System.out.println("Nome: " + primeiroAviao.getNome());
                        System.out.println("ID: " + primeiroAviao.getId());
                    } else {
                        System.out.println("Não há aviões na fila de espera");
                    }
                    break;

                case 0:
                    System.out.println("Encerrando programa...");
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}
class Aviao {
    private int id;
    private String nome;

    public Aviao(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}

