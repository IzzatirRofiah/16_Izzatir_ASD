import java.util.Scanner;
public class StackMain16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackPakaian16 stk = new StackPakaian16(5);
        char pilih;
        do {
            System.out.println();
            System.out.print("Jenis : ");
            String jenis = sc.nextLine();
            System.out.print("Warna : ");
            String warna = sc.nextLine();
            System.out.print("Merk : ");
            String merk = sc.nextLine();
            System.out.print("Ukuran : ");
            String ukuran = sc.nextLine();
            System.out.print("Harga : ");
            double harga = sc.nextDouble();

            Pakaian16 p = new Pakaian16(jenis, warna, merk, ukuran, harga);
            System.out.print("Apakah anda akan menambahkan dara batu ke stack (y/n)? ");
            pilih = sc.next().charAt(0);
            sc.nextLine();
            stk.push(p);
        } while (pilih == 'y');
        stk.print();
        stk.pop();
        stk.peek();
        stk.print();
    }
}
