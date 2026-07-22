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
    
    public static int sums(TreeNode root,int low,int high){
          if(root==null){
            return 0;
          }
    int ans=0;
          if(root.val>=low && root.val<=high){
          ans+=root.val;
          }
          ans+=sums(root.left,low,high);
          ans+=sums(root.right,low,high);
          return ans;
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
      
        return sums(root,low,high);
    }
}