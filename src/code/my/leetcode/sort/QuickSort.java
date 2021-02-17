package code.my.leetcode.sort;

public class QuickSort {
    public static void main(String[] args) {
        int[] quickSort = quickSort(new int[]{5, 8, 7, 6, 0, 3, 4, 1}, 0, 7);
        for (int i = 0; i < quickSort.length; i++) {
            System.out.println(quickSort[i]);
        }
    }

    private static int[] quickSort(int[] a, int start, int end) {
        int pivot = a[start];
        int i = start;
        int j = end;
        while (i < j) {
            while ((i < j) && (a[j] > pivot)) {
                j--;
            }
            while ((i < j) && (a[i] < pivot)) {
                i++;
            }
            if ((a[i] == a[j]) && (i < j)) {
                i++;
            } else {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        if (i - 1 > start) a = quickSort(a, start, i - 1);
        if (j + 1 < end) a = quickSort(a, j + 1, end);
        return a;
    }
}
