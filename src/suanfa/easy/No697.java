package suanfa.easy;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class No697 {
    public static int findShortestSubArray(int[] nums) {
        int res=Integer.MAX_VALUE;
        int max=0;
        LinkedList no=new LinkedList();
        Map<Integer,Integer> indexmap =new HashMap<>();
        Map<Integer,Integer> endmap =new HashMap<>();
        Map<Integer,Integer> map =new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            if(!indexmap.containsKey(n))indexmap.put(n,i);
            endmap.put(n,i);
            Integer c=map.get(n);
            c= c==null?1:c+1;
            max=Math.max(max,c);
            map.put(n,c);
        }
        Set<Integer> set=map.keySet();
        for(Integer n:set){
            if(map.get(n)==max){
                res=Math.min(endmap.get(n)-indexmap.get(n),res);
            }
        }
        return res+1;
    }

    public static void main(String[] args) {
        System.out.println(findShortestSubArray(new int[]{49999,100,2,100,100,4,100}));

    }
}
