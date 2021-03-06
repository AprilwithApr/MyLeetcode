package code.my.leetcode.simple;

/**
 * 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
 * <p>
 * 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。例如，121 是回文，而 123 不是。
 * <p>
 * 示例 1：
 * <p>
 * 输入：x = 121
 * 输出：true
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/palindrome-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindromeV2(10));
        System.out.println(isPalindromeV2(123321));
    }

    //better than me in time
    static boolean isPalindromeV2(int x) {
        //if it end with zero,it must not be palindrome
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;
        int res = 0;
        while (x > res) {
            res = res * 10 + x % 10;
            x /= 10;
        }
        //完全回文如123321或者公用中间数值121
        return res == x || x == res / 10;
    }

    //my answer
    static boolean isPalindrome(int x) {
        if (x < 0) return false;
        int p = x;
        int res = 0;
        while (x > 0) {
            int a = x % 10;
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && a > 7)) return false;
            res = res * 10 + a;
            x /= 10;
        }
        return res == p;
    }
}
