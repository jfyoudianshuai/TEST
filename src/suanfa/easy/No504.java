package suanfa.easy;


public class No504 {
    /**
     * 给定一个整数 num，将其转化为 7 进制，并以字符串形式输出。
     * 示例 1:
     * 输入: num = 100
     * 输出: "202"
     * 示例 2:
     * 输入: num = -7
     * 输出: "-10"
     */
    public static String convertToBase7(int num) {
        if(num == 0) return "0";
        StringBuilder sb=new StringBuilder();
        int n=Math.abs(num);
        while(n!=0){
            sb.append(n%7);
            n/=7;
        }
        if(num<0){
            sb.append("-");
        }
        return sb.reverse().toString();
    }
}
