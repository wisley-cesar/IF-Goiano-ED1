public class ListaOrdenada {
    No primeiro;

    public ListaOrdenada() {
        this.primeiro = null;
    }
    // Método para intercalar duas listas ordenadas
    public void intercalar(ListaOrdenada lista1, ListaOrdenada lista2) {
        No atual1 = lista1.primeiro;
        No atual2 = lista2.primeiro;
        ListaOrdenada listaIntercalada = new ListaOrdenada();

        while (atual1 != null && atual2 != null) {
            if (atual1.valor <= atual2.valor) {
                listaIntercalada.inserir(atual1.valor);
                atual1 = atual1.proximo;
            } else {
                listaIntercalada.inserir(atual2.valor);
                atual2 = atual2.proximo;
            }
        }

        while (atual1 != null) {
            listaIntercalada.inserir(atual1.valor);
            atual1 = atual1.proximo;
        }

        while (atual2 != null) {
            listaIntercalada.inserir(atual2.valor);
            atual2 = atual2.proximo;
        }

        this.primeiro = listaIntercalada.primeiro;
    }

    // Método auxiliar para inserir um valor ordenadamente na lista
    protected void inserir(int valor) {
        No novoNo = new No(valor);

        if (this.primeiro == null || valor <= this.primeiro.valor) {
            novoNo.proximo = this.primeiro;
            this.primeiro = novoNo;
        } else {
            No atual = this.primeiro;

            while (atual.proximo != null && atual.proximo.valor < valor) {
                atual = atual.proximo;
            }

            novoNo.proximo = atual.proximo;
            atual.proximo = novoNo;
        }
    }

    public void exibir() {
        No atual = this.primeiro;

        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
            }

        System.out.println(); // Quebra de linha após exibir todos os elementos

    }
}
