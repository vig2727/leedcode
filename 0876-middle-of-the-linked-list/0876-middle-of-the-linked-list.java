
class Solution {
    public ListNode middleNode(ListNode head) {
        
        ListNode fast= head;
        ListNode slow = head;
        int n = 0;
        while(fast != null && slow !=null){
            if(fast == null){
                System.out.print(slow);
                slow=slow.next;
            }
            else{
                fast=fast.next;
                n=n+1;
                if(n==2){
                    slow=slow.next;
                    n=0;
                }
            }


        }
        return slow;

    }
}