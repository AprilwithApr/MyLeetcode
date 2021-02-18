package code.my.leetcode.simple;

/**
 *
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串""。
 *
 * 示例 1：
 * 输入：strs = ["flower","flow","flight"]
 * 输出："fl"
 * 仅由小写英文字母组成
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-common-prefix
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"abcdef","abcdef"}));
    }

    //my answer
    static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        if (strs.length == 1) return strs[0];
        int [] arr = new int[26];
        for (int i = 0; i < strs.length; i++) {
            for (int i1 = 0; i1 < strs[i].length(); i1++) {
                arr[getIndex(strs[i].charAt(i1))] = 1;
            }
        }

        return "";
    }

    static int getIndex(char c){
        switch (c){
            case 'a':return 0;
            case 'b':return 1;
            case 'c':return 2;
            case 'd':return 3;
            case 'e':return 4;
            case 'f':return 5;
            case 'g':return 6;
            case 'h':return 7;
            case 'i':return 8;
            case 'j':return 9;
            case 'k':return 10;
            case 'l':return 11;
            case 'm':return 12;
            case 'n':return 13;
            case 'o':return 14;
            case 'p':return 15;
            case 'q':return 16;
            case 'r':return 17;
            case 's':return 18;
            case 't':return 19;
            case 'u':return 20;
            case 'v':return 21;
            case 'w':return 22;
            case 'x':return 23;
            case 'y':return 24;
            case 'z':return 25;
            default:return -1;
        }
    }
}
