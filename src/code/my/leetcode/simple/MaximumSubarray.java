package code.my.leetcode.simple;

import java.util.LinkedList;

/**
 * @author :qiuyongfeng
 * @description :
 * @date :2021-02-25
 *
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 **/
public class MaximumSubarray {

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }

    public static int maxSubArray(int[] nums){

        LinkedList<Integer> deque = new LinkedList<>();
        int sum = nums[0];

        for (int i = 0; i < nums.length; i++) {

        }

        return sum;
    }
}
