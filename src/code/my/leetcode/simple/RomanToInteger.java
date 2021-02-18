package code.my.leetcode.simple;

import java.util.HashMap;

/**
 * 罗马数字包含以下七种字符:I，V，X，L，C，D和M。
 * <p>
 * 字符          数值
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * 例如， 罗马数字 2 写做II，即为两个并列的 1。12 写做XII，即为X+II。 27 写做XXVII, 即为XX+V+II。
 * <p>
 * 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做IIII，而是IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。
 * 同样地，数字 9 表示为IX。
 * 这个特殊的规则只适用于以下六种情况：
 * I可以放在V(5) 和X(10) 的左边，来表示 4 和 9。
 * X可以放在L(50) 和C(100) 的左边，来表示 40 和90。
 * C可以放在D(500) 和M(1000) 的左边，来表示400 和900。
 * 给定一个罗马数字，将其转换成整数。输入确保在 1到 3999 的范围内。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/roman-to-integer
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInteger("DCXXI"));
        System.out.println(romanToIntegerV2("DCXXI"));
    }
    //better than me in time
    static int romanToIntegerV2(String s){
        int res = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (i - 1 >=0 && getNumber(s.charAt(i - 1)) < getNumber(c)){
                res += (getNumber(c) - getNumber(s.charAt(i - 1)));
                i--;
            }else{
                res += getNumber(c);
            }
        }
        return res;
    }

    static int getNumber(char c){
        switch (c){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return -1;
        }
    }

    //my answer
    static int romanToInteger(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int res = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (i - 1 >= 0 && map.get(s.charAt(i-1)) < map.get(c)){
                res += map.get(c) - map.get(s.charAt(i - 1));
                i--;
            }else{
                res += map.get(c);
            }
        }
        return res;
    }
}
