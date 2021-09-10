package suanfa.easy;

public class No461 {
    public static int hammingDistance(int x, int y) {
        int count=0;
        for(int i=0;i<32;i++){
            int xx=x&1;
            int yy=y&1;
            int c=xx ^ yy;
            if(c==1){
                count++;
            }
            x= x>>1;
            y= y>>1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(hammingDistance(1, 3));
    }
}
