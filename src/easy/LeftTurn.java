package easy;

import java.util.Scanner;

/**
 * 字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。请定义一个函数实现字符串左旋转操作的功能。
 * 比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。
 * 链接：https://leetcode-cn.com/problems/zuo-xuan-zhuan-zi-fu-chuan-lcof
 */
public class LeftTurn {
    /**
     * 个人理解，用时过久
     * @param s
     * @param n
     * @return
     */
    public static String reverseLeftWords(String s, int n) {
        StringBuffer str = new StringBuffer(s);
        StringBuffer str2 = str.delete(n,s.length());
        System.out.println(str2.toString());
        str = new StringBuffer(s);
        str.delete(0,n);
        System.out.println(str);
        return str.insert(str.length(),str2).toString();
    }
    public static void main(String arg[]){
        Scanner sc =  new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();
        System.out.println(reverseLeftWords(s,n));
    }
    /**
     * 官解
     */
    public String reverseLeftWords2(String s, int n) {
        StringBuilder res = new StringBuilder();
        for(int i = n; i < n + s.length(); i++)
            res.append(s.charAt(i % s.length()));
        return res.toString();
    }

}
