package suanfa.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class No338 {
    public static int[] countBits(int n) {
        List<Integer> list=new ArrayList<>();
        help(list,n);
        return list.stream().mapToInt(Integer::valueOf).toArray();

    }
    private static void help(List<Integer> list,int n){
        if(n==0) {list.add(0);return;}
        int count=0;
        int tmp=n;
        while(tmp!=0){
            if((tmp&1)==1){
                count++;
            }
            tmp=tmp>>1;
        }
        help(list,n-1);
        list.add(count);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(10)));
    }
}
