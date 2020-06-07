/**
 * 给定一个 N 叉树，返回其节点值的前序遍历。
 *
 * 例如，给定一个 3叉树 :
 *https://leetcode-cn.com/problems/n-ary-tree-preorder-traversal/
 * 返回其前序遍历: [1,3,5,6,2,4]。
 */
package easy;

import java.util.*;

public class Preorder {
    public List<Integer> preorder(Node root) {
        LinkedList<Node> queue = new LinkedList<>();
        LinkedList<Integer> output = new LinkedList<>();
        if (root==null){
            return output;
        }
        queue.add(root);
        while (!queue.isEmpty()){
            Node node = queue.pollLast();
            output.add(node.val);
            Collections.reverse(node.children);//反转链表
            for (Node item : node.children) {
                queue.add(item);
            }
        }
        return output;
    }
}
