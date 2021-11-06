package suanfa.easy;

import java.util.ArrayList;
import java.util.List;

public class No690 {
    public static int res=0;
    public static int getImportance(List<Employee> employees, int id) {
        for(Employee e:employees){
            if(e.id==id){
                res+=e.importance;
                if(e.subordinates==null) return res;
                for(Integer i:e.subordinates){
                    getImportance(employees,i);
                }
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {

        Employee e1=new Employee();
        e1.id=1;e1.importance=2;e1.subordinates=new ArrayList<>();e1.subordinates.add(5);
        Employee e2=new Employee();
        e2.id=5;e2.importance=-3;e2.subordinates=new ArrayList<>();
        Employee e3=new Employee();
        e3.id=3;e3.importance=3;e2.subordinates=new ArrayList<>();
        List<Employee> list=new ArrayList<>();list.add(e1);list.add(e2);
        System.out.println(list);
        System.out.println(getImportance(list,5));
    }
}
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;

    @Override
    public String toString() {
        return "["+id+","+importance+","+subordinates+"]";
    }
};
