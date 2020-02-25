package Exercises;

import java.util.ListIterator;

public class DFS1 {
    private static Graph g;
    public static void main(String[] args) {
        g = new Graph();
        DFS(2, new boolean[g.getGraphLength()]);
    }

    public static void DFS(int v, boolean[] visited){
        if(visited[v]) return;
        System.out.println(v);
        visited[v] = true;
        ListIterator<Integer> it = g.adj[v].listIterator();
        while (it.hasNext()){
            DFS(it.next(), visited);
        }
    }
}
