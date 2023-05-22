public class Main {
    public static void main(String[] args) {
        ListaEncadeada list = new ListaEncadeada();

        list.addFinal(10);
        list.addFinal(20);
        list.addFinal(30);
        list.addFinal(40);

        int count = list.contagemElementos();
        System.out.println("Número de elementos na lista: " + count);
        list.addFinal(10);
        list.addFinal(20);
        list.addFinal(30);
        list.addFinal(40);

        System.out.println("Número de elementos na lista: " + list.contagemElementos());

        list.addBeforeHead(5);

        System.out.println("Número de elementos na lista após a inserção: " + list.contagemElementos());
        ListaEncadeada list1 = new ListaEncadeada();
        list1.adicionaFinal(10);
        list1.addFinal(20);
        list1.adicionaFinal(30);

        ListaEncadeada list2 = new ListaEncadeada();
        list2.adicionaFinal(40);
        list2.adicionaFinal(50);

        System.out.println("Lista 1: ");
        list1.printList();

        System.out.println("Lista 2: ");
        list2.printList();

        list1.concatenate(list2);

        System.out.println("Lista concatenada: ");
        list1.printList();
        ListaEncadeada listaEncadeada = list1.interleave(list2);

        System.out.println("Lista intercalada:");
        listaEncadeada.printList();
    }

}
