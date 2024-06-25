import java.util.ArrayList;
import java.util.Scanner;
public class MainJavaCollection16 {
    public static void main(String[] args) {
        ArrayList<Mahasiswa16> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Data awal
        list.add(new Mahasiswa16("23411", "Dimas Falentino", "01-01-2000", "Jl. Manggala 1"));
        list.add(new Mahasiswa16("23412", "Rafa Ramadan", "02-03-2005", "Jl. Puspita 10"));
        list.add(new Mahasiswa16("23413", "Ani Salsabila", "05-09-2004", "Jl. Andong 15"));
        list.add(new Mahasiswa16("23414", "Bella Nurrohmah", "04-04-2003", "Jl. Merdeka 2"));

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa");
            System.out.println("3. Cari Mahasiswa");
            System.out.println("4. Cetak Semua Mahasiswa");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            switch (choice) {
                case 1:
                    System.out.println();
                    System.out.print("NIM: ");
                    String nim = scanner.nextLine();
                    System.out.print("Nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("Tanggal Lahir: ");
                    String tglLahir = scanner.nextLine();
                    System.out.print("Alamat: ");
                    String alamat = scanner.nextLine();
                    list.add(new Mahasiswa16(nim, nama, tglLahir, alamat));
                    System.out.println();
                    break;
                case 2:
                    System.out.println();
                    System.out.print("NIM: ");
                    nim = scanner.nextLine();
                    boolean found = false;
                    for (Mahasiswa16 m : list) {
                        if (m.getNim().equals(nim)) {
                            list.remove(m);
                            found = true;
                            break;
                        }
                    }
                    if (found) {
                        System.out.println("Mahasiswa berhasil dihapus.");
                    } else {
                        System.out.println("Mahasiswa tidak ditemukan.");
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println();
                    System.out.print("NIM: ");
                    nim = scanner.nextLine();
                    found = false;
                    for (Mahasiswa16 m : list) {
                        if (m.getNim().equals(nim)) {
                            System.out.println(m);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Mahasiswa tidak ditemukan.");
                    }
                    System.out.println();
                    break;
                case 4:
                    System.out.println();
                    System.out.println(String.format("%-10s %-20s %-15s %-30s", "NIM", "Nama", "Tanggal Lahir", "Alamat"));
                    for (Mahasiswa16 m : list) {
                        System.out.println(m);
                    }
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Keluar...");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
