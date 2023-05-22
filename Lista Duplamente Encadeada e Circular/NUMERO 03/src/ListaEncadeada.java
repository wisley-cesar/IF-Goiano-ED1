public class ListaEncadeada {
    private Node head;

    private static class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public void addVazio(int data) {
        if (head != null) {
            return;
        }
        Node newNode = new Node(data);
        newNode.next = newNode;
        head = newNode;
    }

    public void adicionaFinal(int data) {
        if (head == null) {
            return;
        }

        Node newNode = new Node(data);
        newNode.next = head;

        Node current = head;
        while (current.next != head) {
            current = current.next;
        }
        current.next = newNode;
    }
    public int contagemElementos() {
        if (head == null) {
            return 0;
        }

        int count = 1;
        Node current = head.next;
        while (current != head) {
            count++;
            current = current.next;
        }
        return count;
    }public void addFinal(int data) {
        if (head == null) {
            addVazio(data);
            return;
        }

        Node newNode = new Node(data);
        newNode.next = head;

        Node current = head;
        while (current.next != head) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void addBeforeHead(int data) {
        if (head == null) {
            addVazio(data);
            return;
        }

        Node newNode = new Node(data);
        Node current = head;
        while (current.next != head) {
            current = current.next;
        }
        current.next = newNode;
        newNode.next = head;
        head = newNode;
    }
    public void concatenate(ListaEncadeada listaEncadeada) {
        if (head == null) {
            head = listaEncadeada.head;
            return;
        }

        if (listaEncadeada.head == null) {
            return;
        }

        Node firstListLastNode = head;
        while (firstListLastNode.next != head) {
            firstListLastNode = firstListLastNode.next;
        }

        Node secondListLastNode = listaEncadeada.head;
        while (secondListLastNode.next != listaEncadeada.head) {
            secondListLastNode = secondListLastNode.next;
        }

        firstListLastNode.next = listaEncadeada.head;
        secondListLastNode.next = head;
    }
    public void printList() {
        if (head == null) {
            return;
        }

        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);

        System.out.println(); // Quebra de linha após imprimir a lista
    }
    public ListaEncadeada interleave(ListaEncadeada segundaLista) {
        ListaEncadeada listaEncadeada = new ListaEncadeada();

        Node currentFirst = head;
        Node currentSecond = segundaLista.head;

        while (currentFirst != null || currentSecond != null) {
            if (currentFirst != null && (currentSecond == null || currentFirst.data <= currentSecond.data)) {
                listaEncadeada.adicionaFinal(currentFirst.data);
                currentFirst = currentFirst.next;
            } else {
                listaEncadeada.adicionaFinal(currentSecond.data);
                currentSecond = currentSecond.next;
            }
        }

        return listaEncadeada;
    }
    public ListaEncadeada copia() {
        ListaEncadeada listaEncadeada = new ListaEncadeada();

        if (head == null) {
            return listaEncadeada;
        }

        Node current = head;
        do {
            listaEncadeada.adicionaFinal(current.data);
            current = current.next;
        } while (current != head);

        return listaEncadeada;
    }




}


