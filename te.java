import java.lang.classfile.components.ClassPrinter.ListNode;

public class te {
    public static void main(){
  System.out.println(".()");


    }
  }

public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
//the test


class Solution {
  public ListNode swapPairs(ListNode head) {              //medium two_exchange 
      
    ListNode dummyhead=new ListNode(0,head);

if(head==null||head.next==null){return dummyhead.next;}
 ListNode cur=dummyhead;
 while(cur.next!=null&&cur.next.next!=null){
 ListNode node1,node2;
 node1=cur.next;
 node2=cur.next.next;
 cur=node2;
 node1.next=node2.next;
 node2.next=node1;
 cur=cur.next.next;

}

return dummyhead.next;
}
}