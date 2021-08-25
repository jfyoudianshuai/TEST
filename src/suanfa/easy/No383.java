package suanfa.easy;

import java.util.HashMap;
import java.util.Map;

public class No383 {
    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<magazine.length();i++){
            Integer count=map.get(magazine.charAt(i));
            if(count==null){
                map.put(magazine.charAt(i),1);
            }else {
                map.put(magazine.charAt(i),++count);
            }
        }
        for(int i=0;i<ransomNote.length();i++){
            Integer count=map.get(ransomNote.charAt(i));
            if(count!=null && count!=0){
                map.put(ransomNote.charAt(i),--count);
            }else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(canConstruct("aa","aab"));
    }
}
