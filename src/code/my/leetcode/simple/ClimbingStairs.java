package code.my.leetcode.simple;

/**
 * @author :qiuyongfeng
 * @description :
 * @date :2021-03-01
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * <p>
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * <p>
 * 注意：给定 n 是一个正整数。
 **/
public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(climbingStairs(2));
        System.out.println(climbingStairs(3));
        System.out.println(climbingStairs(4));
    }

    static int climbingStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 2;
        for (int i = 2; i < n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n-1];
    }
}
