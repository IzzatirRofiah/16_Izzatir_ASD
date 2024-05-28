public class Struk16 {
    int nomorTransaksi;
    String tanggalPembelian;
    int jumlahBarang;
    double totalHargaBayar;

    public Struk16(int nomorTransaksi, String tanggalPembelian, int jumlahBarang, double totalHargaBayar) {
        this.nomorTransaksi = nomorTransaksi;
        this.tanggalPembelian = tanggalPembelian;
        this.jumlahBarang = jumlahBarang;
        this.totalHargaBayar = totalHargaBayar;
    }
    public String toString() {
        return "Nomor Transaksi: " + nomorTransaksi +
                "\nTanggal Pembelian: " + tanggalPembelian +
                "\nJumlah Barang: " + jumlahBarang +
                "\nTotal Harga Bayar: " + totalHargaBayar + "\n";
    }
}
