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
    class pair{
        TreeNode node;
        long index;
        pair(TreeNode node,long index){
            this.node=node;
            this.index=index;
        }

    }
    public int widthOfBinaryTree(TreeNode root) {
        Queue<pair> pq=new LinkedList<>();
        pq.offer(new pair(root,0));
        int max=0;
        while(!pq.isEmpty()){
            int size=pq.size();
            long first=pq.peek().index;
            long last=first;
            for(int i=0;i<size;i++){
                pair curr=pq.poll();
                 last=curr.index;
                if(curr.node.left!=null){
                    pq.offer(new pair(curr.node.left,2*curr.index));
                }
                if(curr.node.right!=null){
                    pq.offer(new pair(curr.node.right,2*curr.index+1));
                }
            }
            max=Math.max(max,(int)(last-first+1));
        }
        return max;
        
    }
}