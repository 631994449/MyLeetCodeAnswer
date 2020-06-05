package easy; /**
 * 输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。比如输入 3，则打印出 1、2、3 一直到最大的 3 位数 999。
 * https://leetcode-cn.com/problems/da-yin-cong-1dao-zui-da-de-nwei-shu-lcof/
 */

public class PrintNumbers {
    public static int[] printNumbers(int n) {
        if (n==0){
            return new int[]{0};
        }
        int []ans = new int[(int)Math.pow(10,n)-1];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = i+1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int []ans = printNumbers(1);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }

    }
}
