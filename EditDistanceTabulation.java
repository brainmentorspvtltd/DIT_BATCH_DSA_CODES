public class EditDistanceTabulation {
    public static void main(String[] args) {
        String first  = "sunday";
        String second = "saturday";
        int m = first.length();
        int n = second.length();
        int matrix [][] = new int[m+1][n+1];
        for(int i = 0; i<=m; i++){
            for(int j = 0; j<=n;j++){
                if(i == 0){
                    matrix[i][j] = j;
                    
                }
                else if (j==0){
                    matrix[i][j] = i;
                }
                else 
                // char same
                if(first.charAt(i-1) == second.charAt(j-1)){
                    matrix[i][j] = matrix[i-1][j-1];
                }
                else{
                    // char not same
                    int replace = matrix[i-1][j-1];
                    int insert = matrix[i][j-1];
                    int delete = matrix[i-1][j];
                    int result = Math.min(insert, delete);
                   matrix[i][j] =  1 + Math.min(result, replace);
                }
            }
        }
        System.out.println("Min Operation "+matrix[m][n]);
        
    }
}
