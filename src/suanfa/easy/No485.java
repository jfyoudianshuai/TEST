package suanfa.easy;

public class No485 {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int left=-1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==1){
                if(left==-1){
                    left=i;
                }
            }else {
                if(left!=-1 && count<i-left){
                    count=i-left;
                }
                left=-1;
            }
        }
        if(left==-1) return count;
        return count<nums.length-left?nums.length-left: count;

    }

    public static void main(String[] args) {
        System.out.println(findMaxConsecutiveOnes(new int[]{1, 1,1,1,1, 0, 1, 1, 1, 1}));
    }
}
