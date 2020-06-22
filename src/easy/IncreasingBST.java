/**
 *给你一个树，请你 按中序遍历 重新排列树，使树中最左边的结点现在是树的根，并且每个结点没有左子结点，只有一个右子结点。
 * https://leetcode-cn.com/problems/increasing-order-search-tree/
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
public class IncreasingBST {
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        order(root,list);
        TreeNode ans = new TreeNode(0);
        TreeNode temp = ans;
        for (int val:list) {
            temp.right = new TreeNode(val);
            temp = temp.right;
        }
        return ans.right;
    }
    public void order(TreeNode root,List<Integer> list){
        if (root==null)
            return;
        order(root.left,list);
        list.add(root.val);
        order(root.right,list);
    }
}
