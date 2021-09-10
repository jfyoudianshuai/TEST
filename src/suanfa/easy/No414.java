package suanfa.easy;

public class No414 {
    public static int thirdMax(int[] nums) {
        if(nums.length==2) return Math.max(nums[0],nums[1]);
        if(nums.length==1) return nums[0];
        int res=nums[0];
        int max=nums[0];
        Integer min=res;
        for(int c=0;c<3;c++) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > res ) {
                    if(c==0 || nums[i]< max) {
                        res = nums[i];
                    }
                }
                if(c==0 && nums[i]<min){
                    min=nums[i];
                }
            }
            if(min==res && c!=2) return max;
            max=res;
            res=min;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(thirdMax(new int[]{1,3,3}));
    }
}
