package graphs;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class BFS {

    public static void main(String... args){
        Graph graph = new Graph(4);

        graph.nodes[0] = new GraphNode(0);
        graph.nodes[1] = new GraphNode(1);
        graph.nodes[2] = new GraphNode(2);
        graph.nodes[3] = new GraphNode(3);

        graph.addAdjacency(graph.nodes[0], graph.nodes[1]);
        graph.addAdjacency(graph.nodes[0], graph.nodes[2]);
        graph.addAdjacency(graph.nodes[1], graph.nodes[2]);
        graph.addAdjacency(graph.nodes[2], graph.nodes[0]);
        graph.addAdjacency(graph.nodes[2], graph.nodes[3]);
        graph.addAdjacency(graph.nodes[3], graph.nodes[3]);
        GraphNode clone = graph.cloneGraph(graph.nodes[2].value, new HashMap<>());
        graph.BFS(graph.nodes[2]);
        System.out.println();
        System.out.println();
        System.out.println();
        graph.BFS(clone);
    }



}

class GraphNode {
    int value;
    List<GraphNode> neighbours;

    public GraphNode(int value){
        this.value = value;
        neighbours = new ArrayList<>();
    }

}

class Graph {
    GraphNode[] nodes;
    int vertices;

    public Graph(int value){
        vertices = value;
        nodes = new GraphNode[value];
    }

    public void addAdjacency(GraphNode x, GraphNode y){
        x.neighbours.add(y);
    }

    public void BFS(GraphNode value) {

        boolean[] visited = new boolean[vertices];
        LinkedList<GraphNode> queue = new LinkedList<>();
        queue.add(value);
        visited[value.value] = true;

        while (!queue.isEmpty()) {

            GraphNode current = queue.poll();
            System.out.println(current.value);

            for(GraphNode node : current.neighbours) {
                if (!visited[node.value]) {
                    queue.add(node);
                    visited[node.value] = true;
                }
            }

        }
    }


    public GraphNode cloneGraph(int value,  Map<GraphNode, GraphNode> storage) {

        boolean[] visited = new boolean[vertices];
        LinkedList<GraphNode> queue = new LinkedList<>();
        queue.add(nodes[value]);
        visited[nodes[value].value] = true;
        GraphNode result = new GraphNode(nodes[value].value);
        storage.put(nodes[value], result);

        while (!queue.isEmpty()) {
            GraphNode current = queue.poll();

            if(storage.get(current) == null){
                storage.put(current, new GraphNode(current.value));
            }


            for(GraphNode node : current.neighbours){
                if(!visited[node.value]) {
                    queue.add(node);
                    visited[node.value] = true;
                }
            }

        }

        for(GraphNode real: storage.keySet()){
            GraphNode clone = storage.get(real);
            for(GraphNode node: real.neighbours){
                clone.neighbours.add(storage.get(node));
            }
        }

        return result;

    }


}