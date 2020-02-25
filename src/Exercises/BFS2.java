package Exercises;

import java.util.LinkedList;
import java.util.ListIterator;

public class BFS2 {
    private static Graph g;
    public static void main(String[] args) {
        g = new Graph();
        BFS(2);
    }
    
    public static void BFS(int v){
        LinkedList<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[g.getGraphLength()];
        queue.add(v);
        visited[v] = true;

        while(!queue.isEmpty()){
            Integer actual = queue.poll();
            System.out.println(actual);
            ListIterator<Integer> it = g.adj[actual].listIterator();

            while(it.hasNext()){
                Integer aux = it.next();
                if(visited[aux]) continue;
                queue.add(aux);
                visited[aux] = true;
            }

        }


    }
}
