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
    public Boolean rooter(TreeNode root,TreeNode subroot){
        if(root==null ){
            return false;
        }
        if(root.val==subroot.val){
            if(same(root,subroot)){
                return true;
            }
        }
          return rooter(root.left,subroot) || rooter(root.right,subroot);
    }
    public boolean same(TreeNode root, TreeNode subroot){
        if(root==null && subroot==null){
            return true;
        }
        if(root==null || subroot==null){
            return false;
        }
        if(root.val!=subroot.val){
            return false;
        }
        return same(root.left,subroot.left) && same(root.right,subroot.right);
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
     if(subRoot==null){
        return true;

     }
     if(root==null){
        return false;
     }
     return rooter(root,subRoot);
    }
}