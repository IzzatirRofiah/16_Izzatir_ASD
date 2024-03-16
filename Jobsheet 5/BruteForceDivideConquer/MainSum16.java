import java.util.Scanner;

public class MainSum16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===================================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5.9)");
        System.out.print("Masukkan jumlah perusahaan: ");
        int jumlahPerusahaan = sc.nextInt();

        Sum16[] perusahaan = new Sum16[jumlahPerusahaan];

        for (int i = 0; i < jumlahPerusahaan; i++) {
            System.out.print("Masukkan jumlah bulan untuk perusahaan " + (i + 1) + ": ");
            int jumlahBulan = sc.nextInt();
            perusahaan[i] = new Sum16(jumlahBulan);

            System.out.println("====================================================");
            for (int j = 0; j < jumlahBulan; j++) {
                System.out.print("Masukkan untung bulan ke-" + (j + 1) + " untuk perusahaan "
                        + (i + 1) + ": ");
                perusahaan[i].keuntungan[j] = sc.nextDouble();
            }
        }

        System.out.println("====================================================");
        System.out.println("Algoritma Brute Force");
        for (int i = 0; i < jumlahPerusahaan; i++) {
            System.out.println("Total keuntungan perusahaan " + (i + 1) + " selama "
                    + perusahaan[i].elemen + " bulan adalah = "
                    + perusahaan[i].totalBF(perusahaan[i].keuntungan));
        }

        System.out.println("====================================================");
        System.out.println("Algoritma Divide Conquer");
        for (int i = 0; i < jumlahPerusahaan; i++) {
            System.out.println("Total keuntungan perusahaan " + (i + 1) + " selama "
                    + perusahaan[i].elemen + " bulan adalah = " + perusahaan[i].totalDC(perusahaan[i].keuntungan,
                    0, perusahaan[i].elemen - 1));
        }
    }
}
