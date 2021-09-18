package suanfa.easy;

import nodeandtree.ListNode;
import nodeandtree.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NO589 {
    /**
     * 递归
     * @param root
     * @return
     */
    public static List<Integer> preorder(Node root) {
        List<Integer> list=new ArrayList<>();
        addList(root,list);
        return list;
    }

    private static void addList(Node root, List<Integer> list) {
        if(root==null) return;
        list.add(root.val);
        if(root.children!=null){
            for(Node n:root.children){
                addList(n,list);
            }
        }
    }


    /**
     * 迭代
     * 递归其实也就像栈
     * @param args
     */
    public static List<Integer> preorder1(Node root) {
        List<Integer> list=new ArrayList<>();
        if(root==null) return list;
        Stack<Node> stack=new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            Node n=stack.pop();
            list.add(n.val);
            if(n.children!=null) {
                for (int i = n.children.size() - 1; i >= 0; i--) {
                    stack.push(n.children.get(i));
                }
            }

        }
        return list;
    }


    public static void main(String[] args) {
        Node node=new Node(1);
        Node node1=new Node(2);
        Node node2=new Node(3);
        Node node3=new Node(4);
        Node node4=new Node(5);
        List<Node> list=new ArrayList<>();
        list.add(node1);
        list.add(node2);
        list.add(node3);
        list.add(node4);
        node.children=list;
        System.out.println(preorder1(node));
    }
}
