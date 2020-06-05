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
