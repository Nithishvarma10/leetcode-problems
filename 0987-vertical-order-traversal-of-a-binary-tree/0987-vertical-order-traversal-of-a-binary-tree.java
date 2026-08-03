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
    List<int[]> ans=new ArrayList<>();
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        dfs(root,0,0);
        Collections.sort(ans,(a,b)->{
            if(a[0]!=b[0]){
                return a[0]-b[0];
            }
            if(a[1]!=b[1]){
                return a[1]-b[1];
            }
            return a[2]-b[2];
        });
        int prev=Integer.MIN_VALUE;
        List<List<Integer>> res=new ArrayList<>();
        for(int[] node: ans){
            if(prev!=node[0]){
                res.add(new ArrayList<>());
                prev=node[0];
            }
            res.get(res.size()-1).add(node[2]);
        }
        return res;
        
    }
    public void dfs(TreeNode root,int level,int col){
        if(root==null){
            return ;
        }
        ans.add(new int[]{col,level,root.val});
        dfs(root.left,level+1,col-1);
        dfs(root.right,level+1,col+1);
    }
}