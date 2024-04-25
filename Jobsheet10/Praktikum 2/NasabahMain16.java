import java.util.Scanner;
public class NasabahMain16 {
    public static void menu() {
        System.out.println("Pilih menu: ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek Antrian terdepan");
        System.out.println("4. Cek Semua Antrian");
        System.out.println("5. Cek Antrian paling belakang");
        System.out.println("-------------------------------");
    }
    public static void main(String[] args) {
        Scanner sc07 = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue: ");
        int Jumlah = sc07.nextInt();
        NasabahQueue16 antri = new NasabahQueue16(Jumlah);

        int pilih;
        do{
            menu();
            pilih = sc07.nextInt();
            sc07.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("No Rekening : ");
                    String norek = sc07.nextLine();
                    System.out.print("Nama : ");
                    String nama = sc07.nextLine();
                    System.out.print("Alamat : ");
                    String alamat = sc07.nextLine();
                    System.out.print("Umur : ");
                    int umur = sc07.nextInt();
                    System.out.print("Saldo : ");
                    double saldo = sc07.nextDouble();
                    Nasabah16 nb = new Nasabah16(norek,nama,alamat,umur,saldo);
                    sc07.nextLine();
                    antri.Enqueue(nb);
                    break;
                case 2:
                    Nasabah16 data = antri.Dequeue();
                    if (!"".equals(data.noRek) && !"".equals(data.nama) && !"".equals(data.alamat)
                            && data.umur != 0 && data.saldo != 0){
                        System.out.println("Antrian yang keluar : " + data.noRek + " " + data.nama + " " + data.alamat
                                + " " + data.umur + " " + data.saldo);
                        break;
                    }
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.print();
                    break;
                case 5:
                    Nasabah16 rearData = antri.peekRear();
                    if (rearData != null) {
                        System.out.println("Antrian paling belakang: " + rearData.alamat + " " + rearData.umur + " "
                                + rearData.noRek + " " + rearData.saldo + " " + rearData.nama);
                    }
                    break;
            }
        }while ( pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);
    }
}
