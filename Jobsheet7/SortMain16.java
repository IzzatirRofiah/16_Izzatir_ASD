public class SortMain16 {
    public static void main(String[] args) {
        int data[] = {10, 40, 30, 50, 70, 20, 100, 90};
        System.out.println("Sorting dengan merge sort");
        MergeSort16 mSort = new MergeSort16();
        System.out.println("-------------------------");
        System.out.println("Data awal");
        mSort.PrintArray(data);
        mSort.mergeSort(data);
        System.out.println("-------------------------");
        System.out.println("Setelah diurutkan");
        mSort.PrintArray(data);
    }
}
