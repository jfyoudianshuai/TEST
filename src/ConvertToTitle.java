import nodeandtree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class ConvertToTitle {
    public static String convertToTitle(Integer number){
        char[] ch=new char[26];
        for (int i = 0; i < ch.length; i++) {
            ch[i]=(char)(i+65);
        }
        StringBuilder builder=new StringBuilder();
        while(number>26){
            int y;
            if(number%26==0){
                y=26;
                number=number/26-1;
            }else {
                y=number%26;
                number=number/26;
            }
            builder.append(ch[y-1]);
        }
        builder.append(ch[number-1]);
        return builder.reverse().toString();
    }

    public static int majorityElement(int[] nums) {
        int count=1;
        int n=nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(n==nums[i]){
                count++;
            }else {
                count--;
                if(count==0) n=nums[i+1];
            }

        }
        return n;
    }

    public static int titleToNumber(String columnTitle) {
        int n=0;
        for(int i=0;i<columnTitle.length();i++){
            int c=columnTitle.charAt(i)-64;
            n*=26;
            n+=c;
        }
        return n;
    }



    public static int trailingZeroes(int n) {
        int count=0;
        while(n>=5){
            count+=n/5;
            n/=5;
        }
        return count;
    }
    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        addpostTree(list,root);
        return list;
    }
    private static void addpostTree(List<Integer> list, TreeNode root){
        if(root==null) return;
        addpostTree(list,root.left);
        addpostTree(list,root.right);
        list.add(root.val);
    }
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        addpreTree(list,root);
        return list;
    }
    private static void addpreTree(List<Integer> list, TreeNode root){
        if(root==null) return ;
        list.add(root.val);
        if(root.left!=null) addpreTree(list,root.left);
        if(root.right!=null) addpreTree(list,root.right);

    }
    public static int reverseBits(int n) {
        int res=0;
        for(int i=0;i<32;i++){
            int w=n&1;
            n=n>>1;
            res =(res<<1) |w;
        }
        return res;
    }

    public static int hammingWeight(int n) {
        int count=0;
        for(int i=0;i<32;i++){
            int w=n&1;
            if(w==1)count++;
            n=n>>1;
        }
        return count;
    }
    public static   boolean isHappy(int n) {
        int slow=n;
        int fast=n;
        do{
            slow=happy(slow);
            fast=happy(fast);
            fast=happy(fast);
            if(fast==1) return true;
        }while(slow!=fast);

        return false;
    }
    private static   int happy(int n){
        int c=0;
        while(n>0){
            c+=(n%10)*(n%10);
            n/=10;
        }
        return c;
    }
}
