import java.util.ArrayList;

public class GraphDemo {

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        // for undirected graph connect u and v and then v and u
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    static void printGraph(ArrayList<ArrayList<Integer>> adj) {
        for(int i = 0; i < adj.size(); i++) {
            System.out.print(i + " : ");
            for(int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(adj.get(i).get(j) + ",");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 2, 3);
        printGraph(adj);
    }
}