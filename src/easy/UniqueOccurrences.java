/**
 *
 给你一个整数数组 arr，请你帮忙统计数组中每个数的出现次数。

 如果每个数的出现次数都是独一无二的，就返回 true；否则返回 false。
 https://leetcode-cn.com/problems/unique-number-of-occurrences/
 */
package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class UniqueOccurrences {
    public static boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);
        //排序后计算每个字符出现次数放入map，每次放入map都比较map中是否存在该次数
        int count = 0,num = arr[0];
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num){
                count++;
            }else {
                if (map.containsKey(count))
                    return false;
                map.put(count,arr[i-1]);
                if (i==arr.length-1){
                    if (map.containsKey(1))
                        return false;
                    else
                        return true;
                }
                count=1;
                num = arr[i];
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int []arr = {-3,0,1,-3,1,1,1,-3,10,0};
        System.out.println(uniqueOccurrences(arr));
    }
}
