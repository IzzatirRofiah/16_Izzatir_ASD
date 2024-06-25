public class LinkedList16 {
    private Node16 head;

    // Menambahkan elemen
    public void add(Mahasiswa16 data) {
        Node16 newNode = new Node16(data);
        if (head == null) {
            head = newNode;
        } else {
            Node16 current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Menghapus elemen
    public boolean remove(String nim) {
        if (head == null) return false;
        if (head.data.getNim().equals(nim)) {
            head = head.next;
            return true;
        }
        Node16 current = head;
        while (current.next != null) {
            if (current.next.data.getNim().equals(nim)) {
                current.next = current.next.next;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Membaca/ mengakses elemen tertentu
    public Mahasiswa16 get(String nim) {
        System.out.println(String.format("%-10s %-20s %-15s %-30s", "NIM", "Nama", "Tanggal Lahir", "Alamat"));
        Node16 current = head;
        while (current != null) {
            if (current.data.getNim().equals(nim)) {
                return current.data;
            }
            current = current.next;
        }
        return null;
    }

    // Mencetak semua elemen
    public void printAll() {
        System.out.println(String.format("%-10s %-20s %-15s %-30s", "NIM", "Nama", "Tanggal Lahir", "Alamat"));
        Node16 current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
