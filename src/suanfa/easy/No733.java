package suanfa.easy;

import java.util.Arrays;

public class No733 {
    /**
     * 1 1 1
     * 1 2 0
     * 1 0 1
     */
    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int n=image[sr][sc];
        image[sr][sc]=newColor;
        addColor(image,sr,sc,newColor,n);
        return image;
    }
    private static void addColor(int[][] image,int sr,int sc,int newColor,int n){
        if(sr==0){
            if(sc==0){
                //image[sr][sc+1]=newColor;
                setValue(image,sr,sc+1,n,newColor);
            }else if(sc==image[0].length-1) {
                //image[sr][sc-1]=newColor;
                setValue(image,sr,sc-1,n,newColor);
            }else {
                setValue(image,sr,sc+1,n,newColor);
                setValue(image,sr,sc-1,n,newColor);
                //image[sr][sc+1]=newColor;
                //image[sr][sc-1]=newColor;
            }
            setValue(image,sr+1,sc,n,newColor);
//            image[sr+1][sc]=newColor;
        }else if(sr==image.length-1){
            if(sc==0){
                setValue(image,sr,sc+1,n,newColor);
             //   image[sr][sc+1]=newColor;
            }else if(sc==image[0].length-1) {
                setValue(image,sr,sc-1,n,newColor);
               // image[sr][sc-1]=newColor;
            }else {
                setValue(image,sr,sc+1,n,newColor);
                setValue(image,sr,sc-1,n,newColor);
//                image[sr][sc+1]=newColor;
//                image[sr][sc-1]=newColor;
            }
            setValue(image,sr-1,sc,n,newColor);
//            image[sr-1][sc]=newColor;
        }else {
            if(sc==0){
                setValue(image,sr,sc+1,n,newColor);
            }else if(sc==image[0].length-1) {
                setValue(image,sr,sc-1,n,newColor);
            }else {
                setValue(image,sr,sc+1,n,newColor);
                setValue(image,sr,sc-1,n,newColor);
            }
            setValue(image,sr+1,sc,n,newColor);
            setValue(image,sr-1,sc,n,newColor);
        }
    }
    private static void setValue(int[][] image,int sr,int sc,int n,int newColor){
        if(image[sr][sc]==n){
            image[sr][sc]=newColor;
            addColor(image,sr,sc,newColor,n);
        }
    }
// 0 0 0
// 0 1 1
public int[][] floodFill1(int[][] image, int sr, int sc, int newColor) {
    int oldColor = image[sr][sc];
    DFS(image,sr,sc,newColor,oldColor);
    return image;
}

    public void DFS(int[][] image,int x,int y,int newColor,int oldColor){
        if(x < 0 || x >= image.length || y < 0 || y >= image[0].length) {
            return;
        }
        if(image[x][y] != oldColor || image[x][y] == newColor){
            return;
        }
        image[x][y] = newColor;
        DFS(image, x - 1, y,newColor,oldColor);
        DFS(image, x + 1, y,newColor,oldColor);
        DFS(image, x, y - 1,newColor,oldColor);
        DFS(image, x, y + 1,newColor,oldColor);
    }
    public static void main(String[] args) {
        int[][] image={{0,0,0},{0,1,1}};
        floodFill(image,1,1,1);
        for(int[] a:image){
            System.out.println(Arrays.toString(a));
        }
    }
}
