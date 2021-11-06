package suanfa.easy;

import nodeandtree.BuildTree;
import nodeandtree.TreeNode;

public class No700 {
    /**
     * 给定二叉搜索树（BST）的根节点和一个值。
     * 你需要在BST中找到节点值等于给定值的节点。 返回以该节点为根的子树。 如果节点不存在，则返回 NULL。
     */
    public static TreeNode findNode(TreeNode root,int val){
        if(root==null) return null;
        if(root.val==val) return root;
        return root.val<val? findNode(root.right,val):findNode(root.left,val);
    }

    public static void main(String[] args) {
        TreeNode node= BuildTree.build(new Integer[]{4,2,7,1,3});
        TreeNode r=findNode(node,2);
        System.out.println(r);
    }
}
