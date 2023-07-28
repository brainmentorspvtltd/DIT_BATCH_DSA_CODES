import java.util.ArrayList;

public class GraphDFS {

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        // for undirected graph connect u and v and then v and u
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    static void dfsRec(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited) {
        visited[s] = true;
        System.out.print(s + ",");
        for(int u : adj.get(s)) {
            if(visited[u] == false) {
                dfsRec(adj, u, visited);
            }
        }
    }

    static void dfs(ArrayList<ArrayList<Integer>> adj, int V, int s) {
        boolean[] visited = new boolean[V];
        for(int i = 0; i < V; i++) {
            visited[i] = false;
        }
        // dfsRec(adj, s, visited);
        // for disconnected
        for(int i = 0; i < V; i++) {
            if(visited[i] == false) {
                dfsRec(adj, i, visited);
            }
        }
    }

    public static void main(String[] args) {
        
    }
}
