public class ListaDuplamenteEncadeada {
    private Node head;
    private Node tail;

  public ListaDuplamenteEncadeada(){
        head = new Node(-1);  // Cabeça vazia com valor inválido (-1)
        tail = new Node(-1);  // Cauda vazia com valor inválido (-1)
        head.setNext(tail);
        tail.setPrev(head);
    }
    public void insert(int data) {
        Node newNode = new Node(data);
        newNode.setNext(tail);
        newNode.setPrev(tail.getPrev());
        tail.getPrev().setNext(newNode);
        tail.setPrev(newNode);
    }
    public boolean procurar(int data) {
        Node atual = head.getNext();
        while (atual != tail) {
            if (atual.getData() == data) {
                return true;
            }
            atual = atual.getNext();
        }
        return false;
    }
    public boolean delete(int data) {
        Node current = head.getNext();
        while (current != tail) {
            if (current.getData() == data) {
                current.getPrev().setNext(current.getNext());
                current.getNext().setPrev(current.getPrev());
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }
}
