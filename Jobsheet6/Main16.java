import java.util.Scanner;
public class Main16 {
    public static void main(String[] args) {
        DaftarMahasiswaBerprestasi16 list = new DaftarMahasiswaBerprestasi16();
        Mahasiswa16 m1 = new Mahasiswa16("Nusa",2017,25,3);
        Mahasiswa16 m2 = new Mahasiswa16("Rara",2012,19,4);
        Mahasiswa16 m3 = new Mahasiswa16("Dompu",2018,19,3.5);
        Mahasiswa16 m4 = new Mahasiswa16("Abdul",2017,23,2);
        Mahasiswa16 m5 = new Mahasiswa16("Ummi",2019,21,3.75);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println();
        System.out.println("Data Mahasiswa Sebelum Sorting : ");
        System.out.println("----------------------------------------------------");
        list.tampil();

        System.out.println();
        System.out.println("Data Mahasiswa Setelah Sorting DESC Berdasarkan IPK");
        System.out.println("----------------------------------------------------");
        list.bubbleSort();
        list.tampil();

        System.out.println();
        System.out.println("Data Mahasiswa Setelah Sorting ASC Berdasarkan IPK");
        System.out.println("----------------------------------------------------");
        list.selectionSort();
        list.tampil();

        System.out.println();
        System.out.println("Data Mahasiswa Setelah Sorting ASC Berdasarkan IPK");
        System.out.println("----------------------------------------------------");
        list.insertionSort();
        list.tampil();
    }
}
