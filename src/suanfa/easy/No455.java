package suanfa.easy;

import java.util.Arrays;

public class No455 {
    public static int findContentChildren(int[] g, int[] s) {
        int count=0;
        Arrays.sort(g);
        Arrays.sort(s);
        int j=0;
        for (int i = 0; i < g.length; i++) {
            if(j>=s.length)return count;
            if(g[i]<=s[j]){
                count++;
            }else {
                i--;
            }
            j++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{10,9,8,7};
        int[] arr2=new int[]{5,6,7,8};
        System.out.println(findContentChildren(arr, arr2));
    }
}
