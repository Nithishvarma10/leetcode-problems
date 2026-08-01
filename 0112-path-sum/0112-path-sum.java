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
    public boolean path(TreeNode root,int sum,int tar){
        if(root==null){
            return false;
        }
        sum+=root.val;
        if(root.left==null && root.right==null){
            return sum==tar;
        }
        return path(root.left,sum,tar) || path(root.right,sum,tar);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return path(root,0,targetSum);
        
    }
}