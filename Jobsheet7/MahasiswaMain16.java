import java.util.Scanner;
public class MahasiswaMain16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        PencarianMhs16 data = new PencarianMhs16();
        int jumMhs = 5;
        System.out.println("-----------------------------------------------------");
        System.out.println("Masukkan data mahasiswa secara Urut dari NIM Terkecil");
        for (int i = 0; i < jumMhs; i++) {
            System.out.println("----------------------");
            System.out.print("NIM\t\t : ");
            int nim = s.nextInt();
            System.out.print("Nama\t : ");
            String nama = s1.nextLine();
            System.out.print("Umur\t : ");
            int umur = s.nextInt();
            System.out.print("IPK\t\t : ");
            double ipk = s.nextDouble();

            Mahasiswa16 m = new Mahasiswa16(nim, nama, umur, ipk);
            data.tambah(m);
        }
            System.out.println("-------------------------------------------------");
            System.out.println("Data keseluruhan Mahasiswa : ");
            data.tampil();
            System.out.println("_________________________________________________");
            System.out.println("_________________________________________________");
            System.out.println("Pencarian Data : ");
            System.out.println("Masukkan NIM Mahasiswa yang dicari : ");
            System.out.print("NIM : ");
            int cari = s.nextInt();
            System.out.println("Menggunakan sequential Search");
            int posisi = data.FindSeqSearch(cari);

            data.TampilPosisi(cari, posisi);
            data.TampilData(cari,posisi);

            System.out.println("=================================================");
            System.out.println("Menggunakan binary Search");
            posisi = data.FindBinarySearch(cari, 0, jumMhs -1);

            data.TampilPosisi(cari, posisi);
            data.TampilData(cari,posisi);
    }
}
