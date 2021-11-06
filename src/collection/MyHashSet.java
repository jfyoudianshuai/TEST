package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MyHashSet {
    private  List<Object> list;
    public MyHashSet() {
        list=new ArrayList<>();
    }

    public void add(int key) {
        if(!list.contains(key)) list.add(key);
    }

    public void remove(int key) {
        list.remove(new Integer(key));
    }

    public boolean contains(int key) {
        return list.contains(key);
    }

    @Override
    public String toString() {
        return "MyHashSet{" +
                "list=" + list +
                '}';
    }

    // [[],[1],[2],[1],[3],[2],[2],[2],[2]]
    //["MyHashSet","add","add","contains","contains","add","contains","remove","contains"]
   //[[],[1],[2],[1],[3],[2],[2],[2],[2]]
   public static void main(String[] args) {
       MyHashSet set=new MyHashSet();
       set.add(1); set.add(2);
       System.out.println(set.contains(1));
       System.out.println(set.contains(3));
       set.add(2);
       System.out.println(set.contains(2));
        set.remove(2);
       System.out.println(set);
       System.out.println(set.contains(2));
   }
}
