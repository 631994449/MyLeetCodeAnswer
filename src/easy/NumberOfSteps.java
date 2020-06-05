package easy; /**
 * 给你一个非负整数 num ，请你返回将它变成 0 所需要的步数。 如果当前数字是偶数，你需要把它除以 2 ；否则，减去 1 。
 * https://leetcode-cn.com/problems/number-of-steps-to-reduce-a-number-to-zero/
 */

public class NumberOfSteps {
    public int n;
    public int numberOfSteps (int num) {
        if(num%2==0)
            num = num / 2;
        else
            num = num -1 ;
        n++;
        return num==0?n:numberOfSteps(num);
    }
}
