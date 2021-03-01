package code.my.leetcode.simple;

import java.util.Arrays;

/**
 * @author :qiuyongfeng
 * @description :
 * @date :2021-03-01
 * <p>
 * 给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
 * <p>
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 * <p>
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 * <p>
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/plus-one
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/
public class PlusOne {
    public static void main(String[] args) {
        int[] ints = plusOne(new int[]{9, 9, 9});
        for (int i = 0; i < ints.length; i++) {
            System.out.printf("%d,", ints[i]);
        }
    }

    static int[] plusOne(int[] digits) {
        //指针
        int p = digits.length - 1;
        int k = 1;
        while (p > -1) {
            if (digits[p] + k < 10) {
                digits[p] = (digits[p] + k) % 10;
                k = 0;
                break;
            } else {
                digits[p] = (digits[p] + k) % 10;
                p--;
            }
        }
        if (k == 1) {
            int[] ints = Arrays.copyOf(digits, digits.length+1);
            ints[0] = k;
            return ints;
        }
        return digits;
    }
}
