import java.util.Scanner;
public class Main16 {
    public static void main(String[] args) {
        LinkedList16 list = new LinkedList16();
        Scanner scanner = new Scanner(System.in);

        // Data awal
        list.add(new Mahasiswa16("2341", "Abel Falmanio", "01-01-2000", "Jl. Merdeka 1"));
        list.add(new Mahasiswa16("2342", "Ainun Hendar", "02-03-2005", "Jl. Merdeka 2"));
        list.add(new Mahasiswa16("2343", "Annisatun Karimah", "05-09-2004", "Jl. Merdeka 3"));
        list.add(new Mahasiswa16("2344", "Akmal Nur", "04-04-2003", "Jl. Merdeka 4"));
        list.add(new Mahasiswa16("2345", "Loice Edward", "23-04-2004", "Jl. Merdeka 5"));
        list.add(new Mahasiswa16("2346", "Khinpun Ezra", "16-04-2004", "Jl. Merdeka 6"));

        while (true) {
            System.out.println("---SISTEM PENDATAAN MAHASISWA POLINEMA---");
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa");
            System.out.println("3. Cari Mahasiswa");
            System.out.println("4. Cetak Semua Mahasiswa");
            System.out.println("5. Keluar");
            System.out.println("-----------------------------------------");
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
                    if (list.remove(nim)) {
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
                    System.out.println();
                    Mahasiswa16 mhs = list.get(nim);
                    if (mhs != null) {
                        System.out.println(mhs);
                    } else {
                        System.out.println("Mahasiswa tidak ditemukan.");
                    }
                    System.out.println();
                    break;
                case 4:
                    System.out.println();
                    System.out.println("--------------------DATA MAHASISWA POLINEMA--------------------");
                    list.printAll();
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
