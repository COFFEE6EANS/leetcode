package medium;

/**
 * @author guojianfeng.
 * @date created in  2019/8/2
 * @desc
 */
public class Rob {
    public static void main(String[] args) {
        System.out.println(new Rob().rob(new int[]{1,3,1,3,100}));
    }
    public int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        if (nums.length % 2 == 0) {
            int count1 = 0;
            for (int i = 0; i < nums.length; i += 2) {
                count1 += nums[i];
            }
            int count2 = 0;
            for (int i = 1; i < nums.length; i += 2) {
                count2 += nums[i];
            }
            return Math.max(count1,count2);
        }else {
            int count1 = 0;
            for (int i = 0; i < nums.length-1; i += 2) {
                count1 += nums[i];
            }
            int count2 = 0;
            for (int i = 1; i < nums.length; i += 2) {
                count2 += nums[i];
            }
            int count3 = 0;
            for (int i = 2; i < nums.length; i += 2) {
                count3 += nums[i];
            }
            return Math.max(Math.max(count1,count2),count3);
        }
    }
}
