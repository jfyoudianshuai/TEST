package suanfa.easy;

import java.util.ArrayList;
import java.util.List;

public class No463 {
    public static int islandPerimeter(int[][] grid) {
        int sum=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==1){
                    sum+=4;
                    if(j>0 && grid[i][j-1]==1){
                        sum-=2;
                    }
                    if(i>0 && grid[i-1][j]==1){
                        sum-=2;
                    }
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] a={{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
        int[][] b={{0,1,1},{0,1,0}};
        System.out.println(islandPerimeter(b));
    }
}
