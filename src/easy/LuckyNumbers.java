/**
 * 给你一个 m * n 的矩阵，矩阵中的数字 各不相同 。请你按 任意 顺序返回矩阵中的所有幸运数。
 *
 * 幸运数是指矩阵中满足同时下列两个条件的元素：
 *
 * 在同一行的所有元素中最小
 * 在同一列的所有元素中最大
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/lucky-numbers-in-a-matrix
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
package easy;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumbers {
    public static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
        int min = 0;
        for (int j = 1; j < matrix[i].length; j++) {
            if (matrix[i][j]<matrix[i][min])
                min = j;
        }
        int max = matrix[i][min];
        for (int j = 0; j < matrix.length; j++) {
            if (matrix[j][min]>max){
                max =  matrix[j][min];
                break;
            }
        }
        if (max == matrix[i][min])
            ans.add(max);
    }
        return ans;
}

    public static void main(String[] args) {
        int[][] matrix = {{1,10,4,2},{9,3,8,7},{15,16,17,12}};
        for (int x:luckyNumbers(matrix)
             ) {
            System.out.println(x);
        }
    }
}
