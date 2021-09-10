package suanfa.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class No448 {
    /**
     * 给你一个含 n 个整数的数组 nums ，其中 nums[i] 在区间 [1, n] 内。请你找出所有在 [1, n] 范围内但没有出现在 nums 中的数字，并以数组的形式返回结果。
     * 示例 1：
     * 输入：nums = [4,3,2,7,8,2,3,1]
     * 输出：[5,6]
     */
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list=new ArrayList<>();
        Set<Integer> set=new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(i+1);
            set.add(nums[i]);
        }
        list.removeAll(set);
        return list;
    }
    public static List<Integer> findDisappearedNumbers2(int[] nums) {
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[Math.abs(nums[i])-1];
            if(num>0){
                nums[Math.abs(nums[i])-1]=0-num;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if(num>0)list.add(i+1);
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(findDisappearedNumbers2(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
    }
}
