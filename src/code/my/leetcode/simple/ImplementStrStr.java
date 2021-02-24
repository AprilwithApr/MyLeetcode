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
        int i1 = strStr("ababaab", "aab");
        System.out.println(i1);
        int[] next = calNext("ababaab");
        for (int i = 0; i < next.length; i++) {
            System.out.printf("%d\t", next[i]);
        }
    }

    //KMP
    static int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;
        if (haystack.length() < needle.length()) return -1;
        int hl = haystack.length();
        int nl = needle.length();
        //求next数组
        int[] next = calNext(needle);
        int i = 0;
        int j = 0;
        while (i < hl && j < nl) {
            if (haystack.charAt(i) != needle.charAt(j)) {
                j = next[j];
                if (j == -1) {
                    i++;
                    j = 0;
                }
            } else {
                i++;
                j++;
            }
            if (j == nl) return i - nl;
        }
        return -1;
    }

    static int[] calNext(String str) {
        if (str.length() == 1) {
            return new int[]{-1};
        }
        int[] next = new int[str.length()];
        next[0] = -1;//第一个元素记为：-1 表示如果主串与模式串第一位就不匹配的话则主串指针后移，无需再操作模式串
        next[1] = 0;//第二个元素不匹配。则从下标为0的地方开始匹配
        int pos = 2;//从第三个元素开始
        int cn = 0;//公共前缀尾部下标
        while (pos < next.length) {
            //pos位置前一位与模式串首位匹配时，才开始前后缀长度的计算
            if (str.charAt(pos - 1) == str.charAt(cn)) {
                next[pos++] = ++cn;
            } else if (cn > 0) {
                cn = next[cn];
            } else {
                //否则，pos指针后移，当前元素的next值为0，即：主串位置与当前元素不匹配时，主串又与模式串下标为0的元素进行匹配
                next[pos++] = 0;
            }
        }
        return next;
    }
}
