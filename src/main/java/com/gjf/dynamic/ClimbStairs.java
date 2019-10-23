package com.gjf.dynamic;

import common.PrintUtils;

/**
 * 70. 爬楼梯
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * <p>
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 *
 * @author guojianfeng.
 * @date 2019/10/23
 */
public class ClimbStairs {
    public static void main(String[] args) {
        PrintUtils.out(climbStairs2(44));
    }

    /**
     * 1 2 3 5 8 13 .....
     * 递归的方式很消耗性能
     * @param n
     * @return
     */
    public static int climbStairs(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else {
            return climbStairs(n - 1) + climbStairs(n - 2);
        }
    }

    /**
     * 数组记录的方式
     * @param n
     * @return
     */
    public static int climbStairs2(int n) {
        if (n == 1) {
            return 1;
        }
        int[] nums = new int[n+1];
        nums[1]=1;
        nums[2]=2;
        for (int i=3;i<=n;i++){
            nums[i] = nums[i-1]+nums[i-2];
        }
        return nums[n];
    }
}
