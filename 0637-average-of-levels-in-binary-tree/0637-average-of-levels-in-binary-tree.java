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
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> pq=new LinkedList<>();
        List<Double> ans =new ArrayList<>();
        pq.offer(root);
        while(!pq.isEmpty()){
            int size=pq.size();
            double sum=0;
            for(int i=0;i<size;i++){
                TreeNode node=pq.poll();
                sum+=(node.val);
                if(node.left!=null){
                    pq.offer(node.left);
                }if(node.right!=null){
                    pq.offer(node.right);
                }

            }
            ans.add(sum/size);

        }
        return ans;
    }
}