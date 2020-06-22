/**
 *
 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 说明：
 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 https://leetcode-cn.com/problems/single-number/
 */
package easy;

import java.util.Arrays;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        if (nums.length==1)
            return nums[0];
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-2; i = i+2) {
            if (nums[i]!=nums[i+1]){
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }
    /**
     * 以上答案不为错，但是一下答案更优秀
     */
    public int singleNumber2(int[] nums) {
        /**
         * 通过异或方法 a异或a = 0 ;a异或0 = a;
         */
        int single = 0;
        for (int num : nums) {
            single ^= num;
        }
        return single;
    }
}
