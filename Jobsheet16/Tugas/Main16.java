import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Main16 {
    static Scanner sc = new Scanner(System.in);
    static String kode;
    static double nilai;
    static Queue<Mahasiswa16> daftarMahasiswa = new LinkedList<>();
    static List<MataKuliah16> daftarMataKuliah = new ArrayList<>();
    static List<Nilai16> daftarNilai = new ArrayList<>();
    public static void main(String[] args) {
        // Input data mahasiswa
        daftarMahasiswa.add(new Mahasiswa16("20001", "Thalhah", "021xxxx"));
        daftarMahasiswa.add(new Mahasiswa16("20002", "Zubair", "021xxxx"));
        daftarMahasiswa.add(new Mahasiswa16("20003", "Abdur-Rahman", "021xxxx"));
        daftarMahasiswa.add(new Mahasiswa16("20004", "Sa'ad", "021xxxx"));
        daftarMahasiswa.add(new Mahasiswa16("20005", "Sa'id", "021xxxx"));
        daftarMahasiswa.add(new Mahasiswa16("20006", "Ubaidah", "021xxxx"));
        // Input data mata kuliah
        daftarMataKuliah.add(new MataKuliah16("00001", "Internet of Things", 3));
        daftarMataKuliah.add(new MataKuliah16("00002", "Algoritma dan Struktur Data", 2));
        daftarMataKuliah.add(new MataKuliah16("00003", "Algoritma dan Pemrograman", 2));
        daftarMataKuliah.add(new MataKuliah16("00004", "Praktikum Algoritma dan Struktur Data", 3));
        daftarMataKuliah.add(new MataKuliah16("00005", "Praktikum Algoritma dan Pemrograman", 3));
        do {
            System.out.println("***********************************************");
            System.out.println("SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER");
            System.out.println("***********************************************");
            System.out.println("1. Input Nilai");
            System.out.println("2. Tampil Nilai");
            System.out.println("3. Mencari Nilai Mahasiswa");
            System.out.println("4. Urut Data Nilai");
            System.out.println("5. Hapus Data Mahasiswa");
            System.out.println("6. Keluar");
            System.out.println("***********************************************");
            System.out.print("Pilih     : ");
            int menu = sc.nextInt();
            System.out.println();

            switch (menu) {
                case 1:
                    inputNilai();
                    break;
                case 2:
                    tampilNilai();
                    break;
                case 3:
                    cariNilai();
                    break;
                case 4:
                    urutNilai();
                    break;
                case 5:
                    hapusMahasiswa();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (true);
    }

    public static void hapusMahasiswa() {
        System.out.println("DAFTAR MAHASISWA");
        System.out.println("***********************************************");
        System.out.println(String.format("%-10s %-15s %-10s", "NIM", "Nama", "Telp"));
        for (Mahasiswa16 mhs : daftarMahasiswa) {
            System.out.println(mhs);
        }
        System.out.print("Masukkan NIM mahasiswa yang ingin dihapus: ");
        String nim = sc.next();

        if (!daftarMahasiswa.isEmpty()) {
            Mahasiswa16 removed = daftarMahasiswa.poll();
            System.out.println("Mahasiswa dengan NIM " + removed.getNim() + " telah dihapus.");
            System.out.println();
        } else {
            System.out.println("Tidak ada mahasiswa yang dapat dihapus.");
            System.out.println();
        }
    }

    public static void inputNilai() {
        System.out.println("Masukkan Data");
        System.out.print("Kode      : ");
        kode = sc.next();
        System.out.print("Nilai     : ");
        nilai = sc.nextDouble();
        System.out.println();
        System.out.println("DAFTAR MAHASISWA");
        System.out.println("***********************************************");
        System.out.println(String.format("%-10s %-15s %-10s", "NIM", "Nama", "Telp"));
        for (Mahasiswa16 mhs : daftarMahasiswa) {
            System.out.println(mhs);
        }
        System.out.print("Pilih mahasiswa by nim: ");
        String nim = sc.next();

        Mahasiswa16 selectMahasiswa = null;
        for (Mahasiswa16 mhs : daftarMahasiswa) {
            if (mhs.getNim().equals(nim)) {
                selectMahasiswa = mhs;
                break;
            }
        }

        if (selectMahasiswa == null) {
            System.out.println("Mahasiswa tidak ditemukan");
            return;
        }
        System.out.println();
        System.out.println("DAFTAR MATA KULIAH");
        System.out.println("***********************************************");
        System.out.println(String.format("%-10s %-30s %-5s", "Kode", "Mata Kuliah", "SKS"));
        for (MataKuliah16 mk : daftarMataKuliah) {
            System.out.println(mk);
        }
        System.out.print("Pilih MK by kode: ");
        String kodeMatkul = sc.next();

        MataKuliah16 selectMatkul = null;
        for (MataKuliah16 mk : daftarMataKuliah) {
            if (mk.getKode().equals(kodeMatkul)) {
                selectMatkul = mk;
                break;
            }
        }
        if (selectMatkul == null) {
            System.out.println("Mata Kuliah tidak ditemukan");
            return;
        }
        Nilai16 nilaiMhs = new Nilai16(selectMahasiswa, selectMatkul, nilai);
        daftarNilai.add(nilaiMhs);
    }

    public static void tampilNilai() {
        System.out.println("DAFTAR NILAI MAHASISWA");
        System.out.println("***********************************************");
        System.out.println(String.format("%-10s %-15s %-30s %-5s %-5s", "NIM", "Nama", "Mata Kuliah", "SKS", "Nilai"));
        for (Nilai16 nilai16 : daftarNilai) {
            System.out.println(nilai16);
        }
        System.out.println();
    }

    public static void cariNilai() {
        System.out.println("DAFTAR NILAI MAHASISWA");
        System.out.println("***********************************************");
        System.out.println(String.format("%-10s %-15s %-30s %-5s %-5s", "NIM", "Nama", "Mata Kuliah", "SKS", "Nilai"));
        for (Nilai16 nilai16 : daftarNilai) {
            System.out.println(nilai16);
        }
        System.out.println();
        System.out.print("Masukkan data mahasiswa[nim]  : ");
        String nim = sc.next();

        Mahasiswa16 selectMahasiswa = null;
        for (Mahasiswa16 mhs : daftarMahasiswa) {
            if (mhs.getNim().equals(nim)) {
                selectMahasiswa = mhs;
                break;
            }
        }
        if (selectMahasiswa == null) {
            System.out.println("Mahasiswa tidak ditemukan");
            return;
        }
        System.out.println(String.format("%-10s %-15s %-30s %-5s %-5s", "NIM", "Nama", "Mata Kuliah", "SKS", "Nilai"));
        int totalsks = 0;
        for (Nilai16 nilai16 : daftarNilai) {
            if (nilai16.getMahasiswa().getNim().equals(nim)) {
                System.out.println(nilai16);
                totalsks += nilai16.getMatkul().getSks();
            }
        }
        System.out.println("Total SKS " + totalsks + " telah diambil.");
        System.out.println();
    }
    public static void urutNilai() {
        System.out.println("Pilih urutan:");
        System.out.println("1. Ascending");
        System.out.println("2. Descending");
        System.out.print("Pilih: ");
        int pilih = sc.nextInt();

        if (pilih == 1) {
            Collections.sort(daftarNilai);
        } else if (pilih == 2) {
            Collections.sort(daftarNilai, Collections.reverseOrder());
        } else {
            System.out.println("Pilihan tidak valid.");
            return;
        }

        tampilNilai();
    }
}
