package easy; /**
 * 给你两个整数数组 nums 和 index。你需要按照以下规则创建目标数组：
 * 目标数组 target 最初为空。
 * 按从左到右的顺序依次读取 nums[i] 和 index[i]，在 target 数组中的下标 index[i] 处插入值 nums[i] 。
 * 重复上一步，直到在 nums 和 index 中都没有要读取的元素。
 * 请你返回目标数组。
 * 题目保证数字插入位置总是存在
 * 链接：https://leetcode-cn.com/problems/create-target-array-in-the-given-order
 * index[i]<=i
 * */

import java.util.ArrayList;
import java.util.List;

public class CreateTargetArray {
    public int[] createTargetArray(int[] nums, int[] index) {
        int n = nums.length;
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < n; i++){
            res.add(index[i], nums[i]);
        }
        int[] target = new int[n];
        for(int i = 0; i < n; i++){
            target[i] = res.get(i);
        }
        return target;
    }

}
