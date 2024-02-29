public class Tugas1_16 {
    public String nama;
    public String jenisKelamin;
    public int NIM;
    public double IPK;

    public Tugas1_16(){

    }
    public Tugas1_16(int N, double IP, String name, String JK){
        nama = name;
        jenisKelamin = JK;
        NIM = N;
        IPK = IP;
    }
    void tampilInformasi(int i){
        System.out.println();
        System.out.println("Mahasiswa ke-" + (i + 1));
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + NIM);
        System.out.println("Jenis Kelamin : " + jenisKelamin);
        System.out.println("IPK : " + IPK);
    }
}
