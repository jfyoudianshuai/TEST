package suanfa.easy;

import java.util.Arrays;

public class No492 {
    public static int[] constructRectangle(int area) {
        Double d=Math.sqrt(area);
        Double w=Math.floor(d);
        Double l=Math.ceil(d);
        while(l*w!=area){
            if(l*w>area){
                w-=1;
            }else {
                l+=1;
            }
        }

        return new int[]{l.intValue(),w.intValue()};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(constructRectangle(4)));
    }
}
