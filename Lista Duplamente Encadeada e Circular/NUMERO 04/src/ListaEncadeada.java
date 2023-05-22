public class ListaEncadeada {
    private Node head;

    public ListaEncadeada() {
        head = null;
    }

    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            newNode.setNext(newNode);
            newNode.setPrevious(newNode);
        } else {
            Node lastNode = head.getPrevious();
            newNode.setNext(head);
            newNode.setPrevious(lastNode);
            lastNode.setNext(newNode);
            head.setPrevious(newNode);
        }
    }

    public void delete(int data) {
        if (head == null) {
            System.out.println("A lista está vazia.");
            return;
        }

        Node currentNode = head;

        while (currentNode.getData() != data) {
            currentNode = currentNode.getNext();

            if (currentNode == head) {
                System.out.println("O elemento não foi encontrado na lista.");
                return;
            }
        }

        Node previousNode = currentNode.getPrevious();
        Node nextNode = currentNode.getNext();

        previousNode.setNext(nextNode);
        nextNode.setPrevious(previousNode);

        if (currentNode == head) {
            head = nextNode;
        }

        currentNode.setNext(null);
        currentNode.setPrevious(null);
    }

    public void display() {
        if (head == null) {
            System.out.println("A lista está vazia.");
            return;
        }

        Node currentNode = head;

        do {
            System.out.print(currentNode.getData() + " ");
            currentNode = currentNode.getNext();
        } while (currentNode != head);

        System.out.println();
    }
}