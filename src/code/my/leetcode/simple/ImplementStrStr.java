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

        int[] next = calNext("abababca");
        for (int i = 0; i < next.length; i++) {
            System.out.printf("%d\t",next[i]);
        }
    }

    //KMP
    static int strStr(String haystack, String needle) {

        return -1;
    }

    static int[] calNext(String str) {
        int[] next = new int[str.length()];
        next[0] = 0;
        int j = 0;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(j)){
                next[i] = ++j;
            }else{
                j = 0;
            }
        }
        return next;
    }
}
