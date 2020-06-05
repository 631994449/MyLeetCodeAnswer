package easy; /**
 * 给定二叉搜索树的根结点 root，返回 L 和 R（含）之间的所有结点的值的和。
 *
 * 二叉搜索树保证具有唯一的值。
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
public class RangeSumBST {
    public int rangeSumBST(TreeNode root, int L, int R) {
        if (root == null)
            return 0;
        int ans = 0;
        if (root.val>=L&&root.val<=R)
            ans = root.val;
        return ans+rangeSumBST(root.left,L,R)+rangeSumBST(root.right,L,R);
    }
    public int rangeSumBST2(TreeNode root, int L, int R) {
        //大佬做法:如果当前节点小于L,则只搜索右子树
        //        如果当前节点大于R,则只搜索左子树
        //        当前节点在LR之间，则搜索所有子树
        if(root == null) return 0;
        if(root.val >= L && root.val <= R) return root.val + rangeSumBST(root.left, L, R) + rangeSumBST(root.right, L, R);
        else if(root.val < L) return rangeSumBST(root.right, L, R);
        else return rangeSumBST(root.left, L, R);

//        作者：charles-gao
//        链接：https://leetcode-cn.com/problems/range-sum-of-bst/solution/4xing-dai-ma-ji-bai-100-by-charles-gao/
//        来源：力扣（LeetCode）
//        著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
    }
}
