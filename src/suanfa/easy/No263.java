package suanfa.easy;

public class No263 {
    /**
     * 给你一个整数 n ，请你判断 n 是否为 丑数 。如果是，返回 true ；否则，返回 false 。
     * 丑数 就是只包含质因数 2、3 和/或 5 的正整数。
     * 示例 1：
     * 输入：n = 6
     * 输出：true
     * 解释：6 = 2 × 3
     */
    public static boolean isUgly(int n) {
        if(n<=0) return false;
        if(n==5 || n==3 || n==2 || n==1) return true;
        boolean b1=false;
        boolean b2=false;
        boolean b3=false;
        if(n%2==0){
            b1=isUgly(n/2);
        }
        if(n%3==0){
            b2=isUgly(n/3);
        }
        if(n%5==0){
            b3=isUgly(n/5);
        }
        return b1 || b2 || b3;
    }

    /**
     * 对能被2,3,5整除的数不断除2,3,5，最后剩1就是，剩0就不是，除2可以用位运算替换
     * @param n
     * @return
     */
    public static boolean isUgly2(int n){
        if(n<1) return false;
        while(n%5==0){
            n/=5;
        }
        while(n%3==0){
            n/=3;
        }
        while(n%2==0){
            n>>=1;
        }
       return n==1;
    }
    public static void main(String[] args) {
        for(int i=4;i<20;i++) System.out.println(i+" :   "+isUgly(i));
    }
}
