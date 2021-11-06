package suanfa.easy;

public class No724 {
    public static int pivotIndex(int[] nums) {
        int left=0,right=0;
        for(int i=1;i<nums.length;i++){
            right+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(left==right) return i;
            left+=nums[i];
            if(i!=nums.length-1) {
                right -= nums[i + 1];
            }else {
                right=0;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[]{2,1,-1,-2,4}));
    }
}
