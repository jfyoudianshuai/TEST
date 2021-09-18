import nodeandtree.TreeNode;

import java.util.*;

public class Test {


    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        addList(root,list);
        return list;
    }
    public static void addList(TreeNode root,List<Integer> list){
        if(root==null)return;
        addList(root.left,list);
        list.add(root.val);
        addList(root.right,list);
    }
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            set.add(num);
            if(set.size()-1!=i){
                return true;
            }
        }
        return false;
    }
    public static int maxNumberOfBalloons(String text) {
        char[] ch=new char[]{'b','a','l','o','n'};
        int res=0;
        for(int j=0;j<ch.length;j++) {
            int count = 0;
            for (int i = 0; i < text.length(); i++) {
                if(ch[j]==text.charAt(i)){
                    count++;
                }
            }
            if(j==2 || j==3){
                count/=2;
            }
            if(j==0){
                res=count;
            }
            res=Math.min(res,count);
        }
        return res;
    }

    public static boolean isIsomorphic(String s, String t) {
        Map<Character,Character> map=new HashMap<>();
        map.put(s.charAt(0),t.charAt(0));
        for(int i=1;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                if(map.get(s.charAt(i))!=t.charAt(i)){
                    return false;
                }
            }else {
                if(map.containsValue(t.charAt(i)))return false;
                map.put(s.charAt(i),t.charAt(i));
            }
        }
        return true;
    }


    public static int calnum(int n){
        if(n==1|| n==0 || n==2) return  0;
        int num=n-1;
        boolean b=true;
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                b=false;
                break;
            }
        }
        if(!b){
            return calnum(n-1);
        }
        return calnum(n-1)+1;
    }
    public int countPrimes(int n) {
        int count=0;
        boolean[] flag=new boolean[n];
        for(int i=2;i<n;i++){
            if(!flag[i]){
                count++;
                //注意每次找当前素数 x 的倍数时，是从 x^2
                //  开始的。因为如果 x > 2那么 2*x 肯定被素数 2 给过滤了，最小未被过滤的肯定是 x^2
                for(int j=i+i;j<n;j+=i)
                    flag[j]=true;
            }
        }
        return count;
    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num=target-nums[i];
            Integer num2=map.get(num);
            if(num2!=null){
                return new int[]{num2,i};
            }
            map.put(nums[i],i);
        }
        return null;
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            Integer index=map.get(nums[i]);
            if(index!=null){
                if(i-index<=k) return true;
            }
            map.put(nums[i],i);
        }
        return false;
    }
    public static ListNode removeElements(ListNode head, int val) {
        if(head==null) return null;
        while(head.val==val){
            head=head.next;
            if(head==null)return null;
        }
        ListNode r=head;
        ListNode node=head.next;
        while(node!=null){
            while(node.val==val){

                head.next=node.next;
                node=node.next;
                if(node==null) break;
            }
            if(node!=null) {
                node = node.next;
                head = head.next;
            }
        }
        return r;
    }


    public static ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode res=head;
        while(head!=null){
            ListNode tmp=head.next;
            res.next=prev;
            prev=res;
            head=tmp;
            res=head;
        }
        return prev;
    }

    public static int arrayPairSum(Integer[] nums) {
        int num=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i+=2){
            num+=nums[i];
        }
        return num;
    }

    public static String dayOfTheWeek(int day, int month, int year) {
            String[] week = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
            Calendar calendar=Calendar.getInstance();
            calendar.set(Calendar.YEAR, year);
            calendar.set(Calendar.MONTH, month-1);
            calendar.set(Calendar.DAY_OF_MONTH, day);
            System.out.println(week[calendar.get(Calendar.DAY_OF_WEEK)-1]);
            return "";
        }

    public static void main(String[] args) {
//    Queue<Integer> queue=new LinkedList<>();
//    queue.offer(1);
//    queue.add(2);
//        System.out.println(queue.peek());

//    nodeandtree.TreeNode root=new nodeandtree.TreeNode(1);
//    root.right=new nodeandtree.TreeNode(2);
//    root.right.left=new nodeandtree.TreeNode(3);
//        System.out.println(inorderTraversal(root));
                Integer [] arr=new Integer[]{6,2,6,5,1,2};
                int [] arr2=new int[]{1,2,3,2,3};
        System.out.println(containsNearbyDuplicate(arr2,3));
//    ListNode head=BuildTree.getListNode(arr);
//    ListNode res=reverseList(head);
//        System.out.println(arrayPairSum(arr));
//        dayOfTheWeek(31,8,2019);
//        System.out.println(isIsomorphic("efg","add"));
//        int a="AS".charAt(0);
//        Integer [] arr=new Integer[]{1,2,3,4,5,6};
////        nodeandtree.TreeNode root=BuildTree.build(arr);
//        ListNode node=new ListNode(arr[0]);
//        ListNode head=node;
//        for(int i=1;i<arr.length;i++){
//            ListNode n=new ListNode(arr[i]);
//            node.next=n;
//            node=n;
//        }
//        System.out.println(head);
//       ListNode ads=removeElements(head,6);
//        System.out.println(ads);


        //5 66 777 99 10 K 2
        //4 66 88 9 JJ Q 2
//        for(Integer i=2;i<=1000;i++){
//            Integer p=i*i;
//            Integer n=i.toString().length();
//            String h=p.toString().substring(p.toString().length()-n);
//            if(i==Integer.parseInt(h)){
//                System.out.println(i);
//            }
//        }
    }
}
