package easy; /**
 * 请完成一个函数，输入一个二叉树，该函数输出它的镜像。
 * https://leetcode-cn.com/problems/er-cha-shu-de-jing-xiang-lcof/
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
public class MirrorTree {
    public TreeNode mirrorTree(TreeNode root) {
        if (root==null){
            return null;
        }
        TreeNode treeNode = root.left;
        root.left = mirrorTree(root.right);
        root.right = mirrorTree(treeNode);
        return root;
    }
}
