package suanfa.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class No290 {
    /**
     * 给定一种规律 pattern 和一个字符串 str ，判断 str 是否遵循相同的规律。
     * 这里的 遵循 指完全匹配，例如， pattern 里的每个字母和字符串 str 中的每个非空单词之间存在着双向连接的对应规律。
     * 示例1:
     * 输入: pattern = "abba", str = "dog cat cat dog"
     * 输出: true
     * @param pattern
     * @param s
     * @return
     */
    public static boolean wordPattern(String pattern, String s) {
        Map<String,Character> map=new HashMap<>();
        String[] ss=s.split(" ");
        if(ss.length!=pattern.length())return false;
        for(int i=0;i<ss.length;i++){
            Character value=map.get(ss[i]);
            if (value==null) {
                if(map.containsValue(pattern.charAt(i)))return false;
                map.put(ss[i],pattern.charAt(i));
            }else {
                if(value!=pattern.charAt(i)){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(wordPattern( "abba","dog ct cat dog"));
    }
}
