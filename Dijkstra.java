import java.util.Arrays;

public class Dijkstra {

    static int[] dijkstra(int graph[][], int v, int source) {
        int distance[] = new int[v];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[source] = 0;
        boolean set[] = new boolean[v];
        for(int i = 0; i < v; i++) {
            int u = -1;
            for(int j = 0; j < v; j++) {
                if(!set[j] && (u == -1 || distance[j] < distance[u])) {
                    u = j;
                }
            }
            set[u] = true;
            for(int vertex = 0; vertex < v; vertex++) {
                if(graph[u][vertex] != 0 && set[vertex] == false) {
                    distance[vertex] = Math.min(distance[vertex], graph[u][vertex] + distance[u]);
                }
            }
        }
        return distance;
    }
    public static void main(String[] args) {
        
    }
}
