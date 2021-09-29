package suanfa.easy;

import java.util.Arrays;

public class No628 {
    /**
     * 给你一个整型数组 nums ，在数组中找出由三个数组成的最大乘积，并输出这个乘积。
     * 示例 1：
     * 输入：nums = [1,2,3]
     * 输出：6
     * @param nums
     * @return
     */
    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int index=nums.length-1;
        int c=nums[index];
        int b=nums[nums.length-2] * nums[nums.length-3];
        int a=nums[0] * nums[1];
        if(c<0){
            return b*c;
        }
        return Math.max(a,b) * c;
            }

    public static void main(String[] args) {
        System.out.println(maximumProduct(new int[]{-1,-2,-3,-4,0}));
    }
}
