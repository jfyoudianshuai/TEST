package suanfa.easy;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class No387 {
    public static int firstUniqChar(String s) {
        LinkedList<Integer> queue=new LinkedList<>();
        Map<Character,Integer> map= new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                queue.remove(map.get(s.charAt(i)));
            }else {
                 map.put(s.charAt(i),i);
                 queue.add(i);
            }
        }
        if(queue.isEmpty()) return -1;
        return queue.getFirst();
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("aabb"));
    }
}
