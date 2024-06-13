public class TransaksiPajak16 {
    int kode;
    long nominalBayar;
    long denda;
    int bulanBayar;
    Kendaraan16 kendaraan;
    TransaksiPajak16(int kode, long nominalBayar, long denda, int bulanBayar, Kendaraan16 kendaraan){
        this.kode = kode;
        this.nominalBayar = nominalBayar;
        this.denda = denda;
        this.bulanBayar = bulanBayar;
        this.kendaraan = kendaraan;
    }
    public int getKode() {
        return kode;
    }
    public long getNominalBayar() {
        return nominalBayar;
    }
    public long getDenda() {
        return denda;
    }
    public int getBulanBayar() {
        return bulanBayar;
    }
    public Kendaraan16 getKendaraan() {
        return kendaraan;
    }
    @Override
    public String toString() {
        return String.format("| %-5d | %-15d | %-10d | %-10d | %-15s |",
                kode, nominalBayar, denda, bulanBayar, kendaraan.getNoTNKB());
    }
    public long hitungTarifPajak() {
        long tarif = 0;
        if (kendaraan.getJenis().equalsIgnoreCase("motor")) {
            if (kendaraan.getCc() < 100) {
                tarif = 100000;
            } else if (kendaraan.getCc() >= 100 && kendaraan.getCc() <= 250) {
                tarif = 250000;
            } else if (kendaraan.getCc() > 250) {
                tarif = 500000;
            }
        } else if (kendaraan.getJenis().equalsIgnoreCase("mobil")) {
            if (kendaraan.getCc() < 1000) {
                tarif = 750000;
            } else if (kendaraan.getCc() >= 1000 && kendaraan.getCc() <= 2500) {
                tarif = 1000000;
            } else if (kendaraan.getCc() > 2500) {
                tarif = 1500000;
            }
        }
        return tarif;
    }
    public long hitungDenda() {
        long dendaTotal = 0;
        int bulanTelat = bulanBayar - kendaraan.getBulanHarusBayar();
        if (bulanTelat > 0) {
            if (bulanTelat <= 3) {
                dendaTotal = 50000 * bulanTelat;
            } else {
                dendaTotal = 50000 * 3 + 50000 * (bulanTelat - 3);
            }
        }
        return dendaTotal;
    }
}
