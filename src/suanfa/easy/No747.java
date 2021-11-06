package suanfa.easy;

public class No747 {
    /**
     给你一个整数数组 nums ，其中总是存在 唯一的 一个最大整数 。
     请你找出数组中的最大元素并检查它是否 至少是数组中每个其他数字的两倍 。如果是，则返回 最大元素的下标 ，否则返回 -1 。 
     示例 1：
     输入：nums = [3,6,1,0]
     输出：1
     解释：6 是最大的整数，对于数组中的其他整数，6 大于数组中其他元素的两倍。6 的下标是 1 ，所以返回 1 。
     示例 2：
     输入：nums = [1,2,3,4]
     输出：-1
     解释：4 没有超过 3 的两倍大，所以返回 -1 。
     */
      public static int dominantIndex(int[] nums) {
        int max=Integer.MIN_VALUE;
        int res=-1;
        int trd=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                trd=max;
                max=nums[i];
                res=i;
            }else if(nums[i]>trd){
                trd=nums[i];
            }
        }
        if(max>=trd*2)return res;
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(dominantIndex(new int[]{1}));
    }
}
