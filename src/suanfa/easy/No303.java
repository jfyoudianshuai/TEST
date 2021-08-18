package suanfa.easy;

public class No303 {

    /**
     * sumRange要调用无数次，而不是几次。
     * 应该说“sumRange会被反复调用无数次，请设计一个时间复杂度最低的算法降低时间消耗”
     */
    int[] nums;
    int[] sums;
    /**
     * 应该在构造方法里直接在数组里存储索引之前的和
     * @param nums
     */
    public No303(int[] nums) {
        if(nums.length==0) return;
        sums=new int[nums.length];
        this.nums=nums;
        sums[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            sums[i]=sums[i-1]+nums[i];
        }
    }

    public int sumRange(int left, int right) {
        if(left<0 || right<0 || left>right) return -1;
        return sums[right]-sums[left]+nums[left];
    }
}
