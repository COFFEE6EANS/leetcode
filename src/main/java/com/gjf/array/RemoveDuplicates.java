package com.gjf.array;

import common.PrintUtils;

/**
 * 26. 删除排序数组中的重复项
 * <p>
 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * <p>
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 *
 * @author guojianfeng.
 * @date 2019/10/22
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = new int[]{1,1,2};
        int[] nums1 = new int[]{0,0,1,1,1,2,2,3,3,4};
        PrintUtils.out(removeDuplicates(nums));
        PrintUtils.out(removeDuplicates(nums1));
    }
    public static int removeDuplicates(int[] nums) {
        int i = 0;
        if (nums.length == 0) {
            return i;
        }
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}
