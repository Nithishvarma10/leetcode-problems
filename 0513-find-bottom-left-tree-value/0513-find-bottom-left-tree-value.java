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
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> pq=new LinkedList<>();
        int ans=0;
        if(root==null){
            return 0;
        }
        pq.offer(root);
        while(!pq.isEmpty()){
            int n=pq.size();
             
            for(int i=0;i<n;i++){
                TreeNode node=pq.poll();
                if(i==0){
                    ans=node.val;
                }
                if(node.left!=null){
                    pq.offer(node.left);
                }
                if(node.right!=null){
                    pq.offer(node.right);
                }
            }

        }
        return ans;
    }
}