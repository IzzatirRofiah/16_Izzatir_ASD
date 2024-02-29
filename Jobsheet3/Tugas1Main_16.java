import java.util.Scanner;

public class Tugas1Main_16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Tugas1_16[] arrayOfTugas1 = new Tugas1_16[3];
        int NIM;
        double IPK;
        String nama, JenisKelamin;
        double totalIPK = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println();
            System.out.println("Masukkan data Mahasiswa ke-" + (i + 1));
            System.out.print("Masukkan Nama : ");
            nama = sc.next();
            System.out.print("Masukkan NIM : ");
            NIM = sc.nextInt();
            System.out.print("Masukkan Jenis Kelamin : ");
            JenisKelamin = sc.next();
            System.out.print("Masukkan IPK : ");
            IPK = sc.nextDouble();

            arrayOfTugas1[i] = new Tugas1_16(NIM, IPK, nama, JenisKelamin);
            totalIPK += IPK;
        }
        int index = 0;
        for (Tugas1_16 mahasiswa : arrayOfTugas1) {
            mahasiswa.tampilInformasi(index);
            index++;
        } if (3 != 0) {
            System.out.println();
            double rata2 = totalIPK/3;
            System.out.println("Rata-rata IPK : " + rata2);
        }
    }
}
