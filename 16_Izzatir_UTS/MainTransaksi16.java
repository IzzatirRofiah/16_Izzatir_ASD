import java.util.Scanner;
public class MainTransaksi16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println(" ");
            System.out.println("---------UTS IZZATIR---------");
            System.out.println("1. Tampil data rekening");
            System.out.println("2. Tampil data transaksi");
            System.out.println("3. Mencari saldo > 500.000");
            System.out.println("4. Sorting by name");
            System.out.println("5. Keluar");
            System.out.println("----------------------------");
            System.out.print("Pilih(1-5): ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    tampilDataRekening();
                    break;
                case 2:
                    tampilDataTransaksi();
                    break;
                case 3:
                    mencariSaldoLebihDari500000();
                    break;
                case 4:
                    sortingByName();
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih 1-5.");
            }
        } while (choice != 5);
    }

    static Rekening16[] rekenings = {
            new Rekening16("16030927 3084", "Wallace", "Chase Castro", "1-458-264-3263", "ligula.Nullam@tacitisociosqu.edu"),
            new Rekening16("16100617 0573", "Darius", "Julian Daniel", "1-375-843-0547", "nec@lectusjusto.org"),
            new Rekening16("16240401 2243", "Fuller", "Finn Dunlap", "\t571-7062", "\tconvallis@Vestibulumanteipsum.org"),
            new Rekening16("16270525 0112", "Malcolm", "Keane Floyd", "\t623-0234", "\tporttitor.tellus.non@Curabitur.ca"),
            new Rekening16("16971204 2416", "Geofrey", "Stephen Pratt", "1-683-416-8323", "ut.pellentesque@luctusutpellentesque.com"),
            new Rekening16("16100727 8862", "Rudyard", "Charles Morales", "650-5379", "\tProin.eget@velitegestaslacinia.ca"),
            new Rekening16("16460329 4259", "Troy", "Damon Guerra", "897-7608", "\tpede.Suspendisse.dui@a.ca"),
            new Rekening16("16320421 3437", "Alec", "Cooper Lee", "\t792-4447", "\tnon@mus.com"),
            new Rekening16("16180729 7229", "Walter", "Seth Drake", "\t863-8209", "\tPellentesque.ut.ipsum@neque.ca"),
            new Rekening16("16950313 6823", "Simon", "Burton Gates", "592-6919", "\ttellus.justo.sit@commodoauctor.net"),
            new Rekening16("16850708 3528", "Kamal", "Odysseus Salas", "1-115-339-7678", "dictum@nec.edu"),
            new Rekening16("16080205 9329", "Xenos", "Colin Curry", "\t1-891-703-2664", "vel@ullamcorpermagna.co.uk"),
            new Rekening16("16080628 2695", "Merritt", "Clarke Roman", "1-978-632-5110", "Aliquam.gravida@vestibulumMauris.net"),
            new Rekening16("16130909 2979", "Ryder", "Joel Cunningham", "817-1766", "\tinterdum.Curabitur.dictum@rutrumurna.edu"),
            new Rekening16("16890212 8688", "Preston", "Brock Schroeder", "1-675-400-4501", "et.ultrices@a.co.uk"),
            new Rekening16("16141008 9963", "Alec", "Baker Barton", "527-9085", "\tut@aultriciesadipiscing.ca"),
            new Rekening16("16511222 7763", "Price", "Ashton Burke", "1-564-419-4285", "Proin.velit@Duisac.net"),
            new Rekening16("16720623 0943", "Devin", "Slade Flores", "977-6690", "\tac@nibhAliquamornare.com"),
            new Rekening16("16771126 7372", "Ignatus", "Lionel Kane", "\t353-5137", "\tcubilia.Curae.Phasellus@Duis.com")
    };

    static Transaksi16[] transaksis = {
            new Transaksi16(898214, 494048, 3587,   "\t2021-03-09 07:54:42", ""),
            new Transaksi16(205420, 200162, 775880, "2021-06-25 10:23:00", ""),
            new Transaksi16(838632, 350929, 328316, "2021-09-18 23:00:04", ""),
            new Transaksi16(230659, 204434, 690503, "2022-02-02 19:10:34", ""),
            new Transaksi16(770592, 334245, 444267, "2020-08-11 13:36:56", ""),
            new Transaksi16(685302, 451002, 376442, "2020-05-23 07:34:53", ""),
            new Transaksi16(816129, 851403, 597842, "2021-07-18 19:41:20", ""),
            new Transaksi16(989609, 333823, 802752, "2022-02-01 01:13:11", ""),
            new Transaksi16(297103, 396116, 779589, "2021-07-03 01:09:49", ""),
            new Transaksi16(66190,  259150, 619774, "2021-09-09 03:57:30", ""),
            new Transaksi16(234301, 278309, 547922, "2021-08-24 13:18:39", ""),
            new Transaksi16(243306, 869468, 50283,  "2021-03-12 03:40:16", ""),
            new Transaksi16(371045, 991242, 602034, "2021-08-06 11:48:59", ""),
            new Transaksi16(395170, 97058,  472273, "2021-05-02 10:53:31", ""),
            new Transaksi16(862731, 561908, 109431, "2021-07-31 08:11:00", ""),
            new Transaksi16(556798, 31387,  725426, "2021-03-27 06:18:20", ""),
            new Transaksi16(873982, 896213, 846142, "2021-07-18 04:06:30", ""),
            new Transaksi16(774247, 739406, 775848, "2020-10-24 01:39:00", ""),
            new Transaksi16(66987,  823014, 868772, "2020-12-21 05:57:59", "")
    };
    static void tampilDataRekening() {
        System.out.println(" ");
        System.out.println("No Rekening\t\t Nama\t\t Nama Ibu\t\t Phone\t\t\t Email");
        for (Rekening16 rekening : rekenings) {
            System.out.println(rekening.noRekening + "\t" + rekening.nama + "\t\t" + rekening.namaIbu + "\t" +rekening.phone + "\t" + rekening.email);
        }
    }

    static void tampilDataTransaksi() {
        System.out.println("Saldo\t\t\tSaldo Awal\t\tSaldo Akhir\t\t\tTanggal Transaksi\t\tType");
        for (Transaksi16 transaksi : transaksis) {
            String saldo = String.format("%.2f", transaksi.saldo);
            String saldoAwal = String.format("%.2f", transaksi.saldoAwal);
            String saldoAkhir = String.format("%.2f", transaksi.saldoAkhir);

            System.out.println(saldo + "\t\t" + saldoAwal + "\t\t" + saldoAkhir + "\t\t\t"
                    + transaksi.tanggalTransaksi + "\t" + transaksi.type);
        }
    }

    static void mencariSaldoLebihDari500000() {
        System.out.println("Saldo lebih dari 500000:");
        System.out.println("Saldo\t\t\tSaldo Awal\t\tSaldo Akhir\t\t\tTanggal Transaksi\t\tType");
        for (Transaksi16 transaksi : transaksis) {
            String saldo = String.format("%.2f", transaksi.saldo);
            String saldoAwal = String.format("%.2f", transaksi.saldoAwal);
            String saldoAkhir = String.format("%.2f", transaksi.saldoAkhir);

            if (transaksi.saldo > 500000) {
                System.out.println(saldo + "\t\t" + saldoAwal + "\t\t" + saldoAkhir + "\t\t\t"
                        + transaksi.tanggalTransaksi + "\t" + transaksi.type);
            }
        }
    }
    static void sortingByName() {

        for (int i = 0; i < rekenings.length - 1; i++) {
            for (int j = 0; j < rekenings.length - i - 1; j++) {
                if (rekenings[j].nama.compareTo(rekenings[j + 1].nama) > 0) {

                    Rekening16 temp = rekenings[j];
                    rekenings[j] = rekenings[j + 1];
                    rekenings[j + 1] = temp;
                }
            }
        }

        System.out.println(" ");
        System.out.println("Data rekening setelah diurutkan berdasarkan nama:");
        System.out.println("-------------------------------------------------");
        System.out.println("No Rekening\t\t Nama\t\t Nama Ibu\t\t Phone\t\t\t Email");
        for (Rekening16 rekening : rekenings) {
            System.out.println(rekening.noRekening + "\t" + rekening.nama + "\t\t" + rekening.namaIbu + "\t" + rekening.phone +"\t" + rekening.email);
        }
    }
}
