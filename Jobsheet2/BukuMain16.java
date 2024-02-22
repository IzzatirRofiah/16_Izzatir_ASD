public class BukuMain16 {
    public static void main (String[] args) {
        Buku16 bk1 = new Buku16();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denada Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        Buku16 bk2 = new Buku16("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        Buku16 bukuIzzatir = new Buku16("Hujan", "Tere Liye", 332, 50, 89000);
        bukuIzzatir.tampilInformasi();

        int jumlahTerjual = 5;
        int hargaTotal = bukuIzzatir.hitungHargaTotal(jumlahTerjual);
        int diskon = bukuIzzatir.hitungDiskon(hargaTotal);
        int hargaBayar = bukuIzzatir.hitungHargaBayar(hargaTotal, diskon);

        System.out.println("Jumlah terjual : " + jumlahTerjual);
        System.out.println("Harga total: Rp " + hargaTotal);
        System.out.println("Diskon: Rp " + diskon);
        System.out.println("Harga bayar: Rp " + hargaBayar);
    }
}
