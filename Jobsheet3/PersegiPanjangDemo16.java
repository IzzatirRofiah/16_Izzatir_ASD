import java.util.Scanner;
public class PersegiPanjangDemo16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int panjang, lebar;

        System.out.print("Masukkan jumlah persegi panjang : ");
        int length = sc.nextInt();
        PersegiPanjang16[] arrayOfPersegiPanjang = new PersegiPanjang16[length];

//        Percobaan 1
//        arrayOfPersegiPanjang[0] = new PersegiPanjang16();
//        arrayOfPersegiPanjang[0].panjang = 110;
//        arrayOfPersegiPanjang[0].lebar = 30;
//
//        arrayOfPersegiPanjang[1] = new PersegiPanjang16();
//        arrayOfPersegiPanjang[1].panjang = 80;
//        arrayOfPersegiPanjang[1].lebar = 40;
//
//        arrayOfPersegiPanjang[2] = new PersegiPanjang16();
//        arrayOfPersegiPanjang[2].panjang = 100;
//        arrayOfPersegiPanjang[2].lebar = 20;
//
//        System.out.println("Persegi panjang ke-1, panjang : " + arrayOfPersegiPanjang[0].panjang + ", lebar : " + arrayOfPersegiPanjang[0].lebar);
//        System.out.println("Persegi panjang ke-2, panjang : " + arrayOfPersegiPanjang[1].panjang + ", lebar : " + arrayOfPersegiPanjang[1].lebar);
//        System.out.println("Persegi panjang ke-3, panjang : " + arrayOfPersegiPanjang[2].panjang + ", lebar : " + arrayOfPersegiPanjang[2].lebar);

//        Percobaan 2
//        for (int i = 0; i < 3; i++) {
//            arrayOfPersegiPanjang[i] = new PersegiPanjang16();
//
//            System.out.println();
//            System.out.println("Persegi panjang ke-" + (i + 1));
//            System.out.print("Masukkan panjang : ");
//            arrayOfPersegiPanjang[i].panjang = sc.nextInt();
//            System.out.print("Masukkan lebar : ");
//            arrayOfPersegiPanjang[i].lebar = sc.nextInt();
//        }
//        System.out.println();
//        for (int i = 0; i < 3; i++) {
//            System.out.println("Persegi panjang ke-" + (i + 1) + ", panjang : " + arrayOfPersegiPanjang[i].panjang + ", lebar : " + arrayOfPersegiPanjang[i].lebar);
//        }

//      Pecobaan3
        for (int i = 0; i < length; i++) {
            System.out.println("Persegi panjang ke-" + (i + 1));
            System.out.print("Masukkan panjang : ");
            panjang = sc.nextInt();
            System.out.print("Masukkan lebar : ");
            lebar = sc.nextInt();
            System.out.println();

            arrayOfPersegiPanjang[i] = new PersegiPanjang16(panjang, lebar);
        }

//      Modif percobaan 2
        System.out.println();
        for(int i = 0; i < length; i++) {
            arrayOfPersegiPanjang[i].cetakInfo(i);
            arrayOfPersegiPanjang[i].hitungLuas();
            arrayOfPersegiPanjang[i].hitungKeliling();
        }
    }
}