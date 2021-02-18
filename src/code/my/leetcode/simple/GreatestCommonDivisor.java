package code.my.leetcode.simple;

/**
 * @author :qiuyongfeng
 * @description :最大公约数
 * @date :2021-02-18
 **/
public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(gcd(4, 18));
    }

    private static int gcd(int p, int q) {
        if (q == 0) return p;
        int r = p % q;
        return gcd(q, r);
    }
}
