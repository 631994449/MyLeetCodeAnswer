/**
 * 给定只含 "I"（增大）或 "D"（减小）的字符串 S ，令 N = S.length。
 *
 * 返回 [0, 1, ..., N] 的任意排列 A 使得对于所有 i = 0, ..., N-1，都有：
 *
 * 如果 S[i] == "I"，那么 A[i] < A[i+1]
 * 如果 S[i] == "D"，那么 A[i] > A[i+1]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/di-string-match
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
package easy;

import java.util.LinkedList;

public class DiStringMatch {
    public static int[] diStringMatch(String S) {
        int max = S.length();
        int min = 0;
        int []a = new int[S.length()+1];
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i)=='I'){
                a[i]=min;
                min++;
            }else{
                a[i]=max;
                max--;
            }
        }
        a[S.length()]=max;
        return a;
    }

    public static void main(String[] args) {
        int []a = diStringMatch("IDID");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
