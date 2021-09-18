package suanfa.easy;

import java.util.HashMap;
import java.util.Map;

public class No594 {
    /**
     * 和谐数组是指一个数组里元素的最大值和最小值之间的差别 正好是 1 。
     * 现在，给你一个整数数组 nums ，请你在所有可能的子序列中找到最长的和谐子序列的长度。
     * 数组的子序列是一个由数组派生出来的序列，它可以通过删除一些元素或不删除元素、且不改变其余元素的顺序而得到。
     * 示例 1：*
     * 输入：nums = [1,3,2,2,5,2,3,7]
     * 输出：5
     * 解释：最长的和谐子序列是 [3,2,2,2,3]
     */
    public static int findLHS(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int res=0;
        for(int n: nums){
            Integer count=map.get(n);
            count= count==null?1:count+1;
            map.put(n,count);
            if(map.containsKey(n-1)){
                int cc=count+map.get(n-1);
                res=res>cc?res:cc;
            }
            if(map.containsKey(n+1)){
                int cc=count+map.get(n+1);
                res=res>cc?res:cc;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(findLHS(new int[]{1,2,3,4}));
    }
}
