/**
 * 给定一棵二叉搜索树，请找出其中第k大的节点。
 * https://leetcode-cn.com/problems/er-cha-sou-suo-shu-de-di-kda-jie-dian-lcof/
 */
package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class KthLargest {
    public int kthLargest(TreeNode root, int k) {
        List<Integer> result = new ArrayList<>();
        add(root,result);
        return result.get(result.size() -k);
    }
    public void add(TreeNode node,List<Integer>temp){

////         更加省时间的判断
//         if(node == null)
//             return;
//         add(node.left,temp);
//         temp.add(node.val);
//         add(node.right,temp);

        if (node.left != null)
            add(node.left,temp);
        if (node!=null)
            temp.add(node.val);
        if (node.right!=null)
            add(node.right,temp);
    }
}
