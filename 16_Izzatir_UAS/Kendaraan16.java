public class Kendaraan16 {
    String noTNKB;
    String nama;
    String jenis;
    int cc;
    int tahun;
    int bulanHarusBayar;
    Kendaraan16(String noTNBK, String nama, String jenis, int cc, int tahun, int bulanHarusBayar){
        this.noTNKB = noTNBK;
        this.nama = nama;
        this.jenis = jenis;
        this.cc = cc;
        this.tahun = tahun;
        this.bulanHarusBayar = bulanHarusBayar;
    }
    public String getNoTNKB() {
        return noTNKB;
    }
    public String getNama() {
        return nama;
    }
    public String getJenis() {
        return jenis;
    }
    public int getCc() {
        return cc;
    }
    public int getTahun() {
        return tahun;
    }
    public int getBulanHarusBayar() {
        return bulanHarusBayar;
    }
    @Override
    public String toString() {
        return String.format("| %-10s | %-15s | %-10s | %-4d | %-5d | %-15d |",
                noTNKB, nama, jenis, cc, tahun, bulanHarusBayar);
    }
}
