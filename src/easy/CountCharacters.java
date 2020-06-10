/**
 *
 给你一份『词汇表』（字符串数组） words 和一张『字母表』（字符串） chars。
 假如你可以用 chars 中的『字母』（字符）拼写出 words 中的某个『单词』（字符串），那么我们就认为你掌握了这个单词。
 注意：每次拼写（指拼写词汇表中的一个单词）时，chars 中的每个字母都只能用一次。
 返回词汇表 words 中你掌握的所有单词的 长度之和。
 https://leetcode-cn.com/problems/find-words-that-can-be-formed-by-characters/
 */
package easy;

import java.util.Arrays;

public class CountCharacters {
    public static int countCharacters(String[] words, String chars) {
        int [] nums = new int[26];
        int ans = 0;
        for (int i = 0; i < chars.length(); i++) {
            nums[chars.charAt(i)-'a']++;
        }
        for (int i = 0; i < words.length; i++) {
            int []all = nums.clone();
            boolean flag = true;
            for (int j = 0; j < words[i].length(); j++) {
                all[words[i].charAt(j)-'a']--;
                if (all[words[i].charAt(j)-'a']<0){
                    flag = false;
                    break;
                }
            }
            if (flag)
                ans = ans + words[i].length();
        }
        return ans;
    }

    public static void main(String[] args) {
        String [] words = {"hello","world","leetcode"};
        String chars = "welldonehoneyr";
        System.out.println(countCharacters(words,chars));
    }
}
