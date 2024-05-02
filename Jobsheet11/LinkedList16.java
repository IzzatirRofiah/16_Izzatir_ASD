public class LinkedList16 {
    Node16 head;
    public boolean isEmpty() {
        return (head == null);
    }
    public void print() {
        if (!isEmpty()) {
            System.out.print("Isi linked list: ");
            Node16 currentNode = head;
            while (currentNode != null) {
                System.out.print(currentNode.data + "\t");
                currentNode = currentNode.next;
            }
            System.out.println(" ");
        } else {
            System.out.println("Linked list kosong");
        }
    }
    public void addFirst(int input) {
        Node16 newNode = new Node16(input, null);
        if (isEmpty()) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }
    public void addLast(int input) {
        Node16 newNode = new Node16(input, null);
        if (isEmpty()) {
            head = newNode;
        } else {
            Node16 currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }
    public void insertAfter(int key, int input) {
        Node16 newNode = new Node16(input, null);
        if (!isEmpty()) {
            Node16 currentNode = head;
            do {
                if (currentNode.data == key) {
                    newNode.next = currentNode.next;
                    currentNode.next = newNode;
                    break;
                }
                currentNode = currentNode.next;
            } while (currentNode != null);
        } else {
            System.out.print("Linked list kosong");
        }
    }
    public void insertAt(int index, int input) {
        if (index == 0) {
            addFirst(input);
        } else {
            Node16 newNode = new Node16(input, null);
            Node16 currentNode = head;
            for (int i = 0; i < index - 1; i++) {
                if (currentNode == null) {
                    System.out.println("Index melebihi batas");
                    return;
                }
                currentNode = currentNode.next;
            }
            if (currentNode == null) {
                System.out.println("Index melebihi batas");
            } else {
                newNode.next = currentNode.next;
                currentNode.next = newNode;
            }
        }
    }
}
