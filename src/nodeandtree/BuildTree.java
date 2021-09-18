package nodeandtree;

public class BuildTree {
    public static TreeNode build(Integer[] arr){
        if(arr==null) return null;
        return build2(arr,0);
    }
    private static TreeNode build2(Integer[] arr,int index){
        TreeNode root=null;
        if(index<arr.length){
            Integer value=arr[index];
            if(value==null) return null;
             root=new TreeNode(value);
            root.left=build2(arr,index*2+1);
            root.right=build2(arr,index*2+2);
        }
        return root;
    }
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
