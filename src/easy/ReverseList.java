package easy;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
 * https://leetcode-cn.com/problems/fan-zhuan-lian-biao-lcof/
 * https://leetcode-cn.com/problems/reverse-linked-list/
 */
public class ReverseList {
    public ListNode reverseList(ListNode head) {
        Queue<Integer> stack= new LinkedList<>();
        while (head!=null){
            stack.add(head.val);
            head = head.next;
        }
        ListNode node = new ListNode(stack.poll());
        while(!stack.isEmpty()){
            ListNode temp = new ListNode(stack.poll());
            temp.next = node;
            node = temp;
        }
        return node;
    }
    public ListNode reverseList2(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode p = reverseList2(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }
}
