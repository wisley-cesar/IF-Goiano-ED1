import java.util.Scanner;

public class Torre {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número de discos: ");
        int numDiscos = sc.nextInt();
        sc.close();

        long inicio = System.currentTimeMillis();

        TorresDeHano.moverDiscos(numDiscos, 'A', 'C', 'B');

        long fim = System.currentTimeMillis();

        long duracao = fim - inicio;
        String tempoFormatado = String.format("%02d:%02d:%02d:%03d",
                duracao / 3600000, (duracao % 3600000) / 60000,
                (duracao % 60000) / 1000, duracao % 1000);

        System.out.println("Tempo gasto: " + tempoFormatado);
        System.out.println("Quantidade de movimentos realizados: " + ((long)Math.pow(2, numDiscos) - 1));
    }
}



