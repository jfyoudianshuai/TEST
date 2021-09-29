package suanfa.easy;

import nodeandtree.BuildTree;
import nodeandtree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class No653 {
    /**
     * 给定一个二叉搜索树 root 和一个目标结果 k，如果 BST 中存在两个元素且它们的和等于给定的目标结果，则返回 true。
     */
    public static boolean findTarget(TreeNode root, int k) {
        List<Integer> list=new ArrayList<>();
       return addTree(root,k,list);
    }

    private static boolean addTree(TreeNode root, int k, List<Integer> list) {
        if(root!=null){
            if(list.contains(k-root.val)) return true;
            list.add(root.val);
            return addTree(root.left,k,list) || addTree(root.right,k,list);
        }
        return false;
    }

    public static void main(String[] args) {
        TreeNode node= BuildTree.build(new Integer[]{1,2,3,null,5,null,7});
        System.out.println(findTarget(node,10));
    }
}
