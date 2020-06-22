/**
 * 给你两个数组，arr1 和 arr2，
 *
 * arr2 中的元素各不相同
 * arr2 中的每个元素都出现在 arr1 中
 * 对 arr1 中的元素进行排序，使 arr1 中项的相对顺序和 arr2 中的相对顺序相同。
 * 未在 arr2 中出现过的元素需要按照升序放在 arr1 的末尾。
 *
 *提示：
 * arr1.length, arr2.length <= 1000
 * 0 <= arr1[i], arr2[i] <= 1000
 * arr2 中的元素 arr2[i] 各不相同
 * arr2 中的每个元素 arr2[i] 都出现在 arr1 中
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/relative-sort-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
package easy;

public class RelativeSortArray {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int [] keg = new int[1001];
        int [] result = new int[arr1.length];
        int count = 0;
        for (int i = 0; i < arr1.length; i++)
            keg[arr1[i]]++;
        for (int i = 0; i < arr2.length; i++) {
            while (keg[arr2[i]]!=0){
                result[count] = arr2[i];
                count++;
                keg[arr2[i]]--;
            }
        }
        for (int i = 0; i < keg.length; i++) {
            while (keg[i]!=0){
                result[count] = i;
                keg[i]--;
                count++;
            }
        }
        return result;
    }
}
