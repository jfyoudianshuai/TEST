package suanfa.easy;

public class No326 {
    public static boolean isPowerOfThree(int n) {
        while(n>1){
            if(n%3!=0) return false;
            n/=3;
        }
        return n==1;
    }
}
