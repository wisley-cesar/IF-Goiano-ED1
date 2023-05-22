public class ListaCircular {
    private No cabeca;

    public ListaCircular() {
        this.cabeca = null;
    }

    public void adicionar(int valor) {
        No novoNo = new No(valor);

        if (cabeca == null) {
            cabeca = novoNo;
            novoNo.proximo = cabeca;
        } else {
            No ultimo = cabeca;
            while (ultimo.proximo != cabeca) {
                ultimo = ultimo.proximo;
            }
            ultimo.proximo = novoNo;
            novoNo.proximo = cabeca;
        }
    }

    public void imprimir() {
        if (cabeca == null) {
            System.out.println("Lista vazia.");
            return;
        }

        No atual = cabeca;
        do {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        } while (atual != cabeca);

        System.out.println();
    }
}