/**
 * 给定两个数组，编写一个函数来计算它们的交集。
 * https://leetcode-cn.com/problems/intersection-of-two-arrays/
 */
package easy;

import java.util.*;

public class Intersection {
    public int[] intersection(int[] nums1, int[] nums2) {
        /**
         * 想不用暴力解法，寻找其他方法进行，最后结果得不偿失
         */
        if (nums1.length==0||nums2.length==0)
            return new int[0];
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0;
        List<Integer> list = new ArrayList<>();
        while (i<nums1.length&&j<nums2.length){
            if (nums1[i]==nums2[j]){
                if (!list.contains(nums1[i]))
                    list.add(nums1[i]);
                i++;
                j++;
            }else if(nums1[i]>nums2[j]){
                j++;
            }else {
                i++;
            }
        }
        int []ans = new int[list.size()];
        for (int k = 0; k < list.size(); k++) {
            ans[k] = list.get(k);
        }
        return ans;
    }
    public int[] intersection2(int[] nums1, int[] nums2) {
        /**    大部分题解的思路 双set
         *     作者：a-fei-8  <--大佬用了不止一种解法
         *     链接：https://leetcode-cn.com/problems/intersection-of-two-arrays/solution/duo-chong-jie-fa-jie-jue-349-liang-ge-shu-zu-de-ji/
         *     来源：力扣（LeetCode）
         *     著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
         */
        if (nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0) {
            return new int[0];
        }
        Set<Integer> parentSet = new HashSet<>();
        Set<Integer> childSet = new HashSet<>();
        for (int num : nums1) {
            parentSet.add(num);
        }
        for (int num : nums2) {
            if (parentSet.contains(num)) {
                childSet.add(num);
            }
        }
        int[] resArr = new int[childSet.size()];
        int index = 0;
        for (int value : childSet) {
            resArr[index++] = value;
        }
        return resArr;
    }


}
