/**
 * 编写一个方法，找出两个数字a和b中最大的那一个。不得使用if-else或其他比较运算符。
 * https://leetcode-cn.com/problems/maximum-lcci/
 */
package easy;

public class Maximum {
    public int maximum(int a, int b) {
        /**
         * 看了他人题解才做出来的
         */
        // 先考虑没有溢出时的情况，计算 b - a 的最高位，依照题目所给提示 k = 1 时 a > b，即 b - a 为负
        int k = b - a >>> 31;
        // 再考虑 a b 异号的情况，此时无脑选是正号的数字
        int aSign = a >>> 31, bSign = b >>> 31;
        // diff = 0 时同号，diff = 1 时异号
        int diff = aSign ^ bSign;
        // 在异号，即 diff = 1 时，使之前算出的 k 无效，只考虑两个数字的正负关系
        k = k & (diff ^ 1) | bSign & diff;
        return a * k + b * (k ^ 1);

        //作者：1ujin

    }
}
