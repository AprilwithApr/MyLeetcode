package code.my.leetcode.hard;

/**
 * 给定两个大小为 m 和 n 的正序（从小到大）数组nums1 和nums2。请你找出并返回这两个正序数组的中位数。
 * <p>
 * 进阶：你能设计一个时间复杂度为 O(log (m+n)) 的算法解决此问题吗？
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums1 = [1,3], nums2 = [2]
 * 输出：2.00000
 * 解释：合并数组 = [1,2,3] ，中位数 2
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/median-of-two-sorted-arrays
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{1, 2}, new int[]{4, 5}));
        System.out.println(findMedianSortedArrays(new int[]{}, new int[]{1}));
        System.out.println(findMedianSortedArrays(new int[]{0,0}, new int[]{0,0}));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums3 = new int[nums1.length + nums2.length];
        //a，b分别为两个数组的下标
        int a = 0, b = 0;
        for (int i = 0; i < nums3.length; i++) {
            if (a >= nums1.length) {
                nums3[i] = nums2[b++];
                continue;
            }
            if (b >= nums2.length) {
                nums3[i] = nums1[a++];
                continue;
            }
            if (nums1[a] == nums2[b]) {
                nums3[i] = nums1[a++];
                nums3[++i] = nums2[b++];
                continue;
            }
            nums3[i] = nums1[a] > nums2[b] ? nums2[b++] : nums1[a++];
        }
        return nums3.length % 2 == 0 ? (nums3[nums3.length / 2] + nums3[nums3.length / 2 - 1]) / 2.0 : nums3[nums3.length / 2];
    }
}
