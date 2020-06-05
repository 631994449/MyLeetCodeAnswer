package easy; /**
 * 给你两个长度相同的整数数组 target 和 arr 。
 *
 * 每一步中，你可以选择 arr 的任意 非空子数组 并将它翻转。你可以执行此过程任意次。
 *
 * 如果你能让 arr 变得与 target 相同，返回 True；否则，返回 False 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/make-two-arrays-equal-by-reversing-sub-arrays
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */


import java.util.Arrays;

public class CanBeEqual {
    public boolean canBeEqual(int[] target, int[] arr) {
        if (target.length!=arr.length)
            return false;
        Arrays.sort(target);
        Arrays.sort(arr);
        for(int i=0;i<target.length;i++){
            if(target[i]!=arr[i])
                return false;
        }
        return true;
    }
}
