package suanfa.easy;

public class No509 {
    public static int fib(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        return fib(n-1)+fib(n-2);
    }
    public static int fib2(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        int first=0,second=1,third=0;
        while(n-1!=0){
            third=first+second;
            first=second;
            second=third;
            n--;
        }
        return third;
    }

    public static void main(String[] args) {
        for(int i=0;i<10;i++) {
            System.out.println(fib2(i));
        }
    }
}
