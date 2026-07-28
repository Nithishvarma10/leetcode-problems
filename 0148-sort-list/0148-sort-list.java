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
    public ListNode sortList(ListNode head) {
        ListNode dummy=new ListNode(0);
        
        ListNode curr=dummy;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        ListNode temp=head;
        while(temp!=null){
            pq.offer(temp.val);
            temp=temp.next;
        }
        while(!pq.isEmpty()){
            curr.next=new ListNode(pq.poll());
            curr=curr.next;

        }
        return dummy.next;
    }
}