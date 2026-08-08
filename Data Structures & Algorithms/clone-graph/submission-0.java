class Solution {
    public Node cloneGraph(Node node) {

        if (node == null) {
            return null;
        }

        Queue<Node> q = new LinkedList<>();
        Queue<Node> newQ = new LinkedList<>();

        HashMap<Node, Node> map = new HashMap<>();

        Node root = new Node(node.val);

        q.add(node);
        newQ.add(root);
        map.put(node, root);

        while (!q.isEmpty() && !newQ.isEmpty()) {

            Node curr = q.poll();
            Node newCurr = newQ.poll();

            for (int i = 0; i < curr.neighbors.size(); i++) {

                Node neighbor = curr.neighbors.get(i);

                if (!map.containsKey(neighbor)) {

                    Node temp = new Node(neighbor.val);

                    map.put(neighbor, temp);

                    q.add(neighbor);
                    newQ.add(temp);
                }

                newCurr.neighbors.add(map.get(neighbor));
            }
        }

        return root;
    }
}