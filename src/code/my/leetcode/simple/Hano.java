package code.my.leetcode.simple;

/**
 * 汉诺塔问题
 */
public class Hano {
    public static void main(String[] args) {
        hano('a', 'b', 'c', 8);
    }

    /**
     * @param a 源底座
     * @param b 协助底座
     * @param c 目标底座
     * @param n 盘子个数
     */
    private static void hano(char a, char b, char c, int n) {
        if (n == 1){
            System.out.println(a + " -> " + c);
        }
        if (n > 1) {
            hano(a, c, b, n - 1);//把a上n-1个盘子挪到b柱
            hano(a, b, c, 1);//把a剩下的1个盘子挪到c柱
            hano(b, a, c, n - 1);//把b柱上面n-1个盘子挪到c柱
        }
    }
}
