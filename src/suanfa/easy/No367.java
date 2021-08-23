package suanfa.easy;

public class No367 {
    /**
     *利用 1+3+5+7+9+…+(2n-1)=n^2，即完全平方数肯定是前n个连续奇数的和
     * @param num
     * @return
     */
    public static boolean isPerfectSquare(int num) {
        int c=1;
        while(num>0){
            num-=c;
            c+=2;
        }
        return num ==0;
    }
}
