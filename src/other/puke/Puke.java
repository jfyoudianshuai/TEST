package other.puke;

import util.BeanUtils;

import javax.naming.event.ObjectChangeListener;
import java.util.*;

public class Puke {
    public List<Object> di=new ArrayList<>();
    public List<Object> allP=new ArrayList<>();
    public Puke(){
        for(int j=0;j<4;j++) {
            for (int i = 2; i < 11; i++) {
                allP.add(i);
            }
            allP.add("A");
            allP.add("J");
            allP.add("Q");
            allP.add("K");
        }
        allP.add("大");
        allP.add("小");
    }
    public void givePu(){
        for(int i=0;i<3;i++){
            int n= new Random().nextInt(53-i);
            Object o=allP.remove(n);
            di.add(o);
        }
    }
    public void faPu(Man man){
        while(man.getList().size()!=17){
            if(allP.size()==17){
                man.getList().addAll(allP);
            }else {
                int n = new Random().nextInt(allP.size() - 1);
                Object o = allP.remove(n);
                man.getList().add(o);
            }
        }
        Collections.sort(man.getList(), new Comparator<Object>() {
            public int compare(Object o1, Object o2) {
               if(o1.equals("大")){
                   return 1;
               }
               if(o1.equals("小")){
                   if(o2.equals("大")){
                       return -1;
                   }
                   return 1;
               }
               if(o1.equals("2")){
                   if(o2.equals("大")||o2.equals("小")){
                       return -1;
                   }
                   return 1;
               }
                if(o1.equals("A")){
                    if(o2.equals("大")||o2.equals("小")||o2.equals("2")){
                        return -1;
                    }
                    return 1;
                }
                return String.valueOf(o1).compareTo(String.valueOf(o2));
            }
        });
        System.out.println(man.getList());
    }
    public static void main(String[] args) {
        Puke puke=new Puke();
        puke.givePu();
        System.out.println(puke.di);
        Man man1=new Man();
        Man man2=new Man();
        Man man3=new Man();
        puke.faPu(man1);
        puke.faPu(man2);
        puke.faPu(man3);
        System.out.println(puke.allP.size());
        System.out.println(puke.allP);




    }
}
