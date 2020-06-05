package easy; /**
 * 两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。
 *https://leetcode-cn.com/problems/hamming-distance/
 * 给出两个整数 x 和 y，计算它们之间的汉明距离。
 */

public class HammingDistance {
    public int hammingDistance(int x, int y) {
        if (x==y)
            return 0;
        int max = Math.max(x,y);
        x = Math.min(x,y);
        int ans=0;
        while (max!=0){
            if(max%2!=x%2)
                ans++;
            max = max/2;
            x = x/2;
        }
        return ans;
    }
}
