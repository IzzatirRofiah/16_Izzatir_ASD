import java.util.Scanner;

public class MainSum16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("============================================================");
        System.out.println("Program Menghitung Keunggulan Total (Satuan Juta. Misal 5.9)");
        System.out.print("Masukkan jumlah bulan : ");
        int elm = sc.nextInt();

        Sum16 sm = new Sum16(elm);
        System.out.println("============================================================");
        for (int i = 0; i < sm.elemen; i++) {
            System.out.print("Masukkan untung bulan ke- " + (i + 1) + " : ");
            sm.keuntungan[i] = sc.nextDouble();
        }
        System.out.println("============================================================");
        System.out.println("Algoritma Brute Force");
        System.out.println("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah : " + sm.totalBF(sm.keuntungan));
        System.out.println("============================================================");
        System.out.println("Algoritma Devide Conquer");
        System.out.println("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah : " + sm.totalDC(sm.keuntungan, 0, sm.elemen-1));
    }
}
