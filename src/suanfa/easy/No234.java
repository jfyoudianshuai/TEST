package suanfa.easy;

import nodeandtree.ListNode;

import java.util.Stack;

public class No234 {
    /**
     * 请判断一个链表是否为回文链表。
     * 示例 1:
     * 输入: 1->2
     * 输出: false
     * 示例 2:
     * 输入: 1->2->2->1
     * 输出: true
     */
    public static boolean isPalindrome(ListNode head) {
        Stack<Integer> stack=new Stack<>();
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null){
            stack.push(slow.val);
            slow=slow.next;
            fast=fast.next;
            if(fast!=null) {
                fast = fast.next;
            }else {
                stack.pop();
            }
        }
        while(slow!=null){
            if(slow.val!=stack.pop())return false;
            slow=slow.next;
        }
        return stack.isEmpty();
    }
    ListNode temp;

    /**
     * 利用全局变量temp不变，递归到最后一个节点，比较temp与递归的节点的值
     * @param head
     * @return
     */
    public boolean isPalindrome2(ListNode head) {
        if(head == null || head.next == null)return true;
        temp = head;
        return dfs(head);
    }

    public boolean dfs(ListNode head){
        if(head == null)return true;
        boolean res = dfs(head.next) && temp.val == head.val;
        temp = temp.next;
        return res;
    }

    public static void main(String[] args) {
        ListNode node=ListNode.getListNode(new Integer[]{1,2,3,2,1});
        System.out.println(isPalindrome(node));
    }
}
