/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast=head;
        ListNode slow=head;
        if(head==null)
            return head;
        int step=0;
        while(step<n&&fast!=null)
         {
             fast=fast.next;
             step++;
         }
         if(step==n&&fast==null){
             head=head.next;
             return head;
         }
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return head;
    }
}