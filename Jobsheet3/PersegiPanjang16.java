public class PersegiPanjang16 {
    public int panjang;
    public int lebar;

    public PersegiPanjang16() {

    }
    public PersegiPanjang16(int p, int l) {
        panjang = p;
        lebar = l;
    }
    void hitungLuas(){
        int Luas = panjang * lebar;
        System.out.print("Luas: " + Luas);
    }
    void hitungKeliling(){
        int Keliling = 2 * (panjang + lebar);
        System.out.println(", Keliling: " + Keliling);
    }
    void cetakInfo(int i){
        System.out.println("Persegi panjang ke-" + (i+1) + ", panjang: " + panjang + ", lebar: " + lebar);
    }
}