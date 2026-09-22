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
    private int depth(TreeNode root)
    {
        if(root == null)
        {
            return 0;
        } 
        return 1 + Math.max(depth(root.left),depth(root.right));
    }
    private boolean isBalancedNode(TreeNode root) {
        if(root == null)
        {
            return true;
        }
        int left = depth(root.left);
        //System.out.print(left);
        int right = depth(root.right);
        //System.out.print(right);
        if(Math.abs(left-right) <= 1)
        {
            return true;
        }
        return false;
    }
    public boolean isBalanced(TreeNode root) {
        if(root == null)
        {
            return true;
        }
        boolean left = isBalanced(root.left);
        boolean tmp = isBalancedNode(root);
        boolean right = isBalanced(root.right);
        return left && tmp && right;
    }
}
