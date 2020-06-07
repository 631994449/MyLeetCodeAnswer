/**
 * 自除数 是指可以被它包含的每一位数除尽的数。
 *
 * 例如，128 是一个自除数，因为 128 % 1 == 0，128 % 2 == 0，128 % 8 == 0。
 *
 * 还有，自除数不允许包含 0 。
 *
 * 给定上边界和下边界数字，输出一个列表，列表的元素是边界（含边界）内所有的自除数。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/self-dividing-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
package easy;

import java.util.ArrayList;
import java.util.List;
//此题官方也仅有暴力解法
public class SelfDividingNumbers {
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        for (int i = left; i < right+1; i++) {
            int num = i;
            while (num!=0){
                int x = num % 10;
                if (x==0||i%x!=0)
                    break;
                num = num/10;
            }
            if (num==0)
                ans.add(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        List<Integer> ans = selfDividingNumbers(1,22);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }
}
