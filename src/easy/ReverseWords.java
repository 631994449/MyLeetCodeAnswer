/**
 * 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
 *
 * 示例 1:
 *
 * 输入: "Let's take LeetCode contest"
 * 输出: "s'teL ekat edoCteeL tsetnoc" 
 * 注意：在字符串中，每个单词由单个空格分隔，并且字符串中不会有任何额外的空格。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-words-in-a-string-iii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
package easy;

public class ReverseWords {
    public static String reverseWords(String s) {
        String[]words = s.split(" ");
        StringBuffer ans = new StringBuffer();
        for (int i = 0; i < words.length; i++) {
            StringBuffer str = new StringBuffer(words[i]);
            for (int j = 0; j < str.length()/2; j++) {
                char txt = str.charAt(j);
                str.setCharAt(j,str.charAt(str.length()-1-j));
                str.setCharAt(str.length()-j-1,txt);
            }
            ans.append(str+" ");
        }
        ans.deleteCharAt(ans.length()-1);
        return ans.toString();
        /**
         * String words[] = s.split(" ");
         *         StringBuilder res=new StringBuilder();
         *         for (String word: words)
         *             res.append(new StringBuffer(word).reverse().toString() + " ");
         *         return res.toString().trim();
         *
         * 作者：LeetCode
         * 链接：https://leetcode-cn.com/problems/reverse-words-in-a-string-iii/solution/fan-zhuan-zi-fu-chuan-zhong-de-dan-ci-iii-by-leetc/
         * 来源：力扣（LeetCode）
         * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
         */
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }
}
