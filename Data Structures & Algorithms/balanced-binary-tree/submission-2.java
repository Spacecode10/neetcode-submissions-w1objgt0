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
    public int[] dfs(TreeNode root)
    {
        if(root == null)
        {
            return new int[]{1,0};
        }
        int[] left = dfs(root.left);
        int[] right = dfs(root.right);
        int height = Math.max(left[1],right[1]) + 1;
        if(Math.abs(left[1]-right[1]) > 1)
        {  
            return new int[]{0,height};
        }
        if(left[0] != 1 || right[0] != 1)
        {
            return new int[]{0,height};
        } 
        return new int[]{1,height};
    }
   public boolean isBalanced(TreeNode root) {
        return dfs(root)[0] == 1;
    }
}
