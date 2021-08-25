package suanfa.easy;

import java.util.HashMap;
import java.util.Map;

public class No409 {


        public int longestPalindrome2(String s) {
            int[] cnts = new int[58];
            for (int i = 0; i < s.length(); i++) {
                cnts[s.charAt(i) - 'A']++;
            }
            int palindrome = 0;
            for (int cnt : cnts) {
                palindrome += (cnt / 2) * 2;
            }
            if (palindrome < s.length()) {
                palindrome++;
            }
            return palindrome;
        }

    public static int longestPalindrome(String s) {
        int count=0;
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
            }else {
                count+=2;
                map.remove(s.charAt(i));
            }
        }
        return map.size()==0? count:count+1;

    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("abccccdd"));
    }
}
