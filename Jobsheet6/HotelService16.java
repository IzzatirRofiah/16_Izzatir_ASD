public class HotelService16 {
    Hotel16[] rooms = new Hotel16[5];
    int idx;

    void tambah(Hotel16 m) {
        if (idx < rooms.length) {
            rooms[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }

    void tampilAll() {
        for(Hotel16 m : rooms) {
            m.tampil();
            System.out.println("-----------------------------------");
        }
    }
    void bubbleSort() {
        for(int i =0; i < rooms.length-1; i++) {
            for(int j = 1; j < rooms.length; j++) {
                if (rooms[j].harga < rooms[j-1].harga) {
                    Hotel16 tmp = rooms[j];
                    rooms[j] = rooms[j-1];
                    rooms[j-1] = tmp;
                }
            }
        }
    }
    void bubbleSortBntg() {
        for(int i =0; i < rooms.length-1; i++) {
            for(int j = 1; j < rooms.length; j++) {
                if (rooms[j].bintang > rooms[j-1].bintang) {
                    Hotel16 tmp = rooms[j];
                    rooms[j] = rooms[j-1];
                    rooms[j-1] = tmp;
                }
            }
        }
    }
    void selectionSortBntg() {
        for(int i =0; i < rooms.length-1; i++){
            int idxmin = i;
            for(int j=i+1; j < rooms.length; j++) {
                if (rooms[j].bintang>rooms[idxmin].bintang) {
                    idxmin = j;
                }
            }
            Hotel16 tmp = rooms[idxmin];
            rooms[idxmin] = rooms[i];
            rooms[i] = tmp;
        }
    }
    void selectionSort() {
        for(int i =0; i < rooms.length-1; i++){
            int idxmin = i;
            for(int j=i+1; j < rooms.length; j++) {
                if (rooms[j].harga<rooms[idxmin].harga) {
                    idxmin = j;
                }
            }
            Hotel16 tmp = rooms[idxmin];
            rooms[idxmin] = rooms[i];
            rooms[i] = tmp;
        }
    }
}
