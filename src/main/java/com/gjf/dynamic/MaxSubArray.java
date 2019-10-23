package com.gjf.dynamic;

import common.PrintUtils;

/**
 * 53. 最大子序和
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 *
 * @author guojianfeng.
 * @date 2019/10/23
 */
public class MaxSubArray {
    public static void main(String[] args) {
        int[] nums1 = new int[]{-2,3,-1,1,-4};
        PrintUtils.out(maxSubArray(nums1));
        int[] nums2 = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        PrintUtils.out(maxSubArray(nums2));
    }

    /**
     * 动态规划  正数增益
     * @param nums
     * @return
     */
    public static int maxSubArray(int[] nums) {
        int res = nums[0];
        int sum = 0;
        for (int num : nums) {
            if (sum > 0) {
                sum += num;
            } else {
                sum = num;
            }
            res = Math.max(res, sum);
        }
        return res;
    }
}
