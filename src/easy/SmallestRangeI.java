/**
 * 给你一个整数数组 A，对于每个整数 A[i]，我们可以选择处于区间 [-K, K] 中的任意数 x ，将 x 与 A[i] 相加，结果存入 A[i] 。
 *
 * 在此过程之后，我们得到一些数组 B。
 *
 * 返回 B 的最大值和 B 的最小值之间可能存在的最小差值。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/smallest-range-i
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
package easy;

import java.util.Arrays;

public class SmallestRangeI {
    public int smallestRangeI(int[] A, int K) {
        Arrays.sort(A);
        if (A[0]+K>=A[A.length-1]-K){
            return 0;
        }else{
            return A[A.length-1]-2*K-A[0];
        }
    }

}
