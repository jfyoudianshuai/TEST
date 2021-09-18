package suanfa.easy;

import nodeandtree.Node;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class No590 {
    /**
     * 定一个 N 叉树，返回其节点值的 后序遍历 。
     * N 叉树 在输入中按层序遍历进行序列化表示，每组子节点由空值 null 分隔（请参见示例）。
     * 进阶：
     * 递归法很简单，你可以使用迭代法完成此题吗?
     */
    /**
     * 递归
     * @param root
     * @return
     */
    public static List<Integer> postorder(Node root) {
        List<Integer> list=new ArrayList<>();
        addList(root,list);
        return list;
    }

    private static void addList(Node root, List<Integer> list) {
        if(root==null) return;
        if(root.children!=null){
            for(Node n:root.children){
                addList(n,list);
            }
        }
        list.add(root.val);
    }

    /**
     * 迭代
     * @param root
     * @return
     */
    public static List<Integer> postorder1(Node root) {
        List<Integer> list=new ArrayList<>();
        if(root==null) return list;
        Stack<Node> stack=new Stack<>();
        stack.add(root);
        while(!stack.isEmpty()){
            Node n=stack.pop();
            if(n.children!=null){
                for (int i = n.children.size() - 1; i >= 0; i--) {
                    stack.push(n.children.get(i));
                }
            }
            list.add(n.val);
        }
        Collections.reverse(list);
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
        System.out.println(postorder1(node));
    }

}
