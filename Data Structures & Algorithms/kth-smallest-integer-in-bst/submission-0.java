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
     public static ArrayList<Integer> sortedArray(TreeNode root, ArrayList<Integer> arr) {
        if (root == null) {
            return arr;
        }
        sortedArray(root.left, arr);
        arr.add(root.val);
        sortedArray(root.right, arr);
        return arr;
    }
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> arr = sortedArray(root, new ArrayList<Integer>());
        return arr.get(k-1);
    }
}
