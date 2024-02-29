public class User {
    public String username;
    public String password;

    public User(){

    }
    public User(String user, String pass){
        username = user;
        password = pass;
    }

    void cetakInfo(int i){
        System.out.println("Data User ke-"+(i+1));
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }
}
