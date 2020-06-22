/**
 * 输入一个正整数 target ，输出所有和为 target 的连续正整数序列（至少含有两个数）。
 * 序列内的数字由小到大排列，不同序列按照首个数字从小到大排列。
 *
 * 示例 1：
 * 输入：target = 9
 * 输出：[[2,3,4],[4,5]]
 *
 * 示例 2：
 * 输入：target = 15
 * 输出：[[1,2,3,4,5],[4,5,6],[7,8]]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/he-wei-sde-lian-xu-zheng-shu-xu-lie-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
package easy;

import java.util.ArrayList;
import java.util.List;

public class FindContinuousSequence {
    public int[][] findContinuousSequence(int target) {
        if (target<3)
            return new int[0][0];
        int left = 1;
        int right = 2;
        int sum = 3;
        List<int[]> result = new ArrayList<>();
        while(left<=target/2){
            if (sum<target){
                right++;
                sum = sum +right;
            }else if(sum>target){
                sum = sum - left;
                left++;
            }else {
                int[] ans = new int[right-left+1];
                int count = 0;
                for (int i = left; i <= right; i++) {
                    ans[count] = i;
                    count++;
                }
                result.add(ans);
                sum = sum - left;
                left++;
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}
