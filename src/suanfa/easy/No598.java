package suanfa.easy;

public class No598 {
    public static int maxCount(int m, int n, int[][] ops) {

        int x=Integer.MAX_VALUE;
        int y=Integer.MAX_VALUE;
        for(int i=0;i<ops.length;i++){
            if(ops[i].length!=0) {
                x = Math.min(ops[i][0], x);
                y = Math.min(ops[i][1], y);
            }
        }
        if(x==Integer.MAX_VALUE|| y==Integer.MAX_VALUE || x*y>m*n){
            return m*n;
        }
        return x*y;
    }
    public static int maxCount1(int m, int n, int[][] ops) {
        if(ops.length==0){
            return m*n;
        }
        int a=Integer.MAX_VALUE;
        int b=Integer.MAX_VALUE;
        for(int i=0;i<ops.length;i++){
            a=Math.min(a,ops[i][0]);
            b=Math.min(b,ops[i][1]);
        }
        return a*b;
    }

    public static void main(String[] args) {
        int[][] arr=new int[][]{{6,6}};
        System.out.println(maxCount1(3,3,new int[][]{{}}));
    }
}
