import java.util.Scanner;

public class Questao25 {
    public static void main(String[] args) {
        int data, dia,mes,ano;
        Scanner formatando = new Scanner(System.in);
        System.out.println("Digite  a data no formato ddmmaa ");
        data = formatando.nextInt();
        dia = data/10000;
        mes= data % 1000 /100;
        ano = data % 100;
        System.out.println("\n Dia "+dia);
        System.out.println("\n Mes "+mes);
        System.out.println("\n Ano "+ano);
        System.out.println("");





    }
}
