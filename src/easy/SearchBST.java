/**
 * 给定二叉搜索树（BST）的根节点和一个值。
 * 你需要在BST中找到节点值等于给定值的节点。 返回以该节点为根的子树。 如果节点不存在，则返回 NULL。
 * https://leetcode-cn.com/problems/search-in-a-binary-search-tree/
 */
package easy;

import sun.reflect.generics.tree.Tree;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class SearchBST {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root==null)
            return null;
        System.out.println(root.val);
        if (root.val==val){
            return root;
        }else if (root.val<val){
            return searchBST(root.right,val);
        }else {
            return searchBST(root.left,val);
        }
    }
}
