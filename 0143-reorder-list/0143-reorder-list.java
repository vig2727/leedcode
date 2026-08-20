/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode second = slow.next;
        slow.next= null;
        ListNode pre = null;

        while(second!=null){
            ListNode nextnode = second.next;
            second.next = pre;
            pre = second ;
            second = nextnode;
        }
        ListNode first = head;
        ListNode secnd = pre;

        while(secnd!= null){
            ListNode Temp1 = first.next;
            ListNode Temp2 = secnd.next;

            first.next = secnd;
            secnd.next = Temp1;

            first = Temp1;
            secnd = Temp2;
        }
        System.out.print(head);
        
    }
}