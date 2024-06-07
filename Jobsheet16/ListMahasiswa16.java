import java.util.*;

public class ListMahasiswa16 {
    List<Mahasiswa16> mahasiswas = new ArrayList<>();
    public void tambah(Mahasiswa16... mahasiswa){

        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }
    public void hapus(int index){

        mahasiswas.remove(index);
    }
    public void update(int index, Mahasiswa16 mhs){

        mahasiswas.set(index, mhs);
    }
    public void tampil(){
        mahasiswas.stream().forEach(mhs ->{
            System.out.println(""+mhs.toString());
        });
    }
    int linearSearch(String nim){
        for(int i =0; i < mahasiswas.size(); i++){
            if (nim.equals(mahasiswas.get(i).nim)) {
                return i;
            }
        }
        return -1;
    }
    public int binarySearch(String nim) {
        for (int i = 0; i < mahasiswas.size(); i++){
            if (nim.equals(mahasiswas.get(i).nim)){
                return i;
            }
        }
        return -1;
    }
    public void sortAscending() {
        Collections.sort(mahasiswas, Comparator.comparing(mahasiswa16 -> mahasiswa16.nim));
    }
    public void sortDescending() {
        Collections.sort(mahasiswas, (m1, m2) -> m2.nim.compareTo(m1.nim));
    }
    public static void main(String[] args) {
        ListMahasiswa16 lm = new ListMahasiswa16();
        Mahasiswa16 m = new Mahasiswa16("201234", "Noureen", "021xx1");
        Mahasiswa16 m1 = new Mahasiswa16("201235", "Akhleema", "021xx2");
        Mahasiswa16 m2 = new Mahasiswa16("201236", "Shannum", "021xx3");
        // menambahkan objek mahasiswa
        lm.tambah(m, m1, m2);
        // menampilkan list mahasiswa
        lm.tampil();
        // update mahasiswa
        lm.update(lm.binarySearch("201235"), new Mahasiswa16("201235", "Akhleema Lela", "021xx2"));
        System.out.println("");
        lm.tampil();
        // mengurutkan secara ascending
        lm.sortAscending();
        System.out.println("\nDaftar Mahasiswa setelah diurutkan secara ascending : ");
        lm.tampil();
        // mengurutkan secara descending
        lm.sortDescending();
        System.out.println("\nDaftar Mahasiswa setelah diurutkan secara desscending : ");
        lm.tampil();
    }
}
