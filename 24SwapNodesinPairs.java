/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null)
            return head;
        ListNode helper=new ListNode(0);
        helper.next=head;
        ListNode p=helper;
        while(p.next!=null&&p.next.next!=null)
        {
            ListNode t1=p;
            p=p.next;
            t1.next=p.next;
            
            ListNode t2=p.next.next;
            p.next.next=p;
            p.next=t2;
        }
        return helper.next;
    }
}