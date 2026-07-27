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
    public int pairSum(ListNode head) {
        ListNode temp=head;
        ListNode fast=head;
        ListNode slow=head;
        ListNode prev=null;
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            
            fast=fast.next.next;
        }
        ListNode prev1=null;
        ListNode curr=slow;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev1;
            prev1=curr;
            curr=next;
            
        }
        if(prev!=null){
            prev.next=prev1;
        }
        ListNode left=head;
        ListNode right=prev.next;
        int max=Integer.MIN_VALUE;
        while(right!=null){
            int sum=0;
            sum=left.val+right.val;
            max=Math.max(max,sum);
            left=left.next;
            right=right.next;

        }
        return max;


        
        
    }
}