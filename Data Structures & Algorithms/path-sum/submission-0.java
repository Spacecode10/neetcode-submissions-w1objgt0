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
     public boolean backTrack(TreeNode root, int targetSum, int sum) 
     {
        if(targetSum == sum && root.right == null && root.left == null)
        {
            return true;
        }
        if(root.left != null)
        {
            sum = sum + root.left.val;
            if(backTrack(root.left, targetSum, sum))
            {
                return true;
            }
            else
            {
                sum = sum - root.left.val;
            }
        }
        if(root.right != null)
        {
            sum = sum + root.right.val;
            if(backTrack(root.right, targetSum, sum))
            {
                return true;
            }
            else
            {
                sum = sum - root.right.val;
            }
        }
        return false;
     }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null)
        {
            return false;
        }
        return backTrack(root, targetSum, root.val);
    }
}