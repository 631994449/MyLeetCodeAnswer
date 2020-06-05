package easy; /**
 * 给你一个数组 arr ，请你将每个元素用它右边最大的元素替换，如果是最后一个元素，用 -1 替换。
 *
 * 完成所有替换操作后，请你返回这个数组。
 * https://leetcode-cn.com/problems/replace-elements-with-greatest-element-on-right-side/
 */

public class ReplaceElements {
    public static int[] replaceElements(int[] arr) {
        int []ans = new int[arr.length];
        ans[arr.length-1] = -1;
        int max = -1;
        for (int i = arr.length-2; i >=0; i--) {
            ans[i] = Math.max(max,arr[i+1]);
            max = ans[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int []arr = new int[]{17,18,5,4,6,1};
        int []ans = replaceElements(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}
