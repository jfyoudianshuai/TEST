package suanfa.easy;

import java.util.*;

public class No350 {
    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            Integer count=map.get(nums1[i]);
            if(count==null){
                map.put(nums1[i],1);
            }else {
                map.put(nums1[i],++count);
            }
        }
        for( int i=0;i<nums2.length;i++){
            Integer count=map.get(nums2[i]);
            if(count!=null && count!=0){
                list.add(nums2[i]);
                map.put(nums2[i],--count);
            }
        }
        return list.stream().mapToInt(Integer::valueOf).toArray();
    }

    public static void main(String[] args) {
        int[] arr1=new int[]{1,2,2,1,3,1,2,65};
        int[] arr2=new int[]{2,2,1};
        System.out.println(Arrays.toString(intersect(arr2,arr1)));
    }
}
