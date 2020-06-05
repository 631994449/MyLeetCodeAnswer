package easy; /**
 * 给你一个整数 n，请你帮忙计算并返回该整数「各位数字之积」与「各位数字之和」的差。
 * https://leetcode-cn.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
 */

public class SubtractProductAndSum {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        while(n>=10){
            sum = sum + n%10;
            product = product * (n%10);
            n = n/10;
        }
        return product*n-sum-n;
    }
}
