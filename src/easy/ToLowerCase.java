package easy; /**
 * 实现函数 easy.ToLowerCase()，该函数接收一个字符串参数 str，并将该字符串中的大写字母转换成小写字母，之后返回新的字符串。
 * https://leetcode-cn.com/problems/to-lower-case/
 */

public class ToLowerCase {
    public String toLowerCase(String str) {
        StringBuilder s = new StringBuilder(str);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)>='A'&&s.charAt(i)<='Z'){
                s.setCharAt(i,(char)(s.charAt(i)+32));
            }
        }
        return s.toString();
    }
}
