public class Nilai16 implements Comparable<Nilai16> {
    private Mahasiswa16 mahasiswa;
    private MataKuliah16 matkul;
    private double nilai;
    public Nilai16(Mahasiswa16 mahasiswa, MataKuliah16 matkul, double nilai) {
        this.mahasiswa = mahasiswa;
        this.matkul = matkul;
        this.nilai = nilai;
    }
    public Mahasiswa16 getMahasiswa() {
        return mahasiswa;
    }
    public MataKuliah16 getMatkul() {
        return matkul;
    }
    public double getNilai() {
        return nilai;
    }
    @Override
    public int compareTo(Nilai16 o) {
        // For example, compare by nilai
        return Double.compare(this.nilai, o.nilai);
    }
    @Override
    public String toString() {
        return String.format("%-10s %-15s %-30s %-5d %-5.2f",
                mahasiswa.getNim(), mahasiswa.getNama(), matkul.getMatkul(), matkul.getSks(), nilai);
    }
}
