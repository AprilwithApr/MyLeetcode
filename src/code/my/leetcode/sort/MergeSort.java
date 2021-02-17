package code.my.leetcode.sort;

public class MergeSort {
    public static void main(String[] args) {
        int[] mergeSort = mergeSort(new int[]{7, 7, 2, 6, 0, 3, 6, 1}, 0, 7);
        for (int i = 0; i < mergeSort.length; i++) {
            System.out.println(mergeSort[i]);
        }
    }

    private static int[] mergeSort(int[] a, int left, int right) {
        if (left == right) {
            return new int[]{a[left]};
        }
        int mid = (right + left) / 2;
        int[] l = mergeSort(a, left, mid);
        int[] r = mergeSort(a, mid + 1, right);
        int[] res = new int[l.length + r.length];
        //rei：结果数组的下标 li：左数组的下标 ri：右数组的下标
        int rei = 0, li = 0, ri = 0;
        while(li < l.length && ri < r.length){
            res[rei++] = l[li] < r[ri] ? l[li++] : r[ri++];
        }
        while(li < l.length){
            res[rei++] = l[li++];
        }
        while(ri < r.length){
            res[rei++] = r[ri++];
        }
        return res;
    }

}
