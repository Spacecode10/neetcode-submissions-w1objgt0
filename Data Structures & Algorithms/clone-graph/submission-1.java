class Solution {
    public Node cloneGraph(Node node) {

        if (node == null) {
            return null;
        }

        Queue<Node> q = new ArrayDeque<>();
        Map<Node, Node> map = new HashMap<>();

        // Create clone of starting node
        map.put(node, new Node(node.val));
        q.add(node);

        while (!q.isEmpty()) {

            Node curr = q.poll();
            Node clone = map.get(curr);

            for (Node neighbor : curr.neighbors) {

                // If we haven't cloned this neighbor yet
                if (!map.containsKey(neighbor)) {
                    map.put(neighbor, new Node(neighbor.val));
                    q.add(neighbor);
                }

                // Connect clone of curr to clone of neighbor
                clone.neighbors.add(map.get(neighbor));
            }
        }

        return map.get(node);
    }
}