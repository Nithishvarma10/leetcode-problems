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
    public ListNode reverse(ListNode head){
        ListNode curr1=head;
        ListNode prev=null;
         while(curr1!=null){
            ListNode next=curr1.next;
            curr1.next=prev;
            prev=curr1;
            curr1=next;

         }
         return prev;
    }
    public ListNode doubleIt(ListNode head) {
        
        ListNode temp=head;
        Stack<Integer> st=new Stack<>();
        while(temp!=null){
            st.push(temp.val);
            temp=temp.next;
        }
          ListNode dummy = new ListNode(-1);

        ListNode curr = dummy;

        int carry = 0;
        while(!st.isEmpty()){
            int sum=carry;
            sum=sum+st.pop()*2;
            curr.next=new ListNode(sum%10);
            carry=sum/10;
            curr=curr.next;

        }
        if(carry!=0){
            curr.next=new ListNode(carry);
        }
        return reverse(dummy.next);


    }
}