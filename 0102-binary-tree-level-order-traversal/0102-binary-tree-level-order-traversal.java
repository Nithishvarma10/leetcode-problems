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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        Queue<TreeNode> pq=new LinkedList<>();
        pq.offer(root);
        while(!pq.isEmpty()){
            int size=pq.size();
            List<Integer> ls=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode node=pq.poll();
                ls.add(node.val);
                if(node.left!=null){
                    pq.offer(node.left);

                }
                if(node.right!=null){
                    pq.offer(node.right);
                }
                
            }
            ans.add(ls);
        }
        return ans;
    }
}