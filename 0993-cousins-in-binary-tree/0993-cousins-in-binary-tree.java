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
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> pq=new LinkedList<>();
        pq.offer(root);
        while(!pq.isEmpty()){
            int size =pq.size();
            boolean fx=false;
            boolean fy=false;
            for(int i=0;i<size;i++){
                TreeNode node=pq.poll();
                if(node.val==x){
                    fx=true;
                }
                if(node.val==y){
                    fy=true;
                }
                if(node.left!=null && node.right!=null){
                    if((node.left.val==x && node.right.val==y) || (node.left.val==y && node.right.val==x)){
                        return false;
                    }
                }
                if(node.left!=null){
                    pq.offer(node.left);
                }
                if(node.right!=null){
                    pq.offer(node.right);
                }

            }
            if(fx && fy){
                return true;
            }
            if(fx || fy){
                return false;
            }

        }
        return false;
    }
}