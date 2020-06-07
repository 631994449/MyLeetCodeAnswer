package easy; /**
 * 输入一棵二叉树的根节点，求该树的深度。从根节点到叶节点依次经过的节点（含根、叶节点）形成树的一条路径，最长路径的长度为树的深度。
 * https://leetcode-cn.com/problems/er-cha-shu-de-shen-du-lcof/
 */

/**
 * Definition for a binary tree node.
 * public class easy.TreeNode {
 *     int val;
 *     easy.TreeNode left;
 *     easy.TreeNode right;
 *     easy.TreeNode(int x) { val = x; }
 * }
 */
public class MaxDepth {
    Integer ans = 1;
    public int maxDepth(TreeNode root) {
        //个人的递归想法
        if (root == null) {
            return 0;
        }
        if (root.left==null&&root.right==null){
            return ans;
        }
        ans++;
        if (root.left==null){
            return maxDepth(root.right);
        }
        if (root.right==null){
            return maxDepth(root.left);
        }
        return Math.max(maxDepth(root.left),maxDepth(root.right));
    }
    public int maxDepth2(TreeNode root) {//题解中相同的想法
        if (root==null)
            return 0;
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;

    }
}
