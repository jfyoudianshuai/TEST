package suanfa.easy;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class No506 {
    public static String[] findRelativeRanks(int[] score) {
        String[] strs=new String[score.length];
        HashMap<Integer,Integer> map=new HashMap<>();

        for (int i = 0; i < score.length; i++) {
            map.put(score[i],i);
        }
        Integer[] ss=Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(ss, Collections.reverseOrder());
        for (int i = 0; i < ss.length; i++) {
           Integer index=map.get(ss[i]);
           switch (i){
               case 0: strs[index]="Gold Medal";break;
               case 1: strs[index]="Silver Medal";break;
               case 2: strs[index]="Bronze Medal";break;
               default: strs[index] =i+1+"";
           }

        }
        return strs;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findRelativeRanks(new int[]{1,3,2,6,5})));
    }
}
