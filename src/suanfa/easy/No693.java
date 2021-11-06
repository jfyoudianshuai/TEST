package suanfa.easy;

public class No693 {
    public static boolean hasAlternatingBits(int n) {
        int prev=0,now=0;
        prev=n&1;
        n=n>>1;
        while(n>0){
            now=n&1;
            if(prev==now)return false;
            n=n>>1;
            prev=now;
        }
        return true;
    }
    /*
     * 分析：
     * 如果n是交替的01，对于它右移一位后得到的m，
     * 存在n跟m在二进制下必然是0和1对应的（对位）。异或运算必定都是1；
     * 举个栗子：5=101 5>>1=10,5^(5>>1)=111 (这是伪代码)
     *  101
     *   10  =111
     * 其他情况都不会满足这个特征。所以temp=n^(n>>1)必定满足temp=2^N-1;
     * 而temp+1后是N+1位二进制数2^(N+1)。
     * 所以temp&(temp+1)==0；
     * 如果满足这个等式就是就是交替位二进制数
     */
    public boolean hasAlternatingBits1(int n) {
        int temp=n^(n>>1);
        return (temp&(temp+1))==0;
    }
    public static void main(String[] args) {
        System.out.println(hasAlternatingBits(5));
    }
}
