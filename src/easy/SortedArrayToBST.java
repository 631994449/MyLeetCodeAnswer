/**
 * 给定一个有序整数数组，元素各不相同且按升序排列，编写一个算法，创建一棵高度最小的二叉搜索树。
 * https://leetcode-cn.com/problems/minimum-height-tree-lcci/
 *
 * LeetCode中还有一题与之相同
 * 将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树。
 *
 * 本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1。
 * https://leetcode-cn.com/problems/convert-sorted-array-to-binary-search-tree/
 */
package easy;

import java.util.Arrays;

public class SortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0){
            return null;
        }
        TreeNode treeNode = new TreeNode(nums[nums.length/2]);
        int []left = new int[nums.length/2];
        int []right = new int [(nums.length-1)/2];
        //奇数个数数组{1,2,  3  ,4,5}
        //偶数个数数组{1,2,3,   4    ,5,6}
        if (left.length == 0 ){
            treeNode.left = null;
        }else{
            for (int i = 0; i < left.length; i++)
                left[i] = nums[i];
            treeNode.left = sortedArrayToBST(left);
        }
        if (right.length==0){
            treeNode.right = null;
        }else{
            for (int i = 0; i < right.length; i++)
                right[i] = nums[nums.length / 2 + 1 + i];
            treeNode.right = sortedArrayToBST(right);
        }
        return treeNode;
    }

    public static void main(String[] args) {

    }
    /**    大佬的做法:
     *     作者：zackqf
     *     链接：https://leetcode-cn.com/problems/minimum-height-tree-lcci/solution/javadi-gui-5xing-dai-ma-by-zackqf/
     *     来源：力扣（LeetCode）
     *     著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     */
    public TreeNode sortedArrayToBST2(int[] nums) {
        if(nums.length==0) return null;
        TreeNode n = new TreeNode(nums[nums.length/2]);
        n.left = sortedArrayToBST(Arrays.copyOfRange(nums,0,nums.length/2));
        n.right = sortedArrayToBST(Arrays.copyOfRange(nums,nums.length/2+1,nums.length));
        return n;
    }


}
