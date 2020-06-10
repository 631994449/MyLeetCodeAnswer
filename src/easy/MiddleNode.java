/**
 * 给定一个带有头结点 head 的非空单链表，返回链表的中间结点。
 *
 * 如果有两个中间结点，则返回第二个中间结点。
 *https://leetcode-cn.com/problems/middle-of-the-linked-list/
 */

package easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class MiddleNode {
    public static ListNode middleNode(ListNode head) {
        if (head.next==null)
            return head;
        List<ListNode> listNodes = new ArrayList<>();
        while (head!=null){
            listNodes.add(head);
            head = head.next;
        }
        return listNodes.get((listNodes.size()+1)/2);
    }

    public static void main(String[] args) {
    }
}
