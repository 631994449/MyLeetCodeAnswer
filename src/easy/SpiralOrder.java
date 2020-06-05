package easy;

public class SpiralOrder {
    public static int[] spiralOrder(int[][] matrix) {
        if (matrix.length==0)
            return new int[0];
        int x = matrix.length-1;
        int y = matrix[0].length-1;
        int startRow = 0;
        int startCol = 0;
        int []ans = new int[(x+1)*(y+1)];
        int count = 0;
        while (startRow<x&&startCol<y){
            for(int i = startCol;i<=y-1;i++){//第startRow行
                ans[count] = matrix[startRow][i];
                count++;
            }
            for (int i = startRow; i <=x-1; i++) {
                ans[count] = matrix[i][y];
                count++;
            }
            for (int i = y; i >= startCol+1; i--) {
                ans[count] = matrix[x][i];
                count++;
            }
            for (int i = x; i >= startRow+1; i--) {
                ans[count] = matrix[i][startCol];
                count++;
            }
            x--;
            y--;
            startCol++;
            startRow++;
        }//处理未进入数组部分
        if (startRow==x){
            for (int i = startCol; i <=y ; i++) {
                ans[count] = matrix[x][i];
                count++;
            }
        }
        if (startCol==y&&startRow<x){
            for (int i = startRow; i <=x ; i++) {
                ans[count] = matrix[i][y];
                count++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int [][]a = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int []ans = spiralOrder(a);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}
