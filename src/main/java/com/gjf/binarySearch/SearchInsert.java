package com.gjf.binarySearch;

import common.PrintUtils;

/**
 * @author guojianfeng.
 * @date 2019/10/24
 */
public class SearchInsert {
    public static void main(String[] args) {
        PrintUtils.out(searchInsert(new int[]{1, 3, 5, 6}, 8));
    }

    /**
     * 二分查找
     *
     * @param nums
     * @param target
     * @return
     */
    public static int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid-1;   // 注意
            }else {
                left = mid+1;    // 注意
            }
        }
        return left;
    }

    /**
     * 遍历
     *
     * @param nums
     * @param target
     * @return
     */
    public static int searchInsert1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }
}
