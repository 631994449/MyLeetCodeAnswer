/**
 *
 给定一个 N 叉树，找到其最大深度。

 最大深度是指从根节点到最远叶子节点的最长路径上的节点总数。
 https://leetcode-cn.com/problems/maximum-depth-of-n-ary-tree/
 */
package easy;
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
public class MaxDepthNTree {
    public int maxDepth(Node root) {
        if (root==null)
            return 0;
        if (root.children.size()==0)//root.children.isEmpty()
            return 1;
        int max = maxDepth(root.children.get(0));
        for (int i = 1; i < root.children.size(); i++) {
            if (maxDepth(root.children.get(i))>max){
                max = maxDepth(root.children.get(i));
            }
        }
        return max+1;
    }
}
