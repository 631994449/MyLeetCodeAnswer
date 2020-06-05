package easy; /**
 * 在一个「平衡字符串」中，'L' 和 'R' 字符的数量是相同的。
 *
 * 给出一个平衡字符串 s，请你将它分割成尽可能多的平衡字符串。
 *
 * 返回可以通过分割得到的平衡字符串的最大数量。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/split-a-string-in-balanced-strings
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class BalancedStringSplit {
    public static int balancedStringSplit(String s) {
        int ans = 0;
        int numsOfR = 0;
        int numsOfL = 0;
        for (int i = 0; i < s.length(); i++) {
            if ('R'== s.charAt(i))
                numsOfR++;
            else
                numsOfL++;

            if (numsOfL==numsOfR){
                ans++;
            }
        }
        return ans;
//        更好的解决方法:
        //利用一个变量num记录'L'('R')的数量，遍历字符串s，如果字符为'L'('R')，则num++，否则num--
        //
        //当num为0时，之前出现的'L'和'R'的数量必定相等，此时将记录子串数量的res++，遍历完后返回res即可
        //
        //作者：kurna
        //著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
//        int num = 0;
//        int res = 0;
//        for(int i=0;i<s.length();i++){
//            if(s.charAt(i) == 'L')
//                num++;
//            else
//                num--;
//            if(num == 0)
//                res++;
//        }
//        return res;
    }
    public static void main(String[] args) {
//        int i = 0;
//        for (; i < 5; i++) {
//            System.out.println(i);
//        }
//        System.out.println(i);
        System.out.println(balancedStringSplit("RRRLLRLL"));

    }
    //因为曲解题目意思而写出的算法:
    public static int wrongTitle(String s) {
        char c = s.charAt(0);
        int ans = 0;
        int count=1;
        for (int i = 1; i < s.length(); i++) {
            if (c==s.charAt(i)){
                count++;
            }else{
                ans++;
                if (i+count>=s.length()){
                    break;
                }
                c = s.charAt(i+count);
                i = i + count ;
                count = 1;
            }
        }
        return ans;
    }
}
