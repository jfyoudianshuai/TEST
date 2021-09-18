package suanfa.easy;


import java.util.Arrays;

public class No566 {
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        if(mat.length*mat[0].length!=r*c) return mat;
        int[][] res=new int[r][c];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                int count=i*mat[i].length+j;
                int rr=count/c ;
                int rc=count%c ;
                res[rr][rc]=mat[i][j];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] res=matrixReshape(new int[][]{{1,2,3,3},{4,4,5,6}},4,2);
        for(int[] a:res){
            System.out.println(Arrays.toString(a));
        }
    }
}
