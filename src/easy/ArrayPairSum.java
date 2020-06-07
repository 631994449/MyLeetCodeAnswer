/**
 * 给定长度为 2n 的数组, 你的任务是将这些数分成 n 对, 例如 (a1, b1), (a2, b2), ..., (an, bn) ，使得从1 到 n 的 min(ai, bi) 总和最大。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/array-partition-i
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * 提示:
 *
 * n 是正整数,范围在 [1, 10000].
 * 数组中的元素范围在 [-10000, 10000].
 */
package easy;

import java.util.Arrays;

public class ArrayPairSum {
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        for (int i = 0; i < nums.length/2; i++) {
            ans = ans + nums[2*i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int []nums = {4,2,3,1};
        System.out.println(arrayPairSum(nums));
    }
}
