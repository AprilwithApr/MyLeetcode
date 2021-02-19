package code.my.algorithm;

/**
 * @author :qiuyongfeng
 * @description :
 * @date :2021-02-18
 **/
public class Exercises {
    public static void main(String[] args) {
        row2col(new int[][]{{1, 2, 3}, {4, 5, 6}});
        lg(17);
        histogram(new int[]{1, 2, 2, 5, 7, 4, 5}, 8);
        System.out.printf("%d的阶乘是%d\n", 10, factorial(10));
    }

    /**
     * 二维数组行转列
     */
    static void row2col(int[][] arr) {
        System.out.println("before conversion:");
        showArr(arr);
        //开一个新数组
        int colnum = arr[0].length;
        int rownum = arr.length;
        int[][] newArr = new int[colnum][rownum];
        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr[i].length; j++) {
                newArr[i][j] = arr[j][i];
            }
        }
        System.out.println("conver using a new array:");
        showArr(newArr);
    }

    static void showArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\t\t");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static void lg(int n) {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            if ((1 << i) > n) {
                System.out.printf("不大于log2 %d的最大整数是:%d\n", n, i - 1);
                break;
            }
            if (1 << i == n) {
                System.out.printf("不大于log2 %d的最大整数是:%d\n", n, i);
                break;
            }
        }
    }

    static void histogram(int[] a, int m) {
        int[] b = new int[m];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < m) {
                b[a[i]]++;
            }
        }
        for (int i = 0; i < b.length; i++) {
            System.out.printf("%d出现了%d次\n", i, b[i]);
        }
    }

    static int factorial(int n) {
        if (n == 1) return 1;
        return n * factorial(n - 1);
    }


}
