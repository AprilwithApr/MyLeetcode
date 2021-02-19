package code.my.leetcode.simple;

import java.util.Arrays;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * <p>
 * 如果不存在公共前缀，返回空字符串""。
 * <p>
 * 示例 1：
 * 输入：strs = ["flower","flow","flight"]
 * 输出："fl"
 * 仅由小写英文字母组成
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-common-prefix
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"abca","aba","aaab"}));
    }

    //my answer
    static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        if (strs.length == 1) return strs[0];

        int minLength = 200;
        int minLengthIndex = 0;
        String minStr = "";
        for (int i = 0; i < strs.length; i++) {
            String s = strs[i];
            if (minLength > s.length()) {
                minLength = s.length();
                minStr = s;
                minLengthIndex = i;
            }
        }
        char[] res = new char[minLength];
        for (int i = 0; i < strs.length; i++) {
            if (i == minLengthIndex) continue;
            String str = strs[i];
            for (int i1 = 0; i1 < minStr.length(); i1++) {
                if (i1 + 1 > res.length) break;
                if (minStr.charAt(i1) == str.charAt(i1)) {
                   res[i1] = minStr.charAt(i1);
                }else{
                    res = Arrays.copyOfRange(res, 0, i1);
                    break;
                }
            }
        }
        return String.valueOf(res);
    }
}
