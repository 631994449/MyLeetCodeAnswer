package easy; /**
 * 给定两个二叉树，想象当你将它们中的一个覆盖到另一个上时，两个二叉树的一些节点便会重叠。
 *
 * 你需要将他们合并为一个新的二叉树。合并的规则是如果两个节点重叠，那么将他们的值相加作为节点合并后的新值，否则不为 NULL 的节点将直接作为新二叉树的节点。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/merge-two-binary-trees
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
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

public class MergeTrees {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1==null&&t2==null)return null;
        if (t1 ==null)return t2;
        if (t2 ==null)return t1;
        TreeNode treeNode = new TreeNode(t1.val+ t2.val);
        treeNode.left = mergeTrees(t1.left,t2.left);
        treeNode.right = mergeTrees(t1.right,t2.right);
        return treeNode;
    }
}
