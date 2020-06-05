package easy;

public class GetDecimalValue {
    String a;
    public int getDecimalValue(ListNode head) {
        a = a + head.val;
        if (head.next==null){
            return Integer.parseInt(a,2);
        }
        return getDecimalValue(head.next);
    }
    public int getDecimalValue2(ListNode head) {
        int decimal = 0;
        while(head != null){
            decimal = decimal * 2 + head.val;
            head = head.next;
        }
        return decimal;
        //作者：111-101
        //链接：https://leetcode-cn.com/problems/convert-binary-number-in-a-linked-list-to-integer/solution/er-jin-zhi-lian-biao-zhuan-zheng-shu-by-111-101/
    }
}
