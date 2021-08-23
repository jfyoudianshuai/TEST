package suanfa.easy;

import java.util.Arrays;

public class No344 {
    public static void reverseString(char[] s) {
        for(int i=0;i<s.length/2;i++){
            char tmp=s[i];
            s[i]=s[s.length-1-i];
            s[s.length-1-i]=tmp;
        }
    }

    public static void main(String[] args) {
        char[] c=new char[]{'a','b','c','D'};
        reverseString(c);
        System.out.println(Arrays.toString(c));
    }
}
