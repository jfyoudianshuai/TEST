package suanfa.easy;

import java.util.Arrays;

public class No704 {
    /**
     * 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1
     * 示例 1:
     * 输入: nums = [-1,0,3,5,9,12], target = 9
     * 输出: 4
     * 解释: 9 出现在 nums 中并且下标为 4
     * @param nums
     * @param target
     * @return
     */
    public static int search(int[] nums, int target) {
        int start=0,end=nums.length;
        int mid=(start+end)/2;
        while(mid>=start && mid <=end){
            if(nums[mid]==target) return mid;
            if(nums[mid]<target) start=mid+1;
            else end=mid-1;
            if(start==end)  break;
            mid=(start+end)/2;
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] nums=new int[]{-1,0,5,9,12};
        System.out.println(search(nums,13));
        System.out.println(Arrays.toString(Arrays.copyOfRange(nums,0,3)));
    }
}
