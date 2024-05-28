package Tugas;
public class Node {
    String nama, nomorAntrian;
    Node prev, next;
    Node(String nama, String nomorAntrian) {
        this.nama = nama;
        this.nomorAntrian = nomorAntrian;
        this.next = null;
        this.prev = null;
    }
}
