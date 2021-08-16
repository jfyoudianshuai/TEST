package suanfa.easy;

import nodeandtree.ListNode;

import java.util.List;

public class No237 {
    /**
     * 请编写一个函数，使其可以删除某个链表中给定的（非末尾）节点。传入函数的唯一参数为 要被删除的节点 。
     * @param node
     */
    public static void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
    }

    public static void main(String[] args) {
        ListNode node= ListNode.getListNode(new Integer[]{1,3,4});
        ListNode n=new ListNode(5);
        node.next=n;
        n.next=new ListNode(10);
        deleteNode(n);
        System.out.println(node);
    }
}
