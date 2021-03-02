package code.my.leetcode.simple;

/**
 * @author :qiuyongfeng
 * @description :
 * @date :2021-03-02
 * <p>
 * <p>
 * 给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
 * <p>
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。你可以假设 nums1 的空间大小等于 m + n，这样它就有足够的空间保存来自 nums2 的元素。
 **/
public class MergeSortedArray {

    public static void main(String[] args) {
        merge(new int[]{0}, 0, new int[]{1}, 1);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums2[j] <= nums1[i]) {
                for (int p = m; p > i; p--) {
                    nums1[p] = nums1[p - 1];
                }
                nums1[i++] = nums2[j++];
                m++;
            } else {
                i++;
                if (i >= m) {
                    for (i = m; i < nums1.length; i++) {
                        nums1[i] = nums2[j++];
                    }
                }
            }
        }
        for (int i1 = 0; i1 < nums1.length; i1++) {
            System.out.println(nums1[i1]);
        }
    }
}
