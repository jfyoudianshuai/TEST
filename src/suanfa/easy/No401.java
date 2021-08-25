package suanfa.easy;

import java.util.ArrayList;
import java.util.List;

public class No401 {
    public static List<String> readBinaryWatch(int turnedOn) {
        List<String> list=new ArrayList<>();
        for(int i=0;i<12;i++){
            for(int j=0;j<60;j++){
                if(Integer.bitCount(j)+Integer.bitCount(i)==turnedOn){
                    list.add(i+":"+ (j<10? "0"+j:j));
                }
            }
        }
        return list;
    }
}
