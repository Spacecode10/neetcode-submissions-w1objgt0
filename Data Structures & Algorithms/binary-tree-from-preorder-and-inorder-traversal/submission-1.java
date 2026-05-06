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
        if (preorder.length == 0 || inorder.length == 0) {
            return null;
        }
        int rootVal = preorder[0];
        int index = -1;
        for (int i = 0; i < inorder.length; i++) {
            if (rootVal == inorder[i]) {
                index = i;
                break;
            }
        }
        int[] leftPreorder = Arrays.copyOfRange(preorder, 1, index + 1);
        int[] leftinorder = Arrays.copyOfRange(inorder, 0, index);

        int[] rightPreorder = Arrays.copyOfRange(preorder, index+1, preorder.length);
        int[] rightinorder = Arrays.copyOfRange(inorder, index + 1, inorder.length);

        TreeNode root = new TreeNode(rootVal);
        root.left = buildTree(leftPreorder, leftinorder);
        root.right = buildTree(rightPreorder, rightinorder);
        return root;
    }
}
