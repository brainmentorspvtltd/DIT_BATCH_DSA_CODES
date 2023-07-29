import java.util.Arrays;

public class Prims {

    static int prims(int graph[][], int v) {
        int key[] = new int[v];
        Arrays.fill(key, Integer.MAX_VALUE);
        key[0] = 0;
        boolean set[] = new boolean[v];
        int result = 0;
        for(int i = 0; i < v; i++) {
            int source = -1;
            for(int j = 0; j < v; j++) {
                // source must not be visited
                if(!set[j] && (source == -1 || key[j] < key[source])) {
                    source = j;
                }
            }
            set[source] = true;
            result += key[source];
            for(int vertex = 0; vertex < v; vertex++) {
                if(graph[source][vertex] != 0 && set[vertex] == false) {
                    key[vertex] = Math.min(key[vertex], graph[source][vertex]);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int V = 4;
        int graph[][] = {
            {0,5,8,0},
            {5,0,10,15},
            {8,10,0,20},
            {0,15,20,0}
        };
        int res = prims(graph, V);
        System.out.println(res);
    }
}
