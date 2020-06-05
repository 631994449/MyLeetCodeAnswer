package easy; /**
 * 给你一个仅由数字 6 和 9 组成的正整数 num。
 *
 * 你最多只能翻转一位数字，将 6 变成 9，或者把 9 变成 6 。
 *
 * 请返回你可以得到的最大数字。
 * https://leetcode-cn.com/problems/maximum-69-number/
 */

public class Maximum69Number {
    public static int maximum69Number (int num) {
        char []ans = (""+num).toCharArray();
        for (int i = 0; i < ans.length ; i++) {
            if (ans[i]!='9'){
                ans[i] = '9';
                break;
            }
        }
        int res = 0;
        for (int i = 0; i < ans.length; i++) {
            res = res + Integer.parseInt(""+ans[i])*(int)Math.pow(10,ans.length-1-i);
        }
        return res;
        /**
         * String s = num + "";
         *
         *         s = s.replaceFirst("6", "9");
         *
         *         return Integer.valueOf(s);
         *
         * 作者：yin-87
         * 链接：https://leetcode-cn.com/problems/maximum-69-number/solution/javasan-xing-jian-dan-de-yun-yong-bu-fen-han-shu-j/
         * 来源：力扣（LeetCode）
         * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
         * 阿超你什么时候才能聪明一点？
         */
    }

    public static void main(String[] args) {
        System.out.println(maximum69Number(9669));
    }
}
