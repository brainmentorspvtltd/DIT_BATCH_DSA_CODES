public class MCPTabulation {
    public static void main(String[] args) {
        int cost [][] = {{2,0,6},{3,1,7},{4,5,9}};
        int result [][] = new int[cost.length][cost.length];
        // fill the first cell
        result [0][0] = cost[0][0];
        // now we know the first cell value, based on first cell , fill the rest of the columns
        // fill the first column
        for(int i = 1; i<result.length; i++){
            result[i][0] = result[i-1] [0]  + cost[i][0];
        }
        // fill the first row
        for(int i = 1; i<cost.length; i++){
            result[0][i] = result[0][i-1] + cost[0][i];
        }
        // fill the rest
        for(int i = 1; i<result.length; i++){
            for(int j = 1; j<result.length; j++){
                // Up, Left, Diagonal
                result[i][j] = Math.min(Math.min(result[i-1][j-1],result[i-1][j])
                , result[i][j-1]) + cost[i][j];
            }
        }
        System.out.println("MCP "+(result[result.length-1][result.length-1]));


 
     }
}
