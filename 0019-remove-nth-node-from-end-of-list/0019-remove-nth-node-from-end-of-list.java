class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        // Find the length of the linked list
        ListNode current = head;
        int count = 0;

        while (current != null) {
            count++;
            current = current.next;
        }

        // If the first node has to be removed
        if (count == n) {
            return head.next;
        }

        // Move to the node before the one to be deleted
        current = head;
        for (int i = 1; i < count - n; i++) {
            current = current.next;
        }

        // Delete the nth node from the end
        current.next = current.next.next;

        return head;
    }
}