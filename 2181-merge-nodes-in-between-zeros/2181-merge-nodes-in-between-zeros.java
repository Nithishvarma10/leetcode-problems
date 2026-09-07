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
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy=new ListNode(0);
         dummy=head;
        ListNode fast=head;
        ListNode slow=head;
        ListNode curr=dummy;
        while(slow!=null && slow.val!=0){
            slow=slow.next;
        }
       if(fast.val==0){
        fast=fast.next;
       }
        
        while(fast!=null && fast.next!=null){
            int sum=0;
            while( fast!=null && fast.val!=0 ){
                sum+=fast.val;
                fast=fast.next;
            }
            slow=fast;
            fast=slow.next;
            curr.next=new ListNode(sum);

            curr=curr.next;



            
        }

        return dummy.next;

    }
}