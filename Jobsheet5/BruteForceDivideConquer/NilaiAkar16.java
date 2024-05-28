public class NilaiAkar16 {
    public int nilai;

    public int nilaiAkarBF(int bilangan) {
        int akar = 0;
        while (akar * akar <= bilangan) {
            akar++;
        }
        return akar - 1;
    }

    public int nilaiAkarDC(int bilangan, int min, int max) {
        if (max < min) {
            return min - 1;
        }
        int mid = (min + max) / 2;
        if (mid * mid == bilangan) {
            return mid;
        } else if (mid * mid < bilangan) {
            return nilaiAkarDC(bilangan, mid + 1, max);
        } else {
            return nilaiAkarDC(bilangan, min, mid - 1);
        }
    }
}
