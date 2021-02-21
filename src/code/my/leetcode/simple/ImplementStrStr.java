package code.my.leetcode.simple;

/**
 * 实现strStr()函数。
 * <p>
 * 给定一个haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回 -1。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/implement-strstr
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class ImplementStrStr {
    public static void main(String[] args) {
        System.out.println(strStr("mississippi", "issip"));
    }

    static int strStr(String haystack, String needle) {
        if (needle.equals("")) return 0;
        int hl = haystack.length();
        int nl = needle.length();
        if (hl < nl) return -1;
        int i = 0, j = 0;
        while (i < hl) {
            if (haystack.charAt(i) != needle.charAt(j)) {
                i++;
                j = 0;
            } else {
                if (j == nl - 1) {
                    return i - j;
                }
                i++;
                j++;
            }
        }
        return -1;
    }
}
