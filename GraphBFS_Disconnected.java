import java.util.ArrayList;
import java.util.LinkedList;

public class GraphBFS_Disconnected {
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        // for undirected graph connect u and v and then v and u
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    static void bfs(ArrayList<ArrayList<Integer>> adj, int source, boolean[] visited) {
        visited[source] = true;
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(source);
        while(queue.size() != 0) {
            // pop and retrieve first element of queue
            source = queue.poll();
            System.out.print(source + ",");
            // get number of adjacent vertices of current source
            int size = adj.get(source).size();
            for(int i = 0; i < size; i++) {
                // get adjacent node
                int adjNode = adj.get(source).get(i);
                if(visited[adjNode] == false) {
                    visited[adjNode] = true;
                    queue.add(adjNode);
                }
            }
        }
    }

    static void bfs_dis(ArrayList<ArrayList<Integer>> adj, int v) {
        boolean []visited = new boolean[v];
        int count = 0;
        for(int i = 0; i < v; i++) {
            visited[i] = false;
        }
        for(int i = 0; i < v; i++) {
            if(visited[i] == false) {
                bfs(adj, i, visited);
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < V+1; i++) {
            adj.add(new ArrayList<>());
        }
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 2, 3);
        addEdge(adj, 1, 3);
        addEdge(adj, 4, 5);
        addEdge(adj, 4, 6);
        addEdge(adj, 5, 6);
        // printGraph(adj);
        bfs_dis(adj, V);
    }
}
