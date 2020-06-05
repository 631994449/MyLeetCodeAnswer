package easy; /**
 * 实现一种算法，删除单向链表中间的某个节点（即不是第一个或最后一个节点），假定你只能访问该节点。
 * https://leetcode-cn.com/problems/delete-middle-node-lcci/
 */

/**
 * Definition for singly-linked list.
 * public class easy.ListNode {
 *     int val;
 *     easy.ListNode next;
 *     easy.ListNode(int x) { val = x; }
 * }
 */

public class DeleteNode {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}

