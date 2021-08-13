package nodeandtree;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    public static ListNode getListNode(Integer[] arr) {
        ListNode head=new ListNode(arr[0]);
        ListNode res=head;
        for(int i=1;i<arr.length;i++){
            ListNode node=new ListNode(arr[i]);
            head.next=node;
            head=node;
        }
        return res;
    }
}
