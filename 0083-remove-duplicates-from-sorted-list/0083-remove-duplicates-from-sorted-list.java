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
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode he = head;
        if(he==null || he.next==null ){
            return head;
        }
        while(he.next!=null){
            if(he.val==he.next.val){
                he.next=he.next.next;

            }
            else{
                he=he.next;
            }


        }
        return head;

        
    }
}