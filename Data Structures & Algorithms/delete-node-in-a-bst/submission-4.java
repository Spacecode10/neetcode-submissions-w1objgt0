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
    private int findMin(TreeNode node)
    {
        while(node.left != null)
        {
            node = node.left;
        }
        return node.val;

    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null)
        {
            return root;
        }
        else if(root.val == key)
        {
            if(root.right != null && root.left != null)
            {
                int min = findMin(root.right);
                root.val = min;
               root.right = deleteNode(root.right, root.val);
            }
            else if(root.right != null)
            {
                return root.right;
            }
            else
            {
                return root.left;
            }
        }
        else if(root.val > key)
        {
           root.left = deleteNode(root.left,key);
        }
        else
        {
            root.right = deleteNode(root.right, key);
        }
        return root;

    }
}