package suanfa.easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class No703 {


    public static void main(String[] args) {
        KthLargest k=new KthLargest(3,new int[]{4,5,8,2});
        System.out.println(k.add(3));
        System.out.println(k.add(5));
        System.out.println(k.add(10));
        System.out.println(k.add(9));
    }
}
class KthLargest {
    public int n;
    public int prev;
    public int next;
    public int k;
    public KthLargest(int k, int[] nums) {
        Arrays.sort(nums);
        n=nums[k-1];
        this.k=k;
        if(k!=1) {
            prev = nums[k - 2];
            if(k!=nums.length) {
                next = nums[k];
            }else {
                this.k=-1;
            }
        }

    }

    public int add(int val) {
        if(k==1) return Math.min(k,val);
        if(k==-1) return val>n?n: val>prev?val:prev;
        if(val>=n){
            return n;
        }
        return val<prev? prev:val;
    }
}
