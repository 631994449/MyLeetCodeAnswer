/**
 *
 在一个 8 x 8 的棋盘上，有一个白色的车（Rook），用字符 'R' 表示。棋盘上还可能存在空方块，白色的象（Bishop）以及黑色的卒（pawn），分别用字符 '.'，'B' 和 'p' 表示。不难看出，大写字符表示的是白棋，小写字符表示的是黑棋。

 车按国际象棋中的规则移动。东，西，南，北四个基本方向任选其一，然后一直向选定的方向移动，直到满足下列四个条件之一：

 棋手选择主动停下来。
 棋子因到达棋盘的边缘而停下。
 棋子移动到某一方格来捕获位于该方格上敌方（黑色）的卒，停在该方格内。
 车不能进入/越过已经放有其他友方棋子（白色的象）的方格，停在友方棋子前。
 你现在可以控制车移动一次，请你统计有多少敌方的卒处于你的捕获范围内（即，可以被一步捕获的棋子数）。
 */
package easy;

import java.beans.Expression;

public class NumRookCaptures {
    public static int numRookCaptures(char[][] board) {
        int[]dx = {-1,1,0,0};
        int[]dy = {0,0,-1,1};
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[1].length; j++) {
                if (board[i][j]=='R'){
                    int ans = 0;

                    for (int k = 0; k < 4; k++) {
                        int x=i;
                        int y=j;
                        while (true) {
                            x += dx[k];
                            y += dy[k];
                            if (x < 0 || x >= 8 || y < 0 || y >= 8 || board[x][y] == 'B') {
                                break;
                            }
                            if (board[x][y] == 'p') {
                                ans++;
                                break;
                            }
                        }
                    }
                    return ans;
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        char[][] board = {
                {'.','.','.','.','.','.','.','.'},
                {'.','p','p','p','p','p','.','.'},
                {'.','p','p','B','p','p','.','.'},
                {'.','p','B','R','B','p','.','.'},
                {'.','p','p','B','p','p','.','.'},
                {'.','p','p','p','p','p','.','.'},
                {'.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.'}};
        int res = numRookCaptures(board);
        System.out.println(res);
    }
}
