public class ListaDuplamenteEncadeada  {
    No primeiro;
    No ultimo;

    public ListaDuplamenteEncadeada(No primeiro, No ultimo) {
        this.primeiro = null;
        this.ultimo = null;
    }
    public void concatenar(ListaDuplamenteEncadeada outraLista) {
        if (this.primeiro == null) {
            this.primeiro = outraLista.primeiro;
            this.ultimo = outraLista.ultimo;
        } else if (outraLista.primeiro != null) {
            this.ultimo.proximo = outraLista.primeiro;
            outraLista.primeiro.anterior = this.ultimo;
            this.ultimo = outraLista.ultimo;
        }
    }
    public void separar(ListaDuplamenteEncadeada lista1, ListaDuplamenteEncadeada lista2) {
        if (this.primeiro == null) {
            return;
        }
        // Encontrando o nó do meio da lista
        No meio = encontrarNoDoMeio();

        // Atualizando as referências das duas novas listas
        lista1.primeiro = this.primeiro;
        lista1.ultimo = meio.anterior;
        lista2.primeiro = meio.proximo;
        lista2.ultimo = this.ultimo;

        // Desvinculando as referências da lista original
        meio.anterior.proximo = null;
        meio.anterior = null;
        meio.proximo = null;

        // Reinicializando a lista original
        this.primeiro = null;
        this.ultimo = null;
    }

    // Método auxiliar para encontrar o nó do meio da lista
    private No encontrarNoDoMeio() {
        No rapido = this.primeiro;
        No lento = this.primeiro;

        while (rapido != null && rapido.proximo != null) {
            rapido = rapido.proximo.proximo;
            lento = lento.proximo;
        }

        return lento;
    }
}
