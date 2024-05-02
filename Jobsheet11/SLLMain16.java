public class SLLMain16 {
    public static void main(String[] args) {
        LinkedList16 myLinkedList16 = new LinkedList16();
        myLinkedList16.print();
        myLinkedList16.addFirst(800);
        myLinkedList16.print();
        myLinkedList16.addFirst(700);
        myLinkedList16.print();
        myLinkedList16.addLast(500);
        myLinkedList16.print();
        myLinkedList16.insertAfter(700, 300);
        myLinkedList16.print();

        System.out.println("Data pada index ke-1: " + myLinkedList16.getData(1));
        System.out.println("Data 300 berada pada index ke: " + myLinkedList16.indexxOf(300));
        myLinkedList16.remove(300);
        myLinkedList16.print();
        myLinkedList16.removeFirst();
        myLinkedList16.print();
        myLinkedList16.removeLast();
        myLinkedList16.print();
    }
}
