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
    public boolean dfs(TreeNode root, int target, int sum)
    {
        if(root == null)
        {
            return false;
        }
        if(root.right == null && root.left == null)
        {
            if(sum == target)
            {
                return true;
            }
            return false;
        }
        boolean left = false;
        boolean right = false;

        if(root.left != null)
        {
            left = dfs(root.left,target,sum + root.left.val);
        }
        if(root.right != null)
        {
            right = dfs(root.right,target,sum + root.right.val);
        }
        return left || right;
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null)
        {
            return false;
        }
        return dfs(root,targetSum,root.val);
    }
}