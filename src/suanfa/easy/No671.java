package suanfa.easy;

import nodeandtree.BuildTree;
import nodeandtree.TreeNode;

import java.util.Stack;

public class No671 {
    public static int findSecondMinimumValue(TreeNode root) {
        Stack<Integer> stack=new Stack();
        Stack<Integer> stack2=new Stack();
        adds(root,stack,stack2);
            if(stack.size()<2) return -1;
        stack.pop();
        return stack.pop();
    }

    private static void adds(TreeNode root, Stack<Integer> stack,Stack<Integer> stack2) {
        if(root==null) return;
        while(!stack.isEmpty()&&stack.peek()<root.val){
            stack2.push(stack.pop());
        }
        if(!stack.contains(root.val)) stack.push(root.val);
        while(!stack2.isEmpty()){
            stack.push(stack2.pop());
        }
        adds(root.left,stack,stack2);
        adds(root.right,stack,stack2);
    }

    public static void main(String[] args) {
        TreeNode node= BuildTree.build(new Integer[]{2,2,5,null,null,5,7});
        System.out.println(findSecondMinimumValue(node));
    }
}
