package suanfa.easy;

import nodeandtree.BuildTree;
import nodeandtree.TreeNode;

public class No617 {
    public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1==null) return root2;
        if(root2==null) return root1;
        root1.val+=root2.val;
        root1.left=mergeTrees(root1.left,root2.left);
        root1.right=mergeTrees(root1.right,root2.right);
        return root1;
    }



    public static void main(String[] args) {
        TreeNode node= BuildTree.build(new Integer[]{1,3,2,5});
        TreeNode node1= BuildTree.build(new Integer[]{2,1,3,null,4,null,7});
        TreeNode res=mergeTrees(node,node1);
        System.out.println(res);
    }
}
