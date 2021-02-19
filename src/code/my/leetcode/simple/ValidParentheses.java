package code.my.leetcode.simple;

import java.util.Stack;

/**
 * @author :qiuyongfeng
 * @description :
 * @date :2021-02-19
 * <p>
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 * <p>
 * 有效字符串需满足：
 * <p>
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/
public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("{}"));
    }

    //my answer
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '{' || c == '(' || c == '[') {
                stack.push(c);
            } else {
                if (!stack.empty()) {
                    if (c == '}' && stack.pop() != '{') return false;
                    if (c == ')' && stack.pop() != '(') return false;
                    if (c == ']' && stack.pop() != '[') return false;
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

}
