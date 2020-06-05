package easy; /**
 * 给你一个整数数组 nums，请你返回其中位数为 偶数 的数字的个数。
 * https://leetcode-cn.com/problems/find-numbers-with-even-number-of-digits/
 */

public class FindNumbers {
    public int findNumbers(int[] nums) {
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            if (String.valueOf(nums[i]).length()%2==0)
                ans++;
        }
        return ans;
    }
}
