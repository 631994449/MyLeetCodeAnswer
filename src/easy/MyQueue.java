/**
 * 实现一个MyQueue类，该类用两个栈来实现一个队列。
 * https://leetcode-cn.com/problems/implement-queue-using-stacks-lcci/
 */
package easy;

import java.util.Stack;

class MyQueue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    /** Initialize your data structure here. */
    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        putNums();
        stack1.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        putNums();
        while (stack1.size()!=1){
            stack2.push(stack1.pop());
        }
        return stack1.pop();
    }

    /** Get the front element. */
    public int peek() {
        putNums();
        while (stack1.size()!=1){
            stack2.push(stack1.pop());
        }
        return stack1.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack1.isEmpty()&&stack2.isEmpty();
    }
    public void putNums(){
        while (!stack2.isEmpty())
            stack1.push(stack2.pop());
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
