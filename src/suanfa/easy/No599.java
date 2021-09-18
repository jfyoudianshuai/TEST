package suanfa.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No599 {
    public static String[] findRestaurant(String[] list1, String[] list2) {
        List<String> l=new ArrayList<>();
        int index=list1.length+list2.length;
        for(int i=0;i<list1.length;i++){
            for(int j=0;j<list2.length;j++){
                if(list1[i].equals(list2[j])){
                    if(index>i+j){
                        index=i+j;
                        l.removeAll(l);
                        l.add(list1[i]);
                    }else if(index==i+j){
                        l.add(list1[i]);
                    }
                }
            }
        }
        return l.toArray(new String[]{});
    }

    public static void main(String[] args) {
  String[] s1=    { "Shogun", "Tapioca Express", "Burger King", "KFC"};
String[] s2={"KFC", "Shogun", "Burger King"};

        System.out.println(Arrays.toString(findRestaurant(s1,s2)));
    }
}
