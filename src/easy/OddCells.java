package easy; /**
 * 给你一个 n 行 m 列的矩阵，最开始的时候，每个单元格中的值都是 0。
 *
 * 另有一个索引数组 indices，indices[i] = [ri, ci] 中的 ri 和 ci 分别表示指定的行和列（从 0 开始编号）。
 *
 * 你需要将每对 [ri, ci] 指定的行和列上的所有单元格的值加 1。
 *
 * 请你在执行完所有 indices 指定的增量操作后，返回矩阵中 「奇数值单元格」 的数目
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/cells-with-odd-values-in-a-matrix
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class OddCells {
    public int oddCells(int n, int m, int[][] indices) {
        //参考了大佬的做法
        //作者：hengzai
        boolean[] r = new boolean[n];
        boolean[] c = new boolean[m];

        for(int i = 0; i < indices.length; i++){
            r[indices[i][0]] = !r[indices[i][0]];
            c[indices[i][1]] = !c[indices[i][1]];
        }

        int rr = 0, cc = 0;
        for(int i = 0; i < r.length; i++){
            if(r[i]) rr++;
        }

        for(int i = 0; i < c.length; i++){
            if(c[i]) cc++;
        }
        return rr * m + cc * n - rr * cc * 2;
    }
}
