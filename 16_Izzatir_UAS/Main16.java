import java.util.Scanner;

public class Main16 {
    private static Kendaraan16[] kendaraanList = new Kendaraan16[10];
    private static TransaksiPajak16[] transaksiList = new TransaksiPajak16[10];
    private static int kendaraanCount = 0;
    private static int transaksiCount = 0;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Initialize kendaraan data
        tambahKendaraan(new Kendaraan16("S 4567 YV", "Basko", "Mobil", 2000, 2012, 4));
        tambahKendaraan(new Kendaraan16("N 4511 VS", "Arta", "Motor", 2500, 2015, 3));
        tambahKendaraan(new Kendaraan16("AB 4321 A", "Wisnu", "Motor", 125, 2010, 2));
        tambahKendaraan(new Kendaraan16("B 1234 AG", "Sisa", "Motor", 150, 2020, 1));

        while (true) {
            tampilkanMenu();
            int pilihan = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (pilihan) {
                case 1:
                    tampilkanDaftarKendaraan();
                    break;
                case 2:
                    tambahTransaksiPajak();
                    break;
                case 3:
                    tampilkanSemuaTransaksiPajak();
                    break;
                case 4:
                    urutkanTransaksiBerdasarkanNama();
                    break;
                case 5:
                    tampilkanTotalPendapatan();
                    break;
                case 6:
                    System.out.println("Terima kasih telah menggunakan layanan kami.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        }
    }

    private static void tampilkanMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Daftar Kendaraan");
        System.out.println("2. Bayar Pajak");
        System.out.println("3. Tampilkan seluruh transaksi");
        System.out.println("4. Urutkan Transaksi berdasarkan Nama Pemilik");
        System.out.println("5. Tampilkan Total Pendapatan");
        System.out.println("6. Keluar ");
        System.out.print("Pilih (1-6): ");
    }

    private static void tambahKendaraan(Kendaraan16 kendaraan) {
        if (kendaraanCount < kendaraanList.length) {
            kendaraanList[kendaraanCount++] = kendaraan;
        } else {
            System.out.println("Kapasitas daftar kendaraan penuh.");
        }
    }

    private static void tampilkanDaftarKendaraan() {
        System.out.println("\nDaftar Kendaraan:");
        System.out.println("+------------+-----------------+------------+------+-------+-----------------+");
        System.out.println("| No TNKB    | Nama Pemilik    | Jenis      | CC   | Tahun | Bulan Harus Bayar |");
        System.out.println("+------------+-----------------+------------+------+-------+-----------------+");
        for (int i = 0; i < kendaraanCount; i++) {
            Kendaraan16 kendaraan = kendaraanList[i];
            System.out.printf("| %-11s | %-15s | %-10s | %-4d | %-5d | %-15d |\n",
                    kendaraan.getNoTNKB(), kendaraan.getNama(), kendaraan.getJenis(),
                    kendaraan.getCc(), kendaraan.getTahun(), kendaraan.getBulanHarusBayar());
        }
        System.out.println("+------------+-----------------+------------+------+-------+-----------------+");
    }

    private static void tambahTransaksiPajak() {
        System.out.print("Masukkan nomor TNKB kendaraan: ");
        String noTNKB = scanner.nextLine();

        System.out.print("Masukkan bulan bayar: ");
        int bulanBayar = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        Kendaraan16 kendaraanTerpilih = cariKendaraanByNoTNKB(noTNKB);

        if (kendaraanTerpilih == null) {
            System.out.println("Kendaraan dengan nomor TNKB tersebut tidak ditemukan.");
            return;
        }

        long nominalBayar = hitungTarifPajak(kendaraanTerpilih);
        long denda = hitungDenda(kendaraanTerpilih, bulanBayar);

        int kode = transaksiCount + 1;  // Misalnya kode dapat digenerate atau diinput dari sistem lain
        TransaksiPajak16 transaksiBaru = new TransaksiPajak16(kode, nominalBayar, denda, bulanBayar, kendaraanTerpilih);

        if (transaksiCount < transaksiList.length) {
            transaksiList[transaksiCount++] = transaksiBaru;
        } else {
            System.out.println("Kapasitas daftar transaksi penuh.");
        }

        System.out.println("Transaksi pajak berhasil ditambahkan.");

        // Tampilkan detail transaksi yang baru ditambahkan
        System.out.println("\nDetail Transaksi Pajak Baru:");
        System.out.println("+-------+------------+-----------------+----------------------+-----------------+");
        System.out.println("| Kode  | No TNKB    | Nama            | Nominal Bayar (Rp)    | Denda (Rp)      |");
        System.out.println("+-------+------------+-----------------+----------------------+-----------------+");
        System.out.printf("| %-5d | %-10s | %-15s | Rp %-17d | Rp %-12d |\n",
                transaksiBaru.getKode(), kendaraanTerpilih.getNoTNKB(), kendaraanTerpilih.getNama(),
                transaksiBaru.getNominalBayar(), transaksiBaru.getDenda());
        System.out.println("+-------+------------+-----------------+----------------------+-----------------+");
    }

    private static Kendaraan16 cariKendaraanByNoTNKB(String noTNKB) {
        for (int i = 0; i < kendaraanCount; i++) {
            Kendaraan16 kendaraan = kendaraanList[i];
            if (kendaraan.getNoTNKB().equalsIgnoreCase(noTNKB)) {
                return kendaraan;
            }
        }
        return null;
    }

    private static void tampilkanSemuaTransaksiPajak() {
        System.out.println("\nDaftar Transaksi Pajak:");
        System.out.println("+-------+------------+-----------------+----------------------+-----------------+");
        System.out.println("| Kode  | No TNKB    | Nama            | Nominal Bayar (Rp)    | Denda (Rp)      |");
        System.out.println("+-------+------------+-----------------+----------------------+-----------------+");
        for (int i = 0; i < transaksiCount; i++) {
            TransaksiPajak16 transaksi = transaksiList[i];
            System.out.printf("| %-5d | %-10s | %-15s | Rp %-17d | Rp %-12d |\n",
                    transaksi.getKode(), transaksi.getKendaraan().getNoTNKB(), transaksi.getKendaraan().getNama(),
                    transaksi.getNominalBayar(), transaksi.getDenda());
        }
        System.out.println("+-------+------------+-----------------+----------------------+-----------------+");
    }

    private static void urutkanTransaksiBerdasarkanNama() {
        for (int i = 0; i < transaksiCount - 1; i++) {
            for (int j = 0; j < transaksiCount - i - 1; j++) {
                if (transaksiList[j].getKendaraan().getNama().compareTo(transaksiList[j + 1].getKendaraan().getNama()) > 0) {
                    // Lakukan pertukaran jika nama kendaraan pada indeks j lebih besar dari nama pada indeks j+1
                    TransaksiPajak16 temp = transaksiList[j];
                    transaksiList[j] = transaksiList[j + 1];
                    transaksiList[j + 1] = temp;
                }
            }
        }

        System.out.println("Transaksi berhasil diurutkan berdasarkan nama pemilik.");
        tampilkanSemuaTransaksiPajak();
    }

    private static void tampilkanTotalPendapatan() {
        long totalPendapatan = 0;
        for (int i = 0; i < transaksiCount; i++) {
            totalPendapatan += transaksiList[i].getNominalBayar() + transaksiList[i].getDenda();
        }
        System.out.println("\nTotal Pendapatan dari Pajak Kendaraan:");
        System.out.println("Rp " + totalPendapatan);
    }

    private static long hitungTarifPajak(Kendaraan16 kendaraan) {
        // Implementasi tarif pajak sesuai jenis kendaraan (di sini contoh sederhana)
        if (kendaraan.getJenis().equalsIgnoreCase("mobil")) {
            return 200000;
        } else if (kendaraan.getJenis().equalsIgnoreCase("motor")) {
            return 100000;
        } else {
            return 0;
        }
    }

    private static long hitungDenda(Kendaraan16 kendaraan, int bulanBayar) {
        int bulanHarusBayar = kendaraan.getBulanHarusBayar();
        int selisihBulan = bulanBayar - bulanHarusBayar;
        if (selisihBulan > 0) {
            return selisihBulan * 50000; // Misalnya, denda per bulan terlambat adalah Rp 50.000
        } else {
            return 0;
        }
    }
}
