package suanfa.easy;

public class No674 {
    public static int findLengthOfLCIS(int[] nums) {
        int res=1;
        int count=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]>nums[i]){
                count++;
            }else {
                res=Math.max(count,res);
                count=1;
            }
        }
        return Math.max(count,res);
    }

    public static void main(String[] args) {
        System.out.println(findLengthOfLCIS(new int[]{1,2,3,4,6,2,3,4}));
    }
}
