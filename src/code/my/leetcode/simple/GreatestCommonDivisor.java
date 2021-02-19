package code.my.leetcode.simple;

/**
 * @author :qiuyongfeng
 * @description :最大公约数
 * @date :2021-02-18
 **/
public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(gcd(20, 48));
        System.out.println(gcd2(20, 48));
    }

    private static int gcd(int p, int q) {
        if (q == 0) return p;
        return gcd(q, p % q);
    }

    private static int gcd2(int p, int q) {
        if (p == 0) return q;
        if (q == 0) return p;
        if (p > q) return gcd2(q, p % q);
        if (p < q) return gcd2(p, q % p);
        return 1;
    }
}
