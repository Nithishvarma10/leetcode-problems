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
    List<List<Integer>> ans=new LinkedList<>();
    public void dfs(TreeNode root,int sum,int tar,List<Integer> path){
        if(root==null){
            return ;
        }
        sum+=root.val;
        path.add(root.val);
        if(root.left==null && root.right==null){
            if(sum==tar){
                ans.add(new ArrayList<>(path));
            }
        }
        dfs(root.left,sum,tar,path);
        dfs(root.right,sum,tar,path);
        path.remove(path.size()-1);


    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        dfs(root,0,targetSum,new ArrayList<>());
        return ans;
    }
}