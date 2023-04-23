import java.util.Scanner;

public class Questao48 {
    public static void main(String[] args) {
        double sm, qtdade, preco, vp, vd;
        Scanner quilowatts = new Scanner(System.in);
        System.out.println("\nentre com o salario minimo:");
        sm = quilowatts.nextDouble();
        System.out.println("\nentre com a quantidade em quilowatt");
        qtdade = quilowatts.nextDouble();
        //divide por 7 para achar o preco de 100kw e por 100 para achar de 1 kw
        preco = sm/700;
        vp = preco * qtdade;
        vd = vp * 0.9;
        System.out.println("\npreco do quilowatt:"+ preco + "\n valor a ser pago: "+vp);
        System.out.println("\n valor com desconto:"+vd);
        System.out.println("\n");
    }
}
