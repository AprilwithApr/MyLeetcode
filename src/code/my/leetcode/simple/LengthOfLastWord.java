package code.my.leetcode.simple;

/**
 * 给你一个字符串 s，由若干单词组成，单词之间用空格隔开。返回字符串中最后一个单词的长度。如果不存在最后一个单词，请返回 0 。
 * <p>
 * 单词 是指仅由字母组成、不包含任何空格字符的最大子字符串。
 */
public class LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("a "));
        System.out.println(lengthOfLastWord("        "));
        System.out.println(lengthOfLastWord(" a "));
        System.out.println(lengthOfLastWord("hello world "));
    }

    //my answer
    static int lengthOfLastWord(String s) {
        int res = 0;
        int p = s.length() - 1;
        while (p < s.length() && p > -1) {
            if (s.charAt(p) != ' ') {
                res++;
                if (p > 0) {
                    if (s.charAt(p - 1) == ' ') return res;
                }
            }
            p--;
        }
        return res;
    }
}
