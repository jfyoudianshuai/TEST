package suanfa.easy;

import java.util.Stack;

public class No232 {


    public static void main(String[] args) {
        MyQueue q= new No232(). new MyQueue();
        q.push(1);
        q.push(2);
        q.pop();
        q.push(3);
        q.push(4);
        while(!q.empty()) System.out.println(q.pop());
    }
    /**
     * 请你仅使用两个栈实现先入先出队列。队列应当支持一般队列支持的所有操作（push、pop、peek、empty）：
     *
     * 实现 MyQueue 类：
     *
     * void push(int x) 将元素 x 推到队列的末尾
     * int pop() 从队列的开头移除并返回元素
     * int peek() 返回队列开头的元素
     * boolean empty() 如果队列为空，返回 true ；否则，返回 false
     */
    class MyQueue {
        Stack<Integer> stack1;
        Stack<Integer> stack2;
        /** Initialize your data structure here. */
        public MyQueue() {
            stack1=new Stack();
            stack2=new Stack();
        }

        /** Push element x to the back of queue. */
        public void push(int x) {
            while(!stack2.isEmpty())stack1.push(stack2.pop());
            stack1.push(x);
            while(!stack1.isEmpty())stack2.push(stack1.pop());
        }

        /** Removes the element from in front of queue and returns that element. */
        public int pop() {
            return stack2.pop();
        }

        /** Get the front element. */
        public int peek() {
            return stack2.peek();
        }

        /** Returns whether the queue is empty. */
        public boolean empty() {
            return stack2.isEmpty();
        }
    }

}
