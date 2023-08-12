package Graphs;
import java.util.ArrayList;
import java.util.LinkedList;
public class GraphDemo {

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    static void printGraph(ArrayList<ArrayList<Integer>> adj){
        for(int i=0; i<adj.size(); i++){
            System.out.print(i+" : ");
            for(int j=0; j<adj.get(i).size(); j++){
                System.out.print(adj.get(i).get(j)+", ");
            }
            System.out.println();
        }
    }

    static void bfs(ArrayList<ArrayList<Integer>> adj , int V){
        boolean []visited = new boolean[V+1];
        for(int i=0; i<V+1; i++){
            visited[i] = false;
        }

        int source = 0;
        visited[source] = true;
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(source);

        while(queue.size() !=0){
           source =  queue.poll();
            System.out.print(source+", ");
            int size = adj.get(source).size();
            for(int i=0; i<size; i++){
                int adjNode = adj.get(source).get(i);

                if(visited[adjNode] == false){
                    visited[adjNode] = true;
                    queue.add(adjNode);
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int V=4;
        ArrayList<ArrayList<Integer>>adj = new ArrayList<>();
        for(int i=0; i<V+1; i++){
            adj.add(new ArrayList<>());
        }
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 2, 4);        
        addEdge(adj, 3, 4);
        // addEdge(adj, 4, 2);
        // addEdge(adj, 4, 6);
        // addEdge(adj, 5, 6);
        printGraph(adj);
        System.out.println("\n");        
        bfs(adj, V);
    }
}
