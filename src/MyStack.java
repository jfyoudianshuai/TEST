import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    private Queue<Integer> queue;
    private Queue<Integer> stack;
    /** Initialize your data structure here. */
    public MyStack() {
        queue=new LinkedList();
        stack=new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        queue.offer(x);// 先放在辅助队列中
        while(!stack.isEmpty()){
            queue.offer(stack.poll());
        }
        Queue t;// 最后交换queue1和queue2，将元素都放到queue1中
        t=stack;
        stack=queue;
        queue=t;
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return stack.poll();
            }

    /** Get the top element. */
    public int top() {
        return stack.peek();
            }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return stack.isEmpty();
            }
}