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
    public int deepestLeavesSum(TreeNode root) {
        if(root==null){
            return 0;
        }
        Queue<TreeNode> pq=new LinkedList<>();
        List<List<Integer>> ls=new ArrayList<>();
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
            ls.add(arr);
        }
        int sum=0;
        int j=ls.size()-1;
        for(int i=0;i<ls.get(j).size();i++){
            sum+=ls.get(j).get(i);
        }
        return sum;
    }
}