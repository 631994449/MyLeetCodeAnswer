/**
 *
 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。

 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。

 你可以假设数组中的所有字符都是 ASCII 码表中的可打印字符。
 https://leetcode-cn.com/problems/reverse-string/
 */
package easy;

import java.util.Arrays;

public class ReverseString {
    public static void reverseString(char[] s) {
        for (int i = 0; i < s.length/2; i++) {
            char a = s[i];
            s[i] = s[s.length-i-1];
            s[s.length-i-1] = a;
        }
    }

    public static void main(String[] args) {
        char []word = {'a','b','c','d'};
        reverseString(word);
        for (int i = 0; i < word.length; i++) {
            System.out.println(""+word[i]);
        }
    }
}
