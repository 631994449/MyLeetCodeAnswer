package easy; /**
 * 给你一个数组 candies 和一个整数 extraCandies ，其中 candies[i] 代表第 i 个孩子拥有的糖果数目。
 * 对每一个孩子，检查是否存在一种方案，将额外的 extraCandies 个糖果分配给孩子们之后，此孩子有 最多 的糖果。注意，允许有多个孩子同时拥有 最多 的糖果数目。
 * 链接：https://leetcode-cn.com/problems/kids-with-the-greatest-number-of-candies
 */


import java.util.ArrayList;
import java.util.List;

public class Candies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> isMost = new ArrayList<>();
        int max = 0;
        for(int i = 1;i<candies.length;i++){
            //找出拥有最多糖果的
            if (candies[i]>candies[max]){
                max = i;
            }
        }
        for (int i = 0;i<candies.length;i++){
            if (candies[max]-candies[i]<=extraCandies){
                isMost.add(true);
            }else {
                isMost.add(false);
            }
        }
        return isMost;
    }
}
