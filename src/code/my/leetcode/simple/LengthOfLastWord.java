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
    }

    public static int lengthOfLastWord(String s) {
        if (s.length() == 1 && s.charAt(0) != ' ') return 1;
        boolean sign = false;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                sign = true;
            }
            if ((s.charAt(i) == ' ' || i == 0) && sign) {
                return s.length() - 1 - i;
            }
        }
        return 0;
    }
}
