package suanfa.easy;

public class No605 {
    /**
     * 假设有一个很长的花坛，一部分地块种植了花，另一部分却没有。可是，花不能种植在相邻的地块上，它们会争夺水源，两者都会死去。
     * 给你一个整数数组  flowerbed 表示花坛，由若干 0 和 1 组成，其中 0 表示没种植花，1 表示种植了花。另有一个数 n ，
     * 能否在不打破种植规则的情况下种入 n 朵花？能则返回 true ，不能则返回 false。
     * 示例 1：
     * 输入：flowerbed = [0,1,0,0,0,0,0], n = 1
     * 输出：true
     */
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count=0;
        if(flowerbed.length==1 && flowerbed[0]==0) return n<=1;
        if(flowerbed.length==2){
            if(flowerbed[0]==1 || flowerbed[1]==1){
                return n==0;
            }
            return n<=1;
        }
        if(flowerbed.length==3){
            if(flowerbed[0]+flowerbed[1]+flowerbed[2]>1 || flowerbed[1]==1) return n==0;
            if(flowerbed[0]+flowerbed[2]==1) return n<=1;
            return n<=2;
        }
        for(int i=0;i<flowerbed.length-2;i++){
            if(i==0 && flowerbed[1]==0 && flowerbed[0]==0){
                count++;
                flowerbed[0]=1;
                continue;
            }
            if(i==flowerbed.length-3 && flowerbed[i+1]==0 && flowerbed[i+2]==0){
                count++;
                flowerbed[i+2]=1;
            }
            if(flowerbed[i]==0&& flowerbed[i+1]==0 && flowerbed[i+2]==0){
                count++;
                flowerbed[i+1]=1;
            }
        }

        return count>=n;
    }

    public static void main(String[] args) {
        System.out.println(canPlaceFlowers(new int[]{0,0,0},2));
    }
}
