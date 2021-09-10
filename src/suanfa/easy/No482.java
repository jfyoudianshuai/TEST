package suanfa.easy;

public class No482 {
    public static String licenseKeyFormatting(String s, int k) {
        String[] ss=s.split("-");
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < ss.length; i++) {
            sb.append(ss[i]);
        }
        int first=sb.length()%k;
        first=first==0?k:first;


        while(first<sb.length()){
            sb.insert(first,"-");
            first+=(k+1);
        }
        return sb.toString().toUpperCase();
    }

    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        sb.append("abc");
        sb.insert(1,"oo");
        System.out.println(sb);
        System.out.println(licenseKeyFormatting("4f-f3-f3-j3",4));

    }
}
