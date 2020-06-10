/**
 * 给定一个单词列表，只返回可以使用在键盘同一行的字母打印出来的单词。
 * https://leetcode-cn.com/problems/keyboard-row/
 */
package easy;

import java.util.ArrayList;
import java.util.List;

public class FindWords {
    public static String[] findWords(String[] words) {
        String line1 = "qwertyuiopQWERTYUIOP";
        String line2 = "asdfghjklASDFGHJKL";
        String line3 = "zxcvbnmZXCVBNM";
        List<String> list = new ArrayList<>();
        for (String str:words) {
            boolean flag = true;
            if (line1.contains(String.valueOf(str.charAt(0)))){
                for (int i = 1; i < str.length(); i++) {
                    if (!line1.contains(String.valueOf(str.charAt(i)))){
                        flag = false;
                        break;
                    }
                }
                if (flag)
                    list.add(str);
            }else if(line2.contains(String.valueOf(str.charAt(0)))){
                for (int i = 1; i < str.length(); i++) {
                    if (!line2.contains(String.valueOf(str.charAt(i)))){
                        flag = false;
                        break;
                    }
                }
                if (flag)
                    list.add(str);
            }else{
                for (int i = 1; i < str.length(); i++) {
                    if (!line3.contains(String.valueOf(str.charAt(i)))){
                        flag = false;
                        break;
                    }
                }
                if (flag)
                    list.add(str);
            }
        }
        return list.toArray(new String[list.size()]);
    }

    public static void main(String[] args) {
        String [] temp = {"Hello", "Alaska", "Dad", "Peace"};
        String []ans = findWords(temp);
        for (String str:ans) {
            System.out.println(str);
        }
    }
}
