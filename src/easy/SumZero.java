/**
 * 给你一个整数 n，请你返回 任意 一个由 n 个 各不相同 的整数组成的数组，并且这 n 个数相加和为 0 。
 * https://leetcode-cn.com/problems/find-n-unique-integers-sum-up-to-zero/
 */
package easy;

public class SumZero {
    public static int[] sumZero(int n) {
        if (n==1)
            return new int[]{0};
        int []ans = new int[n];
        for (int i = 0; i < n/2; i++) {
            ans[i*2] = i+1;
            ans[i*2+1] = -i-1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[]ans = sumZero(7);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}
