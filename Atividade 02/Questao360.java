import java.util.Scanner;

public class Questao360 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] ultDia = {20, 19, 20, 20, 20, 20, 21, 22, 22, 22, 21, 21};
        String[] signo = {"Capricórnio", "Aquário", "Peixes", "Áries", "Touro", "Gêmeos", "Câncer", "Leão", "Virgem", "Libra", "Escorpião", "Sagitário"};

        System.out.print("Digite a data no formato ddmm ou 9999 para terminar: ");
        int data = input.nextInt();

        while (data != 9999) {
            int dia = data / 100;
            int mes = data % 100 - 1;

            if (dia > ultDia[mes]) {
                mes = (mes + 1) % 12;
            }

            System.out.println("Signo: " + signo[mes]);

            System.out.print("\nDigite a data no formato ddmm ou 9999 para terminar: ");
            data = input.nextInt();
        }
    }
}
