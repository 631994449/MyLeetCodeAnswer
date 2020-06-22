/**
 *给你个整数数组 arr，其中每个元素都不相同。请你找到所有具有最小绝对差的元素对，并且按升序的顺序返回。
 * https://leetcode-cn.com/problems/minimum-absolute-difference/
 *
 *示例 1：
 * 输入：arr = [4,2,1,3]
 * 输出：[[1,2],[2,3],[3,4]]
 *
 * 示例 2：
 * 输入：arr = [1,3,6,10,15]
 * 输出：[[1,3]]
 */
package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsDifference {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min = arr[1]-arr[0];
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        res.add(arr[0]);
        res.add(arr[1]);
        ans.add(res);
        for (int i = 2; i < arr.length; i++) {
            if (arr[i]-arr[i-1]<min){
                min = arr[i]-arr[i-1];
                ans.clear();
                List<Integer> temp = new ArrayList<>();
                temp.add(arr[i-1]);
                temp.add(arr[i]);
                ans.add(temp);
            }else if(arr[i]-arr[i-1]==min){
                List<Integer> temp = new ArrayList<>();
                temp.add(arr[i-1]);
                temp.add(arr[i]);
                ans.add(temp);
            }else{
                continue;
            }
        }
        return ans;
    }
}
