package easy; /**
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 * https://leetcode-cn.com/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/
 */

import java.util.ArrayList;
import java.util.Stack;

/**
 * Definition for singly-linked list.
 * public class easy.ListNode {
 *     int val;
 *     easy.ListNode next;
 *     easy.ListNode(int x) { val = x; }
 * }
 */
public class ReversePrint {
    public int[] reversePrint(ListNode head) {
        ArrayList<Integer> ans = new ArrayList<>();
        while (head!=null){
            ans.add(0,head.val);
            head = head.next;
        }
        int []a = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            a[i] = ans.get(i);
        }
        return a;
    }
    public int[] reversePrint2(ListNode head) {
        //stack栈解法
        Stack<Integer> stack = new Stack<Integer>();
        ListNode temp = head;
        while (temp != null) {
            stack.push(temp.val);
            temp = temp.next;
        }
        int size = stack.size();
        int[] print = new int[size];
        for (int i = 0; i < size; i++) {
            print[i] = stack.pop();
        }
        return print;
    }
}
