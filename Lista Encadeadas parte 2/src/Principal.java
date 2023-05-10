public class Principal {
    public static void main(String[] args) {
// numero 01
        ListaDupla lista = new ListaDupla();
        lista.AdicionarNoComeco("Homer");
        lista.Adiciona("Marge");

        System.out.println(lista.Tamanho());

// numero 02
        lista.EsvaziaLista();
        System.out.println(lista.Tamanho());
        // numero 03
        Celula celula = new Celula("Homer");
        lista.Adiciona("Homer");
        lista.Adicionar(0, "Bart");
        lista.Adicionar(1, "Moll");
        System.out.println(lista.Imprimir());
        // numero 04

        lista.EsvaziaLista();
        // numero 05

        lista.Adiciona("Homer");
        lista.Adiciona("Bart");
        lista.AdicionarNoComeco("Lisa");
        System.out.println(lista.TotaldeElementos);

        // numero 06

        lista.EsvaziaLista();
        System.out.println(lista.TotaldeElementos);

        // numero 07
        lista.Adiciona(celula);
        lista.Adiciona("homer" );
        lista.Adiciona("Maggie");
        lista.Adicionar(0, "Bart");
        lista.Adicionar(1, "Marge");

        System.out.println(lista.Tamanho());
        lista.Contem(lista);
        // numero 08
        lista.EsvaziaLista();

        // numero 09

        lista.Adiciona("Homer");
        lista.Adiciona("Bart");
        System.out.println(lista.Tamanho());
        //System.out.println(lista.Imprimir());

        // numero 10

        System.out.println(lista.Contem("Marge"));
        System.out.println(lista.Contem("Homer"));
        System.out.println(lista.Contem("Maggie"));
        System.out.println(lista.Tamanho());
        // numero 11

        lista.EsvaziaLista();

        // numero 12
        lista.Adiciona("Homer");
        lista.Adiciona("Bart");
        System.out.println(lista.TotaldeElementos);
        // numero 13
        lista.RemovedoFim();
        System.out.println(lista.Tamanho());

        // numero 14

        lista.RemovedoComeco();
        System.out.println(lista.TotaldeElementos);

        // numero 15
        System.out.println(lista.Contem("Marge"));
        System.out.println(lista.Contem("Homer"));
        System.out.println(lista.Contem("Bart"));
        System.out.println(lista.Contem("Maggie"));
        System.out.println(lista.Tamanho());

        // numero 16
        lista.RemovedoComeco();
        System.out.println(lista.Tamanho());

        // numero 17
        System.out.println(lista.Contem("Marge"));
        System.out.println(lista.Contem("Homer"));
        System.out.println(lista.Contem("Bart"));
        System.out.println(lista.Contem("Maggie"));
        System.out.println(lista.Tamanho());

        // numero 18
        lista.EsvaziaLista();
        System.out.println(lista.Imprimir());



    }


}