package suanfa.easy;

public class No453 {
    public static int minMoves(int[] nums) {
        int min=nums[0];
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            sum+=num;
            if(num<min){
                min=num;
            }
        }
        return sum-min*nums.length;
    }

    public static void main(String[] args) {
        System.out.println(minMoves(new int[]{1,2,3,4}));
    }
}
