package suanfa.easy;

import java.util.Arrays;

public class No434 {
    public int countSegments(String s) {
        int count=0;
        String[] arr=s.trim().split(" ");
        for (int i = 0; i < arr.length; i++) {
            String s1 = arr[i];
            if(s1.length()>0) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString("baabbaac".split("a")));
    }
}
