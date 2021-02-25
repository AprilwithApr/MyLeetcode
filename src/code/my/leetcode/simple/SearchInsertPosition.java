package code.my.leetcode.simple;

/**
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * <p>
 * 你可以假设数组中无重复元素。
 */
public class SearchInsertPosition {
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 5));
    }

    public static int searchInsert(int[] nums, int target) {

        if (nums.length == 0 || target < nums[0]) return 0;
        if (target > nums[nums.length - 1]) return nums.length;

        int i = 0;
        int j = nums.length;
        int pos = -1;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (nums[mid] == target) {
                pos = mid;
                break;
            }
            if (nums[mid] < target) {
                i = mid + 1;
            }
            if (nums[mid] > target) {
                j = mid - 1;
            }
        }
        return pos != -1 ? pos : i;
    }
}
