/**
 * 我们把符合下列属性的数组 A 称作山脉：
 *
 * A.length >= 3
 * 存在 0 < i < A.length - 1 使得A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]
 * 给定一个确定为山脉的数组，返回任何满足 A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1] 的 i 的值。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/peak-index-in-a-mountain-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
package easy;

import java.util.Arrays;

public class PeakIndexInMountainArray {
    public int peakIndexInMountainArray(int[] A) {
        int ans = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i]>A[ans])
                ans = i;
        }
        return ans;
        /**        二分查找法
         *         int min = 0, max = A.length - 1;
         *         while (min < max) {
         *             int mid = min + (max - min) / 2;
         *             if (A[mid] < A[mid + 1])
         *                 min = mid + 1;
         *             else
         *                 max = mid;
         *         }
         *         return min;
         */
    }
}
