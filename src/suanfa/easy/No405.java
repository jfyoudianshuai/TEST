package suanfa.easy;

public class No405 {
    public static String toHex(int num) {
        return toHexFor4(Integer.toBinaryString(num));
    }
    private static String toHexFor4(String s){
        int zero=s.length()%4;
        switch (zero){
            case 1: s="000"+s;break;
            case 2: s="00" +s;break;
            case 3: s="0"+s;break;
            default:break;
        }
        StringBuilder b=new StringBuilder();
        Integer r=0;
        for(int i=0;i<s.length();i++){
            Integer c=Integer.parseInt(String.valueOf(s.charAt(i)));
            switch (i%4){
                case 0:r+=c*8;break;
                case 1:r+=c*4;break;
                case 2:r+=c*2;break;
                default: r+=c;
                    if(r>=10) {
                        char ch = (char) (r - 10 + 97);
                        b.append(ch);
                    }else {
                        b.append(r);
                    }
                    r=0;  break;
            }
        }
        return b.toString();
    }
    public static void main(String[] args) {
        System.out.println(toHexFor4(Integer.toBinaryString(26)));
        System.out.println(Integer.toBinaryString(26));
    }
}
