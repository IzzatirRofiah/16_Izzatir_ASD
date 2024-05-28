public class Stack16_2 {
    int size;
    int top;
    Pakaian16 data[];

    public Stack16_2(int size) {
        this.size = size;
        data = new Pakaian16[size];
        top = -1;
    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Pakaian16 pkn) {
        if (!isFull()) {
            top++;
            data[top] = pkn;
        } else {
            System.out.println("Isi Stack penuh");
        }
    }

    public void pop() {
        if (!isEmpty()) {
            Pakaian16 x = data[top];
            top--;
            System.out.println(
                    "Data yang keluar: " + x.jenis + " " + x.warna + " " + x.merk + " " + x.ukuran + " " + x.harga);
        } else {
            System.out.println("Stack masih kosong");
        }
    }

    public void peek() {
        System.out.println("Elemen teratas stack: " + data[top].jenis + " " + data[top].warna + " " + data[top].merk
                + " " + data[top].ukuran + " " + data[top].harga);
    }

    public void print() {
        System.out.println("Isi stack:");
        for (int i = top; i >= 0; i--) {
            System.out.println(data[i].jenis + " " + data[i].warna + " " + data[i].merk + " " + data[i].ukuran + " "
                    + data[i].harga);
        }
        System.out.println(" ");
    }

    public void clear() {
        if (!isEmpty()) {
            for (int i = top; i >= 0; i--) {
                top--;
            }
            System.out.println("Stack sudah dikosongkan");
        } else {
            System.out.println("Stack masih kosong");
        }
    }

    public void getMax() {
        if (!isEmpty()) {
            Pakaian16 maxPakaian = data[0];
            for (int i = 1; i <= top; i++) {
                if (data[i].harga > maxPakaian.harga) {
                    maxPakaian = data[i];
                }
            }

            System.out.println("Data pakaian dengan harga tertinggi:");
            System.out.println("Jenis: " + maxPakaian.jenis);
            System.out.println("Warna: " + maxPakaian.warna);
            System.out.println("Merk: " + maxPakaian.merk);
            System.out.println("Ukuran: " + maxPakaian.ukuran);
            System.out.println("Harga: " + maxPakaian.harga);
        } else {
            System.out.println("Stack masih kosong");
        }
    }
}
