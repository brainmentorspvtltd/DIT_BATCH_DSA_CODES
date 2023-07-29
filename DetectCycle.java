import java.util.ArrayList;

public class DetectCycle {

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        // for undirected graph connect u and v and then v and u
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    static boolean dfsRec(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited, int parent) {
        visited[s] = true;
        
        for(int u : adj.get(s)) {
            if(visited[u] == false) {
                if (dfsRec(adj, u, visited, s) == true) {
                    return true;
                }
            }
            else if(u != parent) {
                return true;
            }
        }
        return false;
    }

    static boolean dfs(ArrayList<ArrayList<Integer>> adj, int V) {
        boolean[] visited = new boolean[V];
        for(int i = 0; i < V; i++) {
            visited[i] = false;
        }
        // dfsRec(adj, s, visited);
        // for disconnected
        for(int i = 0; i < V; i++) {
            if(visited[i] == false) {
                if(dfsRec(adj, i, visited, -1) == true) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int V = 7;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        addEdge(adj, 0, 1);
        addEdge(adj, 1, 2);
        addEdge(adj, 2, 3);
        addEdge(adj, 3, 4);
        addEdge(adj, 4, 5);
        addEdge(adj, 5, 6);
        boolean res = dfs(adj, V);
        System.out.println(res);
    }
}
