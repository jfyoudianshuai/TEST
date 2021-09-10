package suanfa.easy;



public class No459 {
    public static boolean repeatedSubstringPattern(String s) {
        StringBuilder s1=new StringBuilder();
        StringBuilder s2=new StringBuilder();
        int index=0;
        for(int i=0;i<s.length();i++){
            s2.append(s.charAt(i));
            if(s2.length()>s1.length()){
                s1.append(s2);
                s2=new StringBuilder();
            }
            if(s1.indexOf(String.valueOf(s.charAt(i)),index-1)==index){
                index++;
            }else {
                s1.append(s2);
                s2=new StringBuilder();
                if(i>s.length()/2)return false;
                index=0;
            }
        }
        System.out.println(index);
        System.out.println(s1);
        return true;
    }
    public static boolean repeatedSubstringPattern2(String s) {
        if(s.length()==1)return false;
        String str=(s+s).substring(1,s.length()*2-1);
        System.out.println(str);
        return str.indexOf(s)!=-1;
    }

        public static void main(String[] args) {
        System.out.println(repeatedSubstringPattern2("bb"));
    }
}
