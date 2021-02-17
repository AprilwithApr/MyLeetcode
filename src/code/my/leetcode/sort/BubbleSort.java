package code.my.leetcode.sort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] bubbleSort = bubbleSort(new int[]{7,4,2,8,9,10});
        for (int i = 0; i < bubbleSort.length; i++) {
            System.out.println(bubbleSort[i]);
        }
    }

    private static int[] bubbleSort(int[] a) {
        boolean hasChange = true;
        int tmp = 0;
        for (int i = 0; i < a.length - 1 && hasChange; i++) {
            hasChange = false;
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                    hasChange = true;
                }
            }
        }
        return a;
    }
}
