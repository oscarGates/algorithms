package graphs;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {}

    public Node(int _val,List<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
};



public class Solution {


    public Node cloneGraph(Node node) {
        Map<Node, Node> storage = new HashMap<>();
        Set<Integer> visited = new HashSet<>();
        LinkedList<Node> queue = new LinkedList<>();
        queue.add(node);
        visited.add(node.val);
        Node result = new Node();
        result.val = node.val;
        storage.put(node, result);

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            if(storage.get(current) == null){
                Node aux = new Node();
                aux.val = current.val;
                storage.put(current, aux);
            }


            for(Node neighbor : current.neighbors){
                if(!visited.contains(neighbor.val)) {
                    queue.add(node);
                    visited.add(node.val);
                }
            }

        }

        for(Node real: storage.keySet()){
            Node clone = storage.get(real);
            for(Node neighbor: real.neighbors){
                clone.neighbors.add(storage.get(neighbor));
            }
        }

        return result;

    }

    public static void main(String args[]){
        Node[] arr = new Node[4];
        arr[0] = new Node();
        arr[1] = new Node();
        arr[2] = new Node();
        arr[3] = new Node();

        LinkedList<Node> []adj = new LinkedList[4];
        adj[0] = new LinkedList<>();
        adj[1] = new LinkedList<>();
        adj[2] = new LinkedList<>();
        adj[3] = new LinkedList<>();


    }

}