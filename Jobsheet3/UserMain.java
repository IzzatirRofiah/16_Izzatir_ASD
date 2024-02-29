import java.util.Scanner;

public class UserMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah user: ");
        int jumlah = sc.nextInt();
        User[] arrayUser = new User[jumlah];

        for(int i = 0; i < arrayUser.length; i++){
            System.out.println();
            arrayUser[i] = new User();
            System.out.println("Masukkan User ke-"+(i+1));
            System.out.print("Username: ");
            String username = sc.next();
            System.out.print("Password: ");
            String password = sc.next();

            arrayUser[i] = new User(username, password);
        }

        for(int i = 0; i < arrayUser.length; i++){
            System.out.println();
            arrayUser[i].cetakInfo(i);
        }
    }
}
