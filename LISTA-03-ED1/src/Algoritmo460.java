import java.util.Scanner;

public class Algoritmo460 {
    public static  int dob(int x){
        return x *2;
    }
    public static void main(String[] args) {
        int a, c;
        for (c = 0; c < 3; c++) {
            System.out.println("\n\ndigite numero:");
            Scanner sc = new Scanner(System.in);
            a = sc.nextInt();
            System.out.println("O dobro: " + Algoritmo460.dob(a));


        }
        System.out.println("\n");
    }
}
