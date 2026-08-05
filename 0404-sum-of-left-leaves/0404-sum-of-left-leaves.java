/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null){
            return 0;
        }
        
        Queue<TreeNode> pq=new LinkedList<>();
        int sum=0;
        pq.offer(root);
        
        while(!pq.isEmpty()){
            int size=pq.size();
         
                TreeNode node=pq.poll();
             
              if(node.left!=null){
                if(node.left.left==null && node.left.right==null){
                    sum+=node.left.val;
                }
                else{
                pq.offer(node.left);
                }
              }
              if(node.right!=null){
                pq.offer(node.right);
              }



            }
           
        
       
        
        
        return sum;
    }
}