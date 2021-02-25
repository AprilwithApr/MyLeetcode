package code.my.leetcode.simple;

/**
 * @author :qiuyongfeng
 * @description :
 * @date :2021-02-25
 * <p>
 * 给定一个正整数 n ，输出外观数列的第 n 项。
 * <p>
 * 「外观数列」是一个整数序列，从数字 1 开始，序列中的每一项都是对前一项的描述。
 * <p>
 * 你可以将其视作是由递归公式定义的数字字符串序列：
 * <p>
 * countAndSay(1) = "1"
 * countAndSay(n) 是对 countAndSay(n-1) 的描述，然后转换成另一个数字字符串。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/count-and-say
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/
public class CountAndSay {
    public static void main(String[] args) {
        System.out.println(countAndSay(6));
    }

    public static String countAndSay(int n) {

        if (n == 1) return "1";

        String s = countAndSay(n - 1);
        String res = "";
        int p = 0;
        int k = 0;
        while (p < s.length()) {
            if (s.charAt(p) == s.charAt(k)) {
                k++;
                if (k == s.length()) {
                    res += (k - p) + "" + s.charAt(p);
                    break;
                }
            } else {
                res += (k - p) + "" + s.charAt(p);
                p = k;
            }
        }
        return res;
    }
}
//1
//11
//21
//1211
//111221
//312211
//13122221
//1113114211
//311321141221
