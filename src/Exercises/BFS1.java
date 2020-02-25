package Exercises;


import java.util.Iterator;
import java.util.LinkedList;

public class BFS1 {
    private static Graph g;

    public static void main(String[] args){
        g = new Graph();
        BFS(2);

    }

    private static void BFS(int v){
        LinkedList<Integer> queue = new LinkedList<>();
        boolean visited[] = new boolean[g.getGraphLength()];
        queue.add(v);
        visited[v] = true;

        while(!queue.isEmpty()){
            int actual = queue.poll();
            System.out.println(actual);
            Iterator<Integer> it = g.adj[actual].listIterator();
            while(it.hasNext()){
                int aux = it.next();
                if(!visited[aux]){
                    visited[aux] = true;
                    queue.add(aux);
                }
            }

        }

    }
}
