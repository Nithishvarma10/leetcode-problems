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
    public ListNode removeNodes(ListNode head) {
      
        Stack<Integer> st=new Stack<>();
        
        ListNode temp=head;
        while(temp!=null){
            while(!st.isEmpty() && st.peek()<temp.val){
                st.pop();
            }

            
            st.push(temp.val);
            temp=temp.next;
            
        }
        ListNode dummy=new ListNode(0);
        ListNode curr1=dummy;
        for(int ste:st){
            curr1.next=new ListNode(ste);
            curr1=curr1.next;
        }
        curr1.next=null;
        return dummy.next;
    }
}