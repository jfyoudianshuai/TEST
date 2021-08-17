package suanfa.easy;

import java.util.Arrays;

public class No268 {
    /**
     * 给定一个包含 [0, n] 中 n 个数的数组 nums ，找出 [0, n] 这个范围内没有出现在数组中的那个数。
     * 进阶：
     * 你能否实现线性时间复杂度、仅使用额外常数空间的算法解决此问题?
     */
    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if(i!=nums[i])return i;
        }
        return nums.length;
    }
    public static int missingNumber2(int[] nums){
        int n=0;
        for (int i = 0; i < nums.length; i++) {
            n=n+i-nums[i];
        }
        return n+nums.length;
    }

    public static void main(String[] args) {
        System.out.println(missingNumber2(new int[]{9,6,4,2,3,5,7,0,1}));
    }
}
