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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length == 0 || inorder.length == 0)
        {
            return null;
        }
        int rIndex = -1;
        TreeNode root = new TreeNode();
        for(int i = 0; i < inorder.length; i++)
        {
            if(preorder[0] == inorder[i])
            {
                root = new TreeNode(preorder[0]);
                rIndex = i;
                break;
            }
        }
        int[] lInorder = Arrays.copyOfRange(inorder,0,rIndex);
        int[] lPreorder = Arrays.copyOfRange(preorder,1,rIndex+1);
 root.left = buildTree(lPreorder,lInorder);
        int[] rInorder = Arrays.copyOfRange(inorder,rIndex+1,inorder.length);
        int[] rPreorder = Arrays.copyOfRange(preorder,rIndex+1,preorder.length);
       
        root.right = buildTree(rPreorder,rInorder);
        return root;
    }
}
