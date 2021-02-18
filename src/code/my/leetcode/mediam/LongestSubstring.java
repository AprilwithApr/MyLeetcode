package code.my.leetcode.mediam;

import java.util.ArrayDeque;
import java.util.HashMap;

/**
 * 给定一个字符串，请你找出其中不含有重复字符的最长子串的长度。
 * 示例1:
 * 输入: s = "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-substring-without-repeating-characters
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LongestSubstring {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("aabaab!bb"));
        System.out.println(lengthOfLongestSubstringV2("aabaab!bb"));
    }

    //滑动窗口
    public static int lengthOfLongestSubstringV2(String s) {
        if (s.length() == 0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max = 0;
        //窗口左指针
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                left = Math.max(left, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i - left + 1);
        }
        return max;
    }

    //my answer
    public static int lengthOfLongestSubstring(String s) {
        ArrayDeque<Character> q = new ArrayDeque<>();
        int max = 0;
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (!q.contains(c[i])) {
                q.offerLast(c[i]);
            } else {
                max = max > q.size() ? max : q.size();
                while (q.peekFirst() != c[i]) {
                    q.removeFirst();
                }
                q.removeFirst();
                q.offerLast(c[i]);
            }
        }
        return max > q.size() ? max : q.size();
    }
}
