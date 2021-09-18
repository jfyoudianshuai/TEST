package suanfa.easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Stack;

public class No496 {
    /**
     * 给你两个 没有重复元素 的数组 nums1 和 nums2 ，其中nums1 是 nums2 的子集。
     * 请你找出 nums1 中每个元素在 nums2 中的下一个比其大的值。
     * nums1 中数字 x 的下一个更大元素是指 x 在 nums2 中对应位置的右边的第一个比 x 大的元素。如果不存在，对应位置输出 -1 。
     * 示例 1:
     * 输入: nums1 = [4,1,2], nums2 = [1,3,4,2].
     * 输出: [-1,3,-1]
     * 解释:
     *     对于 num1 中的数字 4 ，你无法在第二个数组中找到下一个更大的数字，因此输出 -1 。
     *     对于 num1 中的数字 1 ，第二个数组中数字1右边的下一个较大数字是 3 。
     *     对于 num1 中的数字 2 ，第二个数组中没有下一个更大的数字，因此输出 -1 。
     */
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr=new int[nums1.length];
        HashMap<Integer,Integer> map =new HashMap<>();
        Stack<Integer> stack= new Stack<>();
        for(int i=0;i<nums2.length;i++) {
            while (!stack.isEmpty() && stack.peek() < nums2[i]) {
                map.put(stack.pop(), nums2[i]);
            }
            stack.push(nums2[i]);
        }

        for(int i=0;i<nums1.length;i++){
            Integer next=map.get(nums1[i]);
            arr[i]= next==null? -1:next;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,5} , nums2 = {4,1,2,5,3};
        System.out.println(Arrays.toString(nextGreaterElement(nums1,nums2)));
    }
}
