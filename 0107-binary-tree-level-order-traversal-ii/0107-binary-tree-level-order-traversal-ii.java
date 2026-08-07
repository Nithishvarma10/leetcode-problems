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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        Queue<TreeNode> pq=new LinkedList<>();
        if(root==null){
            return res;
        }
        pq.offer(root);
        while(!pq.isEmpty()){
            int n=pq.size();
            List<Integer> arr=new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode node=pq.poll();
                arr.add(node.val);
                if(node.left!=null){
                    pq.offer(node.left);
                }
                if(node.right!=null){
                    pq.offer(node.right);
                }

            }
            res.add(0,arr);
        }
        return res;
    }
}