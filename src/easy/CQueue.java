/**
 *
 用两个栈实现一个队列。队列的声明如下，
 请实现它的两个函数 appendTail 和 deleteHead ，
 分别完成在队列尾部插入整数和在队列头部删除整数的功能。
 (若队列中没有元素，deleteHead 操作返回 -1 )
 https://leetcode-cn.com/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof/
 */
package easy;

import java.util.Stack;

class CQueue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public CQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void appendTail(int value) {
        putNums();
        stack1.push(value);
    }

    public int deleteHead() {
        putNums();
        if (stack1.isEmpty()&&stack2.isEmpty()){
            return -1;
        }
        while(stack1.size()!=1){
            stack2.push(stack1.pop());
        }
        return stack1.pop();
    }
    public void putNums(){
        while (!stack2.isEmpty())
            stack1.push(stack2.pop());
    }
}

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */