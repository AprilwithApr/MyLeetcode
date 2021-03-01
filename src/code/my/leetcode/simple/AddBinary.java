package code.my.leetcode.simple;

import java.util.Stack;

/**
 * @author :qiuyongfeng
 * @description :
 * @date :2021-03-01
 * 给你两个二进制字符串，返回它们的和（用二进制表示）。
 * <p>
 * 输入为 非空 字符串且只包含数字 1 和 0。
 **/
public class AddBinary {
    public static void main(String[] args) {
        System.out.println(addBinary("1111", "1111"));
    }

    public static String addBinary(String a, String b) {

        Stack<Integer> stack = new Stack<>();

        int p1 = a.length() - 1;
        int p2 = b.length() - 1;
        int carry = 0;
        while (p1 > -1 || p2 > -1) {
            int i1 = 0, i2 = 0;
            if (p1 > -1 && p2 > -1) {
                i1 = Integer.valueOf(Character.valueOf(a.charAt(p1)).toString());
                i2 = Integer.valueOf(Character.valueOf(b.charAt(p2)).toString());
                p1--;
                p2--;
            } else if (p2 < 0) {
                i1 = Integer.valueOf(Character.valueOf(a.charAt(p1)).toString());
                p1--;
            } else if (p1 < 0) {
                i2 = Integer.valueOf(Character.valueOf(b.charAt(p2)).toString());
                p2--;
            }
            if (i1 + i2 + carry > 1) {
                stack.push((i1 + i2 + carry) % 2);
                carry = 1;
            } else {
                stack.push(i1 + i2 + carry);
                carry = 0;
            }
        }
        if (carry == 1) {
            stack.push(1);
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.toString();
    }
}
