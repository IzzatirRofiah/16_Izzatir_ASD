import java.util.Scanner;
public class GraphMain16 {
    public static void main(String[] args) throws Exception {
        Graph16 gedung = new Graph16(6);
        gedung.addEdge(0, 1, 50);
        gedung.addEdge(0, 2, 100);
        gedung.addEdge(1, 3, 70);
        gedung.addEdge(2, 3, 40);
        gedung.addEdge(3, 4, 60);
        gedung.addEdge(4, 5, 80);
        //Percobaan 1
        // gedung.degree(0);
        // gedung.printGraph();

        // gedung.removeEdge(1, 3);
        // gedung.printGraph();
        //End Percobaan 1

        //Modifikasi Percobaan 1 Nomor 5
        Scanner sc = new Scanner(System.in);
        int asal, tujuan;

        System.out.print("Masukkan inputan: ");
        int input = sc.nextInt();

        for (int i = 0; i < input; i++) {
            System.out.print("Masukkan gedung asal: ");
            asal = sc.nextInt();
            System.out.print("Masukkan gedung tujuan: ");
            tujuan = sc.nextInt();
            if (gedung.ifTrue(asal, tujuan)) {
                System.out.println("Gedung " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan) + " bertetangga");
            } else {
                System.out.println("Gedung " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan) + " tidak bertetangga");
            }
            System.out.println();
        }
        sc.close();
        //End Modifikasi Percobaan 1 Nomor 5
    }
}
