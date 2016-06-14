public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p=headA;
        ListNode q=headB;
        int Alen=0,Blen=0;
        while(p!=null){ Alen++;p=p.next;}
        while(q!=null){ Blen++;q=q.next;}
        p=headA;
        q=headB;
        int n=0;
        if(Alen<=Blen){
            n=Blen-Alen;
            while(n>0)
            {
                q=q.next;n--;
            }
        }else
        {
            n=Alen-Blen;
            while(n>0)
            {
                p=p.next;n--;
            }
        }
        while(p!=q){
            p=p.next;
            q=q.next;
        }
        return p;
    }
}