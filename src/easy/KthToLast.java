package easy; /**
 * 实现一种算法，找出单向链表中倒数第 k 个节点。返回该节点的值。
 *
 * 注意：本题相对原题稍作改动
 * https://leetcode-cn.com/problems/kth-node-from-end-of-list-lcci/
 */

/**
 * Definition for singly-linked list.
 * public class easy.ListNode {
 *     int val;
 *     easy.ListNode next;
 *     easy.ListNode(int x) { val = x; }
 * }
 */
public class KthToLast {
    //看了题解才做出来，解决思路:双指针，指针a先走k-1步，然后指针a和指针b同时向后走，当指针a的后一位为空时，指针b的值就是所求值
    public int kthToLast(ListNode head, int k) {
        ListNode headK = head;
        for (int i = 0; i < k; i++) {
            headK = headK.next;
        }
        while (headK.next!=null){
            head = head.next;
            headK = headK.next;
        }
        return head.val;
    }
}
