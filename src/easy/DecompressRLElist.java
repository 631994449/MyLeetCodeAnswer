package easy; /**
 * 给你一个以行程长度编码压缩的整数列表 nums 。
 * 考虑每对相邻的两个元素 [freq, val] = [nums[2*i], nums[2*i+1]] （其中 i >= 0 ），
 * 每一对都表示解压后子列表中有 freq 个值为 val 的元素，你需要从左到右连接所有子列表以生成解压后的列表。
 * 请你返回解压后的列表。
 * 链接：https://leetcode-cn.com/problems/decompress-run-length-encoded-list
 */


public class DecompressRLElist {
    public int[] decompressRLElist(int[] nums) {
        int length = 0;
        for(int i=0;i<nums.length/2;i++){
            length = length + nums[i*2];
        }
        int []ans = new int[length];
        int num = 0;
        for (int i =0;i<nums.length/2;i++) {
            for (int j = 0; j < nums[i * 2]; j++) {
                System.out.println(ans[num]);
                ans[num]=nums[i*2+1];
                num++;
            }
        }
        return ans;
    }
}
