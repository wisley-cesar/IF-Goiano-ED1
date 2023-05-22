public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada listaDuplamenteEncadeada= new ListaDuplamenteEncadeada();

        listaDuplamenteEncadeada.insert(10);
        listaDuplamenteEncadeada.insert(20);
        listaDuplamenteEncadeada.insert(30);
        listaDuplamenteEncadeada.insert(40);

        System.out.println("Lista: ");
        printLista(listaDuplamenteEncadeada);

        System.out.println("Busca:");
        System.out.println("Elemento 30 encontrado? " + listaDuplamenteEncadeada.procurar(30));
        System.out.println("Elemento 50 encontrado? " + listaDuplamenteEncadeada.procurar(50));

        System.out.println("Remoção:");
        System.out.println("Removendo elemento 20: " + listaDuplamenteEncadeada.delete(20));
        System.out.println("Removendo elemento 50: " + listaDuplamenteEncadeada.delete(50));

        System.out.println("Lista após remoção: ");
        printLista(listaDuplamenteEncadeada);
    }

    public static void printLista(ListaDuplamenteEncadeada listaDuplamenteEncadeada) {
        Node current = listaDuplamenteEncadeada.getHead().getNext();
        while (current != listaDuplamenteEncadeada.getTail()) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println();
    }
}
