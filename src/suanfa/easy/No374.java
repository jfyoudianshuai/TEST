package suanfa.easy;


class GuessGame {
    int c =2;
    public int guess(int n){
        if(n>c) return -1;
        if(n==c) return 0;
        return 1;
    }
}
public class No374 extends GuessGame {


        public  int guessNumber(int n) {
            int right=Integer.MAX_VALUE;
            int left=Integer.MIN_VALUE;
            int mid=0;
            while(guess(mid)!=0) {
                if (guess(mid) == 1) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
                mid=left+(right-left)/2;
            }
            return mid;
        }

    public static void main(String[] args) {
        System.out.println(new No374().guessNumber(4));
    }
}
