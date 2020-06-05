/**
 * 给定一个二进制矩阵 A，我们想先水平翻转图像，然后反转图像并返回结果。
 *
 * 水平翻转图片就是将图片的每一行都进行翻转，即逆序。例如，水平翻转 [1, 1, 0] 的结果是 [0, 1, 1]。
 *
 * 反转图片的意思是图片中的 0 全部被 1 替换， 1 全部被 0 替换。例如，反转 [0, 1, 1] 的结果是 [1, 0, 0]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/flipping-an-image
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
package easy;

public class FlipAndInvertImage {
    public int[][] flipAndInvertImage(int[][] A) {
        if(A.length ==0){
            return new int[0][0];
        }
        int [][] ans= new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                ans[i][j] = 1-A[i][A[0].length-1-j];
            }
        }
        return ans;
    }
    public static int[][] flipAndInvertImageFix(int[][] A) {
        //使用更少的内存空间,看完题解后想出
        if(A.length ==0){
            return new int[0][0];
        }
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < (A[0].length+1)/2; j++) {
                int temp = A[i][A[0].length-1-j];
                A[i][A[0].length-1-j] = 1-A[i][j];
                A[i][j] = 1-temp;
            }
        }
        return A;
    }

    public static void main(String[] args) {
        int [][]a = {{1,1,0},{1,0,1},{0,0,0}};
        int [][]ans = flipAndInvertImageFix(a);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }
    }
}
