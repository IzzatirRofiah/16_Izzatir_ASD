import java.util.Scanner;
public class MainHotel16 {
        static void menu() {
            Scanner sc15 = new Scanner(System.in);
            HotelService16 list = new HotelService16();
            Hotel16 r1 = new Hotel16("Mulia", "Bali", 300000, (byte) 5);
            Hotel16 r2 = new Hotel16("Oberoi", "Lombok", 500000, (byte) 4);
            Hotel16 r3 = new Hotel16("Nihi", "Sumba", 150000, (byte) 2);
            Hotel16 r4 = new Hotel16("Gaia", "Bandung", 700000, (byte) 3);
            Hotel16 r5 = new Hotel16("Hilton", "Surabaya", 2000000, (byte) 5);

            list.tambah(r1);
            list.tambah(r2);
            list.tambah(r3);
            list.tambah(r4);
            list.tambah(r5);

            System.out.println();
            System.out.println("Sorting Hotel:");
            System.out.println("1. Data Hotel");
            System.out.println("2. Sorting harga terendah - tertinggi(Bubble Sort)");
            System.out.println("3. Sorting Bintang tertinggi - terendah(Bubble Sort)");
            System.out.println("4. Sorting harga terendah - tertinggi(Selection Sort)");
            System.out.println("5. Sorting Bintang tertinggi - terendah(Selection Sort)");
            System.out.print("Silahkan pilih menu: ");
            int menu = sc15.nextInt();

            switch (menu) {
                case 1:
                    System.out.println();
                    System.out.println("Data hotel sebelum sorting");
                    System.out.println("-----------------------------------");
                    list.tampilAll();
                    System.out.print("Done? (y/n) : ");
                    String pilih = sc15.next();
                    if (pilih.equalsIgnoreCase("y")) {
                        System.exit(0);
                    } else {
                        menu();
                    }
                case 2:
                    System.out.println();
                    System.out.println("Data hotel dari harga termurah");
                    System.out.println("-----------------------------------");
                    list.bubbleSort();
                    list.tampilAll();
                    System.out.print("Done? (y/n) : ");
                    pilih = sc15.next();
                    if (pilih.equalsIgnoreCase("y")) {
                        System.exit(0);
                    } else {
                        menu();
                    }
                case 3:
                    System.out.println();
                    System.out.println("Data hotel dari Bintang tertinggi");
                    System.out.println("-----------------------------------");
                    list.bubbleSortBntg();
                    list.tampilAll();
                    System.out.print("Done? (y/n) : ");
                    pilih = sc15.next();
                    if (pilih.equalsIgnoreCase("y")) {
                        System.exit(0);
                    } else {
                        menu();
                    }
                case 4:
                    System.out.println();
                    System.out.println("Data hotel dari harga termurah");
                    System.out.println("-----------------------------------");
                    list.selectionSort();
                    list.tampilAll();
                    System.out.print("Done? (y/n) : ");
                    pilih = sc15.next();
                    if (pilih.equalsIgnoreCase("y")) {
                        System.exit(0);
                    } else {
                        menu();
                    }
                case 5:
                    System.out.println();
                    System.out.println("Data hotel dari Bintang tertinggi");
                    list.selectionSortBntg();
                    list.tampilAll();
                    System.out.print("Done? (y/n) : ");
                    pilih = sc15.next();
                    if (pilih.equalsIgnoreCase("y")) {
                        System.exit(0);
                    } else {
                        menu();
                    }
                default:
                    System.out.println("Input tidak valid!");
                    break;
            }
        }

        public static void main(String[] args) {

            menu();
        }
    }
