package suanfa.easy;

import java.util.*;

public class No345 {
    public static String reverseVowels(String s) {
        int i=0,j=s.length()-1;
        boolean ii=false,jj=false;
        List<Character> list=new ArrayList<>();
        char[] ch=s.toCharArray();
        list.add('a');
        list.add('e');
        list.add('i');
        list.add('o');
        list.add('u');
        list.add('A');
        list.add('E');
        list.add('O');
        list.add('I');
        list.add('U');
        while(i<j){
            if(list.contains(s.charAt(i))){
                ii=true;
                if(jj){
                    char tmp=ch[i];
                    ch[i]=ch[j];
                    ch[j]=tmp;
                    ii=false;
                    jj=false;
                    j--;
                }
            }
            if(list.contains(s.charAt(j))){
                jj=true;
                if(ii){
                    char tmp=ch[i];
                    ch[i]=ch[j];
                    ch[j]=tmp;
                    ii=false;
                    jj=false;

                }
            }
            if(!ii)i++;
            if(!jj)j--;
        }
        s="";
        for(char c:ch){
            s+=c;
        }
        return s ;
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("leetcode"));
    }
}
