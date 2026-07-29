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
    public ListNode reverseList(ListNode head) {
        ListNode he = head;
        ListNode pr = null;
        ListNode prpr = null;
       while(he !=null){
        pr = he;
        he = he.next;
        pr.next = prpr;
        prpr = pr;

       }
       return prpr;
    }
}