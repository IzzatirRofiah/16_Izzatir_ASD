public class Mahasiswa16 {
    private String nim;
    private String nama;
    private String tglLahir;
    private String alamat;

    // Konstruktor default
    public Mahasiswa16() {
    }

    // Konstruktor berparameter
    public Mahasiswa16(String nim, String nama, String tglLahir, String alamat) {
        this.nim = nim;
        this.nama = nama;
        this.tglLahir = tglLahir;
        this.alamat = alamat;
    }

    // Getter dan Setter
    public String getNim() {
        return nim;
    }
    public void setNim(String nim) {
        this.nim = nim;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getTglLahir() {
        return tglLahir;
    }
    public void setTglLahir(String tglLahir) {
        this.tglLahir = tglLahir;
    }
    public String getAlamat() {
        return alamat;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    @Override
    public String toString() {
        return String.format("%-10s %-20s %-15s %-30s", nim, nama, tglLahir, alamat);
    }
}
