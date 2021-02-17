package code.my.leetcode.sort;

public class InsertionSort {
    public static void main(String[] args) {
        int[] insertionSort = insertionSort(new int[]{7, 8, 2, 6, 0, 3, 6, 1});
        for (int i = 0; i < insertionSort.length; i++) {
            System.out.println(insertionSort[i]);
        }
    }

    private static int[] insertionSort(int[] a) {
        int current = 0;
        for (int i = 1, j; i < a.length; i++) {
            current = a[i];
            for (j = i - 1; j >= 0 && a[j] > current; j--) {
                a[j + 1] = a[j];
            }
            a[j + 1] = current;
        }
        return a;
    }
}
