package code.my.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组 nums和一个整数目标值 target，请你在该数组中找出 和为目标值 的那两个整数，并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 * 你可以按任意顺序返回答案。
 * 示例 1：
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1]
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 **/
public class TwoSum {

    public static void main(String[] args) {
        int[] ints = twoSum(new int[]{2, 7, 11, 15}, 26);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        //k：每个位置的元素所需的值  v：每个位置元素的下标
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) == null)
                map.put(target - nums[i], i);
            else
                return new int[]{map.get(nums[i]), i};
        }
        return null;
    }
}
