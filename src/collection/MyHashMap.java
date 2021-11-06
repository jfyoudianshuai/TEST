package collection;


public class MyHashMap {
    Integer[] nums;
    public MyHashMap() {
        nums=new Integer[1000001];
    }

    public void put(int key, int value) {
        nums[key]=value;
    }

    public int get(int key) {
        return nums[key]==null? -1:nums[key];
    }

    public void remove(int key) {
        nums[key]=null;
    }

    public static void main(String[] args) {
        String s="SGDFG";
        StringBuilder sb=new StringBuilder();
        for( int i=0;i<s.length();i++){
           char c=s.charAt(i);
           if(c<=90 && c>= 65){
               c +=32;
           }
           sb.append(c);
        }
        System.out.println(sb.toString());
    }
}
