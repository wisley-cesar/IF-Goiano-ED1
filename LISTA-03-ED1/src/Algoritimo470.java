import java.util.Scanner;

public class Algoritimo470 {
    public static int primo(int n) {
        int c = 0, p = 2;
        while (c == 0 && p <= n / 2) {
            if (n % p == 0) {
                c = 1;
            }
            p++;
        }
        return c;
    }


    public static void main(String[] args) {
        int num, pri;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número > 0:");
        num = sc.nextInt();
        pri = Algoritimo470.primo(num);

        if (pri == 0) {
            System.out.println(num + " é primo.");
        } else {
            System.out.println(num + " não é primo.");
        }
    }
}




