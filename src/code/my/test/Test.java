package code.my.test;


import java.util.Stack;

public class Test {

    public static void main(String[] args) {

        Stack<String>[] stacks = new Stack[2];

        Stack<String> s1 = new Stack<>();
        Stack<String> s2 = new Stack<>();

        s1.push("aaa");
        s1.push("1");
        stacks[0] = s1;
        stacks[1] = s2;

    }
}





