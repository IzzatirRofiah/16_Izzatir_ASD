import java.util.Scanner;
public class StackMain16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackPakaian16 stk = new StackPakaian16(5);
        char pilih = 'y';
        while (pilih == 'y') {
            System.out.println("\nMenu:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Print");
            System.out.println("5. Keluar");
            System.out.print("Pilih operasi (1-5): ");
            int menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("Jenis: ");
                    String jenis = sc.nextLine();
                    System.out.print("Warna: ");
                    String warna = sc.nextLine();
                    System.out.print("Merk: ");
                    String merk = sc.nextLine();
                    System.out.print("Ukuran: ");
                    String ukuran = sc.nextLine();
                    System.out.print("Harga: ");
                    double harga = sc.nextDouble();
                    sc.nextLine();
                    Pakaian16 p = new Pakaian16(jenis, warna, merk, ukuran, harga);
                    stk.push(p);
                    break;
                case 2:
                    stk.pop();
                    break;
                case 3:
                    stk.peek();
                    break;
                case 4:
                    stk.print();
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

            System.out.print("\nApakah anda ingin melanjutkan (y/n) ? ");
            pilih = sc.next().charAt(0);
            sc.nextLine();
        }
    }
}
