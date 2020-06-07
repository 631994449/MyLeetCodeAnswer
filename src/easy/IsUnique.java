/**
 * 实现一个算法，确定一个字符串 s 的所有字符是否全都不同。
 * https://leetcode-cn.com/problems/is-unique-lcci/
 */
package easy;

public class IsUnique {
    public static boolean isUnique(String astr) {
        int[] chars = new int[26];
        for (int i = 0; i < astr.length(); i++) {
            if (chars[astr.charAt(i)-'a']>=1){
                return false;
            }
            chars[astr.charAt(i)-'a']++;
        }
        return true;
    }

    public static boolean isUnique2(String astr) {
        //不使用额外的数据结构
        for (char ch: astr.toCharArray()){
            if (astr.indexOf(ch) != astr.lastIndexOf(ch)) {
                return false;
            }
        }
        return true;
        //作者：JessieJ
        //链接：https://leetcode-cn.com/problems/is-unique-lcci/solution/bu-yong-e-wai-shu-ju-jie-gou-indexofpan-duan-shuan/
    }

    public static void main(String[] args) {

    }
}
