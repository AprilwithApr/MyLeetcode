package code.my.leetcode.simple;

/**
 * @author :qiuyongfeng
 * @description :
 * @date :2021-03-01
 * 实现 int sqrt(int x) 函数。
 * <p>
 * 计算并返回 x 的平方根，其中 x 是非负整数。
 * <p>
 * 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/sqrtx
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/
public class Sqrtx {
    public static void main(String[] args) {
        System.out.println(mySqrt(2147395599));
    }

    public static int mySqrt(int x) {
        if (x == 1) return 1;
        int left = 0;
        int right = x;
        int mid = right;
        while (mid > 0) {
            mid = left + (right - left) / 2;
            double v = (double) mid * mid;
            if (v == x) {
                return mid;
            }
            if (v > x) {
                if ((mid - 1.0) * (mid - 1.0) <= x) {
                    return mid - 1;
                }
                right = mid;
            }
            if (v < x) {
                if ((mid + 1.0) * (mid + 1.0) >= x) {
                    return mid;
                }
                left = mid;
            }
        }
        return 0;
    }
}
