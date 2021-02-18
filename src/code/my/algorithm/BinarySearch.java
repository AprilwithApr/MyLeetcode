package code.my.algorithm;

/**
 * @author :qiuyongfeng
 * @description :
 * @date :2021-02-18
 **/
public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        System.out.println(binarySearchRecursive(nums, 10, 0, 10));
        System.out.println(binarySearchNoRecurive(nums, 10));
    }

    /**
     * Time complexity: O(logn)
     *
     * @param nums
     * @param target
     * @return target index,-1 means not find
     */
    static int binarySearchRecursive(int[] nums, int target, int begin, int end) {
        if (begin > end) {
            return -1;
        }
        int mid = begin + (end - begin) / 2;
        if (nums[mid] == target) {
            return mid;
        }
        if (target > nums[mid]) {
            return binarySearchRecursive(nums, target, mid + 1, end);
        } else {
            return binarySearchRecursive(nums, target, begin, mid - 1);
        }
    }

    static int binarySearchNoRecurive(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        int mid;
        while (i <= j) {
            mid = i + (j - i) / 2;
            if (nums[mid] == target) return mid;
            if (nums[mid] > target) j = mid - 1;
            if (nums[mid] < target) i = mid + 1;
        }
        return -1;
    }
}
