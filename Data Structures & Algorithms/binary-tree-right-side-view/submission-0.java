class Solution {
    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> res = new ArrayList<>();

        if (root == null) return res;

        Deque<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {

            int size = q.size();

            // rightmost node of current level
            res.add(q.getLast().val);

            for (int i = size; i > 0; i--) {

                TreeNode node = q.poll();

                if (node.left != null) {
                    q.add(node.left);
                }

                if (node.right != null) {
                    q.add(node.right);
                }
            }
        }

        return res;
    }
}