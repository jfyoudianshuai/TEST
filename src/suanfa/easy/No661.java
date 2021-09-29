package suanfa.easy;

import java.util.Arrays;

public class No661 {
    /**
     * 包含整数的二维矩阵 M 表示一个图片的灰度。你需要设计一个平滑器来让每一个单元的灰度成为平均灰度 (向下舍入) ，平均灰度的计算是周围的8个单元和它本身的值求平均，如果周围的单元格不足八个，则尽可能多的利用它们。
     * 示例 1:
     * 输入:
     * [[1,1,1],
     *  [1,0,1],
     *  [1,1,1]]
     * 输出:
     * [[0, 0, 0],
     *  [0, 0, 0],
     *  [0, 0, 0]]
     * 解释:
     * 对于点 (0,0), (0,2), (2,0), (2,2): 平均(3/4) = 平均(0.75) = 0
     * 对于点 (0,1), (1,0), (1,2), (2,1): 平均(5/6) = 平均(0.83333333) = 0
     * 对于点 (1,1): 平均(8/9) = 平均(0.88888889) = 0
     */
    public static int[][] imageSmoother(int[][] img) {
        int[][] res=new int[img.length][img[0].length];
        for (int i = 0; i < img.length; i++) {
            if(i==0) {
                if(img[i].length==0){return res;}
                for (int j = 0; j < img[i].length; j++) {
                    int count=0;
                    if(img[i].length<1)
                    if (j == 0) {
                        if(img[i][j+1]!=0)count+=img[i][j+1];
                        if(img[i+1][j]!=0)count+=img[i+1][j];
                        if(img[i+1][j+1]!=0)count+=img[i+1][j+1];
                    }else if(j==img[i].length-1) {
                        if(img[i][j-1]!=0)count+=img[i][j-1];
                        if(img[i+1][j]!=0)count+=img[i+1][j];
                        if(img[i+1][j-1]!=0)count+=img[i+1][j-1];
                    }else {
                        if(img[i][j-1]!=0)count+=img[i][j-1];
                        if(img[i][j+1]!=0)count+=img[i][j+1];
                        if(img[i+1][j]!=0)count+=img[i+1][j];
                        if(img[i+1][j+1]!=0)count+=img[i+1][j+1];
                        if(img[i+1][j-1]!=0)count+=img[i+1][j-1];
                    }
                    if(img[i][j]!=0)count+=img[i][j];
                    res[i][j]= j==0||j==img[i].length-1?count/4:count/6;
                }
            }else if(i==img.length-1) {
                for (int j = 0; j < img[i].length; j++) {
                    int count=0;
                    if (j == 0) {
                        if(img[i-1][j+1]!=0)count+=img[i-1][j+1];
                        if(img[i-1][j]!=0)count+=img[i-1][j];
                        if(img[i][j+1]!=0)count+=img[i][j+1];
                    }else if(j==img[i].length-1) {
                        if(img[i][j-1]!=0)count+=img[i][j-1];
                        if(img[i-1][j-1]!=0)count+=img[i-1][j-1];
                        if(img[i-1][j]!=0)count+=img[i-1][j];
                    }else {
                        if(img[i][j-1]!=0)count+=img[i][j-1];
                        if(img[i][j+1]!=0)count+=img[i][j+1];
                        if(img[i-1][j]!=0)count+=img[i-1][j];
                        if(img[i-1][j+1]!=0)count+=img[i-1][j+1];
                        if(img[i-1][j-1]!=0)count+=img[i-1][j-1];
                    }
                    if(img[i][j]!=0)count+=img[i][j];
                    res[i][j]= j==0||j==img[i].length-1?count/4:count/6;
                }
            }else {
                for (int j = 0; j < img[i].length; j++) {

                    int count=0;
                    if(j==0){
                        if(img[i-1][j]!=0)count+=img[i-1][j];
                        if(img[i-1][j+1]!=0)count+=img[i-1][j+1];
                        if(img[i][j+1]!=0)count+=img[i][j+1];
                        if(img[i+1][j]!=0)count+=img[i+1][j];
                        if(img[i+1][j+1]!=0)count+=img[i+1][j+1];
                    }else if(j==img[i].length-1){
                        if(img[i-1][j-1]!=0)count+=img[i-1][j-1];
                        if(img[i-1][j]!=0)count+=img[i-1][j];
                        if(img[i][j-1]!=0)count+=img[i][j-1];
                        if(img[i+1][j-1]!=0)count+=img[i+1][j-1];
                        if(img[i+1][j]!=0)count+=img[i+1][j];
                    }else {
                        if (img[i - 1][j - 1] !=0) count+=img[i-1][j-1];
                        if (img[i - 1][j] !=0) count+=img[i-1][j];
                        if (img[i - 1][j + 1] !=0) count+=img[i-1][j+1];
                        if (img[i][j - 1] !=0) count+=img[i][j-1];
                        if (img[i][j + 1] !=0) count+=img[i][j+1];
                        if (img[i + 1][j - 1] !=0) count+=img[i+1][j-1];
                        if (img[i + 1][j] !=0) count+=img[i+1][j];
                        if (img[i + 1][j + 1] !=0) count+=img[i+1][j+1];
                    }
                    if(img[i][j]!=0)count+=img[i][j];
                    res[i][j]= j==0||j==img[i].length-1?count/6:count/9;
                }
            }
        }
        return  res;
    }
    public int[][] imageSmoother1(int[][] M) {
        int m = M.length;
        int n = M[0].length;
        int[][] res = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                res[i][j] = smooth(M,i,j);
            }
        }
        return res;
    }

    private int smooth(int[][] M,int x,int y){
        int sum=0;
        int count = 1;
        int m = M.length;
        int n = M[0].length;
        //x的范围:0~m-1, y的范围0~n-1
        if(x!=0&&y!=0){sum+=M[x-1][y-1];count++;}
        if(y!=0){sum+=M[x][y-1];count++;}
        if(x!=m-1&&y!=0){sum+=M[x+1][y-1];count++;}
        if(x!=0){sum+=M[x-1][y];count++;}
        if(x!=m-1){sum+=M[x+1][y];count++;}
        if(x!=0&&y!=n-1){sum+=M[x-1][y+1];count++;}
        if(y!=n-1){sum+=M[x][y+1];count++;}
        if(x!=m-1&&y!=n-1){sum+=M[x+1][y+1];count++;}
        return (sum+M[x][y])/count;
    }

    public static void main(String[] args) {
        int[][] arr =imageSmoother(new int[][]{{100,200,100},{200,50,200},{100,200,100}});
        for(int[] r:arr){
            System.out.println(Arrays.toString(r));
        }
    }
}
