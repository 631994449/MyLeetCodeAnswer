/**
 * 学校在拍年度纪念照时，一般要求学生按照 非递减 的高度顺序排列。
 *
 * 请你返回能让所有学生以 非递减 高度排列的最小必要移动人数。
 *
 * 注意，当一组学生被选中时，他们之间可以以任何可能的方式重新排序，而未被选中的学生应该保持不动
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/height-checker
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
package easy;

import java.util.Arrays;

public class HeightChecker {
    public static int heightChecker(int[] heights) {
        if (heights.length==0)
            return 0;
        //temp赋值语句int []temp=Arrays.copyOf(heights ,heights.length) ;
        int []temp = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            temp[i] = heights[i];
        }
        Arrays.sort(heights);
        int ans = 0;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i]!=heights[i])
                ans++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int []a = new int[]{5,1,2,3,4};
        System.out.println(heightChecker(a));
    }
}
