/**
 *
 * 给你两个整数数组 arr1 ， arr2 和一个整数 d ，请你返回两个数组之间的 距离值 。
 *
 * 「距离值」 定义为符合此描述的元素数目：对于元素 arr1[i] ，不存在任何元素 arr2[j] 满足 |arr1[i]-arr2[j]| <= d 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/find-the-distance-value-between-two-arrays
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
package easy;

public class FindTheDistanceValue {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int ans = arr1.length;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (Math.abs(arr1[i]-arr2[j])<=d){
                    ans--;
                    break;
                }
            }
        }
        return ans;
    }
}
