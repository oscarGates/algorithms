package Exercises;

import java.util.LinkedList;

public class Graph {
    private int V;   // No. of vertices
    private static final int GRAPH_LENGTH = 4;


    // Array  of lists for Adjacency List Representation
    public LinkedList<Integer> adj[];

    // Constructor
    Graph()
    {
        V = GRAPH_LENGTH;
        adj = new LinkedList[GRAPH_LENGTH];
        for (int i=0; i<GRAPH_LENGTH; ++i)
            adj[i] = new LinkedList();
        addEdge(0, 1);
        addEdge(0, 2);
        addEdge(1, 2);
        addEdge(2, 0);
        addEdge(2, 3);
        addEdge(3, 3);
    }

    //Function to add an edge into the graph
    void addEdge(int v, int w)
    {
        adj[v].add(w);  // Add w to v's list.
    }

    public int getGraphLength(){
        return this.GRAPH_LENGTH;
    }

}
