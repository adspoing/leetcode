/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode helper=new ListNode(0);
        ListNode head1=l1;
        ListNode head2=l2;
        ListNode tail=helper;
        while(head1!=null&&head2!=null)
        {
            if(head1.val<head2.val){tail.next=head1;head1=head1.next;}
            else                   {tail.next=head2;head2=head2.next;}
            tail=tail.next;
        }
        if(head1==null) tail.next=head2;
        if(head2==null) tail.next=head1;
        return helper.next;
    }
}