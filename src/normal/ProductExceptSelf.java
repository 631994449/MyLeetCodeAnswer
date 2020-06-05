package normal;

/**
 * 给你一个长度为 n 的整数数组 nums，其中 n > 1，返回输出数组 output ，其中 output[i] 等于 nums 中除 nums[i] 之外其余各元素的乘积。
 *
 * 来源：力扣（LeetCode）
 *
 * 提示：题目数据保证数组之中任意元素的全部前缀元素和后缀（甚至是整个数组）的乘积都在 32 位整数范围内。
 * 说明: 请不要使用除法，且在 O(n) 时间复杂度内完成此题。
 * 链接：https://leetcode-cn.com/problems/product-of-array-except-self
 *  著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        //将ans数组作为前缀元素积
        int []ans = new int[nums.length];
        ans[0] = 1;
        //计算前缀元素积
        for (int i = 1; i < nums.length; i++) {
            ans[i] = nums[i-1]*ans[i-1];
        }
        int []right = new int[nums.length];
        right[nums.length-1] = 1;
        for (int i = nums.length-2; i >=0; i--) {
            right[i] = right[i+1] * nums[i+1];
        }
        for (int i = 0; i < ans.length; i++) {
            ans[i] = ans[i]*right[i];
        }
        return ans;
    }
}
