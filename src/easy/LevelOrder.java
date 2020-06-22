/**
 *从上到下按层打印二叉树，同一层的节点按从左到右的顺序打印，每一层打印到一行。
 * https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-ii-lcof/
 */
package easy;

import java.util.ArrayList;
import java.util.List;

public class LevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        getChildOrder(root,0,ans);
        return ans;
    }
    public void getChildOrder(TreeNode root,int level,List<List<Integer>> ans){
        if (root==null)
            return;
        if (ans.size()-1<level){
            List<Integer> list = new ArrayList<>();
            list.add(root.val);
            ans.add(list);
        }else {
            ans.get(level).add(root.val);
        }
        getChildOrder(root.left,level+1,ans);
        getChildOrder(root.right,level+1,ans);
    }
}
