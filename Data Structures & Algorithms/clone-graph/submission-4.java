class Solution {
    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }

        Queue<Node> q = new LinkedList<>();
        Map<Node, Node> map = new HashMap<>();

        // Clone the first node
        map.put(node, new Node(node.val));
        q.add(node);

        while (!q.isEmpty()) {
            Node current = q.poll();

            for (Node neighbor : current.neighbors) {

                // If neighbor hasn't been cloned yet
                if (!map.containsKey(neighbor)) {
                    map.put(neighbor, new Node(neighbor.val));
                    q.add(neighbor);
                }

                // Connect cloned current -> cloned neighbor
                map.get(current).neighbors.add(map.get(neighbor));
            }
        }

        return map.get(node);
    }
}