package suanfa.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No720 {
    public static String longestWord(String[] words) {
        String res="";
        Arrays.sort(words);
        List<String> list=new ArrayList<>();
        for( int i=0;i<words.length;i++){
            if(i==1 || list.contains(words[i].substring(0,words[i].length()-1))){
                res =res.length()>words.length? res: words[i];
                list.add(words[i]);
            }
        }
        return res;
    }
}
