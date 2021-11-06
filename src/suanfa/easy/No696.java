package suanfa.easy;

public class No696 {
    public static int countBinarySubstrings(String s) {
        int res=0;
        int prev=0;
        int now=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                now++;
                if(prev>=now)res++;
            }else {
                res++;
                prev=now;
                now=1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(countBinarySubstrings("00110011"));
    }
}
