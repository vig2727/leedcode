/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fa = head;
        ListNode so = head;
        while(fa!=null && fa.next!=null){
            fa=fa.next.next;
            so=so.next;
            if(fa==so){
                return true;
            }
        }
        return false;
        
    }
}