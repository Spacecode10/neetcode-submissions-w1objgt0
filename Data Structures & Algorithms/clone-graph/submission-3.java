/*
Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node == null)
        {
            return null;
        }
        if(node.neighbors == null || node.neighbors.isEmpty())
        {
            return new Node(node.val);
        }
        Queue<Node> q = new ArrayDeque<>();
        HashMap<Node,Node> map = new HashMap<>();
        Node root = new Node(node.val);
        q.add(node);
        //old -> new
        map.put(node,root);
        while(!q.isEmpty())
        {
            for(int i = 0; i < q.size(); i++)
            {
                Node curr = q.poll();
                for(Node nNode : curr.neighbors)
                {
                    
                    if(!map.containsKey(nNode))
                    {
                        Node temp = new Node(nNode.val);
                        map.put(nNode,temp);   
                        q.add(nNode);
                    }
                    map.get(curr).neighbors.add(map.get(nNode));
                }
            }
        }
        return root;
    }
}