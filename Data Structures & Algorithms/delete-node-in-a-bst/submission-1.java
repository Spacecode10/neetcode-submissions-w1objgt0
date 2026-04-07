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
    private TreeNode remove(TreeNode root, int val)
{
    if(root == null)
    {
        return root;
    }

    if(val < root.val)
    {
        root.left = remove(root.left, val);
    }
    else if(val > root.val)
    {
        root.right = remove(root.right, val);
    }
    else
    {
        if(root.left == null)
        {
            return root.right;
        }
        else if(root.right == null)
        {
            return root.left;
        }

        TreeNode min = minNode(root.right);
        root.val = min.val;
        root.right = remove(root.right, min.val);
    }

    return root;
}
    private TreeNode minNode(TreeNode root)
    {
        if(root == null || root.left == null)
        {
            return root;
        }
        return minNode(root.left);
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null)
        {
            return root;
        }
        if(key == root.val)
        {
            return remove(root, key);
        }
        else if(key < root.val)
        {
            root.left = deleteNode(root.left, key);
        }
        else
        {
           root.right = deleteNode(root.right, key);
        }
        return root;
    }
}