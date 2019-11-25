package com.gjf.binarySearch;

/**
 * 633. 平方数之和
 *
 * @author guojianfeng.
 * @date 2019/11/20
 */
public class JudgeSquareSum {
    public static void main(String[] args) {
        boolean sum = judgeSquareSum(1000);
        System.out.println(sum);
    }

    public static boolean judgeSquareSum(int c) {
        int b = (int) Math.sqrt(c);
        int a = 0;
        while (a <= b) {
            int c1 = a * a + b * b;
            if (c == c1) {
                return true;
            } else if (c > c1) {
                a++;
            } else {
                b--;
            }
        }
        return false;
    }
}
