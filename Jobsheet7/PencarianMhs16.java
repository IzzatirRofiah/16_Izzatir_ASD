public class PencarianMhs16 {
    Mahasiswa16 listMhs[] = new Mahasiswa16[5];
    int idx;

    PencarianMhs16(int jumlahMahasiswa) {
        listMhs = new Mahasiswa16[jumlahMahasiswa];
                idx = 0;
        }
    void tambah(Mahasiswa16 m){
        if (idx < listMhs.length){
            listMhs[idx] = m;
            idx ++;
        } else {
            System.out.println("Data sudah penuh !!");
        }
    }
    void tampil() {
        for (Mahasiswa16 m : listMhs){
            m.tampil();
            System.out.println("----------------------------");
        }
    }
    public int FindSeqSearch(int cari){
        int posisi = -1;
        for (int j = 0; j < listMhs.length; j++){
            if (listMhs[j].nim == cari){
                posisi = j;
                break;
            }
        }
        return posisi;
    }
    public void TampilPosisi(int x, int pos){
        if (pos!= -1){
            System.out.println("data : " + x + "ditemukan pada indeks " + pos);
        } else {
            System.out.println("data : " + x + "tidak ditemukan");
        }
    }
    public void TampilData(int x, int pos){
        if (pos!= -1){
            System.out.println("NIM\t : " + x);
            System.out.println("Nama\t : " + listMhs[pos].nama);
            System.out.println("Umur\t : " + listMhs[pos].umur);
            System.out.println("IPK\t : " + listMhs[pos].ipk);
        } else {
            System.out.println("data " + x + "tidak ditemukan");
        }
    }
    public int FindBinarySearch(int cari, int left, int rigth){
        int mid;
        if (rigth >= left){
            mid = (left + rigth) /2;
            if (cari == listMhs[mid].nim){
                return (mid);
            } else if (listMhs[mid].nim < cari) {
                return FindBinarySearch(cari, left, mid -1);
            } else {
                return FindBinarySearch(cari, mid + 1, rigth);
            }
        }
        return -1;
    }
}
