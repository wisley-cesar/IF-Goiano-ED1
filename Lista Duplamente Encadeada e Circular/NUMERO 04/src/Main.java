public class Main {
    public static void main(String[] args) {
        ListaEncadeada list = new ListaEncadeada();

        // (a) Insira os números de 1 a 5 na lista.
        for (int i = 1; i <= 5; i++) {
            list.insert(i);
        }

        // (b) Exiba os elementos da lista.
        System.out.println("Elementos da lista:");
        list.display();

        // (c) Remova o número 3 da lista.
        list.delete(3);

        // (d) Exiba os elementos da lista novamente.
        System.out.println("Elementos da lista após remover o número 3:");
        list.display();

        // (e) Insira o número 10 na lista.
        list.insert(10);

        // (f) Exiba os elementos da lista novamente.
        System.out.println("Elementos da lista após inserir o número 10:");
        list.display();
    }
}