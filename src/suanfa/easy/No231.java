package suanfa.easy;

public class No231 {
    /**
     * 给你一个整数 n，请你判断该整数是否是 2 的幂次方。如果是，返回 true ；否则，返回 false 。
     * 如果存在一个整数 x 使得 n == 2x ，则认为 n 是 2 的幂次方。
     * 示例 1：
     * 输入：n = 1
     * 输出：true
     * 解释：20 = 1
     * @param n
     * @return
     */
    public static boolean isPowerOfTwo(int n) {
        int num=1;
        while(num<n){
            if(num>Integer.MAX_VALUE/2) return false;
            num*=2;
        }
        return n==num;
    }

    /**
     * 位运算  因为2的次方 的二进制 为 10000···
     * 它与前一位 n-1 01111 的与为0
     * @param n
     */
    public static boolean isPowerOfTwo2(int n) {
        return (n>0)&&(n&(n-1))==0;
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo2(16));
    }
}
