package suanfa.easy;




public class No541 {
    /**
     * 给定一个字符串 s 和一个整数 k，从字符串开头算起，每计数至 2k 个字符，就反转这 2k 字符中的前 k 个字符。
     * 如果剩余字符少于 k 个，则将剩余字符全部反转。
     * 如果剩余字符小于 2k 但大于或等于 k 个，则反转前 k 个字符，其余字符保持原样。
     * 示例 1：
     * 输入：s = "abcdefg", k = 2
     * 输出："bacdfeg"
     * 示例 2：
     * 输入：s = "abcd", k = 2
     * 输出："bacd"
     */
    public static  String reverseStr(String s, int k) {
        StringBuilder sb=new StringBuilder();
        StringBuilder res=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(i%(2*k)==0 && i!=0 ){
                res.append(new StringBuilder(sb.substring(0,k)).reverse());
                res.append(sb.substring(k));
                sb = new StringBuilder();
            }
            sb.append(s.charAt(i));
        }
        if(sb.length()>k){
            res.append(new StringBuilder(sb.substring(0,k)).reverse());
            res.append(sb.substring(k));
        }else {
            res.append(sb.reverse());
        }
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseStr("abcd",3));
    }
}
