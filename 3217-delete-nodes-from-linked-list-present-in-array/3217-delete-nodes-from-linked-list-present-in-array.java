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
    public ListNode modifiedList(int[] nums, ListNode head) {
       HashSet<Integer> set=new HashSet<>();
       for(int num:nums){
        set.add(num);
       }
       ListNode temp=head;
       ListNode prev=null;
        while(temp!=null){
            if(prev==null){
                if(set.contains(head.val)){
                head=head.next;
                temp=head;
                prev=null;
                continue;
                }
               
            }
            else{
                if(set.contains(temp.val)){
                    prev.next=temp.next;
                    temp=prev.next;
                    continue;
                }

            }
            prev=temp;
            temp=temp.next;

            
        }
        return head;
       
    }
}