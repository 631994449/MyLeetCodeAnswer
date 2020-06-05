/**
 * 给你一个字符串 s，它由数字（'0' - '9'）和 '#' 组成。我们希望按下述规则将 s 映射为一些小写英文字符：
 *
 * 字符（'a' - 'i'）分别用（'1' - '9'）表示。
 * 字符（'j' - 'z'）分别用（'10#' - '26#'）表示。 
 * 返回映射之后形成的新字符串。
 *
 * 题目数据保证映射始终唯一。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/decrypt-string-from-alphabet-to-integer-mapping
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
package easy;

public class FreqAlphabets {
    public static String freqAlphabets(String s) {
        String []temp = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        String ans = "";
        for (int i = s.length()-1; i>=0 ; i--) {
            if (s.charAt(i)=='#'){
                int a = Integer.parseInt(""+s.charAt(i-2)+""+s.charAt(i-1));
                ans = temp[a-1] + ans;
                i=i-2;
            }else{
                ans = temp[Integer.parseInt(""+s.charAt(i))-1]+ans;
            }
        }
        return ans;
    }
    public static String freqAlphabets222(String s) {
        /**
         作者：user8300R
         链接：https://leetcode-cn.com/problems/decrypt-string-from-alphabet-to-integer-mapping/solution/bian-li-zi-fu-chuan-qiu-jie-by-user8300r/
         */
        /**
         * 值得学习的地方:
         * 1.char->int的方式:用char-'0'返回的int
         * 2.使用了StringBuilder而不是占内存的String
         */
        char[] alphabetChars = new char[27];
        for (int i = 1; i < alphabetChars.length; i++) {
            alphabetChars[i] = (char) (96 + i);
        }
        StringBuilder builder = new StringBuilder();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i < chars.length - 2 && chars[i + 2] == '#') {
                builder.append(alphabetChars[(chars[i] - '0') * 10 + (chars[i + 1] - '0')]);
                i += 2;
            } else {
                builder.append(alphabetChars[chars[i] - '0']);
            }
        }
        return builder.toString();

    }

    public static void main(String[] args) {
        System.out.println(freqAlphabets(""));
    }
}
