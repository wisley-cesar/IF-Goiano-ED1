public class Main {
    public static void main(String[] args) {
        ListaOrdenada lista1 = new ListaOrdenada();
        ListaOrdenada lista2 = new ListaOrdenada();

        // Adicionando elementos à primeira lista
        lista1.inserir(2);
        lista1.inserir(4);
        lista1.inserir(6);

        // Adicionando elementos à segunda lista
        lista2.inserir(1);
        lista2.inserir(3);
        lista2.inserir(5);

        // Criando uma terceira lista para armazenar a intercalação
        ListaOrdenada listaIntercalada = new ListaOrdenada();

        // Intercalando as duas listas
        listaIntercalada.intercalar(lista1, lista2);

        // Exibindo a lista intercalada
        System.out.println("Lista intercalada:");
        listaIntercalada.exibir();
    }
}