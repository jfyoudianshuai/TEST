package suanfa.easy;

import java.util.ArrayList;
import java.util.List;

public class No728 {
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list=new ArrayList<>();
        while(left<=right){
            if(isDivid(left)) list.add(left);
            left++;
        }
        return list;
    }
    private static boolean isDivid(int left){
        int m=left;
        while (left!=0){
            int n=left%10;
            if(n==0 || m%n!=0){
                return false;
            }
            left/=10;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(selfDividingNumbers(3,22));

    }
}
