/**
 * 给定一个正整数，输出它的补数。补数是对该数的二进制表示取反。
 * https://leetcode-cn.com/problems/number-complement/
 */
package easy;

public class FindComplement {
    public int findComplement(int num) {
        String binary = Integer.toBinaryString(num);
        StringBuffer str = new StringBuffer();
        for (int i = 0; i < binary.length(); i++)
            if (binary.charAt(i)=='0')
                str.append(1);
            else
                str.append(0);
        return Integer.parseInt(str.toString(),2);
    }
}
