package easy;

public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
      public String toString(){
          StringBuffer str = new StringBuffer();
          while (next!=null){
              str.append(""+val+"->");
              this.next = this.next.next;
          }
          return null;
      }
  }
