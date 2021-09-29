package suanfa.easy;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class No643 {
    /**
     * 给你一个由 n 个元素组成的整数数组 nums 和一个整数 k 。
     * 请你找出平均数最大且 长度为 k 的连续子数组，并输出该最大平均数。
     * * 任何误差小于 10-5 的答案都将被视为正确答案。
     * 示例 1：
     * 输入：nums = [1,12,-5,-6,50,3], k = 4
     * 输出：12.75
     * 解释：最大平均数 (12-5-6+50)/4 = 51/4 = 12.75
     */
    public static double findMaxAverage(int[] nums, int k) {
        int start=0;
        int sum=nums[0];
        int count=k;
        for(int i=1;i<k;i++){
            sum+=nums[i];
        }
        double res=sum;
        while(k<nums.length){
            sum-=nums[start++];
            sum+=nums[k++];
            res=Math.max(res,sum);
        }
        return res/count;
    }

    public static void main(String[] args) {
        System.out.println(findMaxAverage(new int[]{1,12,-5,-6,50,3},4));
    }
}
