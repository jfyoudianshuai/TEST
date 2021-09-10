package suanfa.easy;

public class No454 {
    public static int arrangeCoins(int n) {
        int c=0;
        int i=0;
        while(n-c>i) {
            c += i++;
        }

        return n-c==i?i:i-1;
    }

    public static void main(String[] args) {
        System.out.println(arrangeCoins(5));
    }
}
