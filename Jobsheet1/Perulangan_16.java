import java.util.Scanner;

public class Perulangan_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===========================");
        System.out.println("|        PERULANGAN       |");
        System.out.println("---------------------------");
        System.out.print("Masukkan NIM : ");
        String nim = scanner.nextLine();
        int duaAngkaTerakhir = Integer.parseInt(nim.substring(nim.length() - 2));
        System.out.println("---------------------------");

        int n = duaAngkaTerakhir;
        if (n < 10) {
            n += 10;
        }

        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue;
            } else if (i % 2 == 0) {
                System.out.print(i + " ");
            } else {
                System.out.print("* ");
            }
        }
        System.out.println();
        System.out.println("===========================");
    }
}