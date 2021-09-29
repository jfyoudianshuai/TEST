package suanfa.easy;

import nodeandtree.TreeNode;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class No637 {
    public static List<Double> averageOfLevels(TreeNode root) {
        List<Double> list=new ArrayList<>();
        if(root==null) return list;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
       while(!q.isEmpty()){
           int count=q.size();
           double sum=0;
           for(int i=0;i<count;i++){
               TreeNode node=q.poll();
               sum+=node.val;
               if(node.left!=null) q.add(node.left);
               if(node.right!=null) q.add(node.right);
           }
           list.add(sum/count);
       }
        return list;
    }


    public static void main(String[] args) {
      Double d= 5d;

        System.out.println(d/2);
    }
}
