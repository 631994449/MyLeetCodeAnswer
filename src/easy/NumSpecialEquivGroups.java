/**
 *你将得到一个字符串数组 A。
 如果经过任意次数的移动，S == T，那么两个字符串 S 和 T 是特殊等价的。
 一次移动包括选择两个索引 i 和 j，且 i ％ 2 == j ％ 2，交换 S[j] 和 S [i]。
 现在规定，A 中的特殊等价字符串组是 A 的非空子集 S，这样不在 S 中的任何字符串与 S 中的任何字符串都不是特殊等价的。
 返回 A 中特殊等价字符串组的数量。
 *
 */
package easy;

import java.util.*;

public class NumSpecialEquivGroups {
    public int numSpecialEquivGroups(String[] A) {
        Set<String> set = new HashSet<>();
        for (String s : A) {
            char[] chars = s.toCharArray();
            List<Character> odd = new ArrayList<>();
            List<Character> even = new ArrayList<>();
            for (int i = 0; i < chars.length; i++) {
                if (i % 2 != 0) {
                    odd.add(chars[i]);
                } else {
                    even.add(chars[i]);
                }
            }
            Collections.sort(odd);
            Collections.sort(even);
            StringBuilder builder = new StringBuilder();
            for (Character c : odd) builder.append(c);
            for (Character c : even) builder.append(c);
            set.add(builder.toString());
        }
        return set.size();
    }
}
