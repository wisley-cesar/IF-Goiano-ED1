import java.util.Scanner;

public class Algoritmo485 {
    static void multivetor(int[] vetl, String[] vet2, int tam) {
        for (int i = 0; i < tam; i++) {
            System.out.println();
            for (int w = 0; w < vetl[i]; w++) {
                System.out.print(vet2[i]);
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] num = new int[6];
        String[] num1 = new String[6];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            System.out.print("Digite numero " + i + ": ");
            num[i] = sc.nextInt();
        }

        for (int i = 0; i < 6; i++) {
            System.out.print("Digite caractere " + (i + 1) + ": ");
            num1[i] = sc.next();
        }

        Algoritmo485.multivetor(num, num1, 6);
    }
}
