package easy; /**
 * 桌上有 n 堆力扣币，每堆的数量保存在数组 coins 中。我们每次可以选择任意一堆，拿走其中的一枚或者两枚，求拿完所有力扣币的最少次数。
 * https://leetcode-cn.com/problems/na-ying-bi/
 */

public class MinCount {
    public int minCount(int[] coins) {
        int ans = 0;
        for (int i = 0; i < coins.length; i++) {
            if (coins[i]%2==0)
                ans = ans + coins[i]/2;
            else
                ans = ans + coins[i]/2 + 1;
        }
        return ans;
    }
    //此处修改内容为 每堆硬币不通过判断的方式计算要拿几次， 而是直接通过(x+1)/2 x为硬币个数
    public int minCount2(int[] coins) {
        int ans = 0;
        for (int i = 0; i < coins.length; i++) {
            ans = ans + (coins[i]+1)/2;
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
