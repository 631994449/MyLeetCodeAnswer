/**
 * 请实现一个函数，输入一个整数，输出该数二进制表示中 1 的个数。例如，把 9 表示成二进制是 1001，有 2 位是 1。因此，如果输入 9，则该函数输出 2。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/er-jin-zhi-zhong-1de-ge-shu-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
package easy;

public class HammingWeight {
    public static int hammingWeight(int n) {
        int ans = 0;
        while (n!=0){
            ans+=n&1;
            n=n>>>1;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(hammingWeight(9));
    }
}
