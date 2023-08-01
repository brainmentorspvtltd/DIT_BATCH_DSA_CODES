class LCSRecursionSolution{
    static int lcsTabulation(String first, String second, int m , int n){
        int matrix [][] = new int[m+1][n+1];
        for(int i = 0; i<=m ; i++){
            for(int j = 0; j<=n; j++){
                if(i==0 || j==0){
                   matrix[i][j] =0; 
                }
                else 
                // char match
                if(first.charAt(i-1) == second.charAt(j-1)){
                    matrix[i][j] = matrix[i-1][j-1] + 1;
                }
                // if char not match
                else{
                    matrix[i][j] = Math.max(matrix[i-1][j], matrix[i][j-1]);
                }
            }
        }
        return matrix[m][n];
    }
    // Memoization 
    static int lcs(String first, String second, int m, int n, int[][] cache ){
         // Termination Case
         if (m==0 || n==0){
            return 0;
         }   
        // Check Before Store in Cache, the Value is Already Present in Cache
        if(cache[m-1][n-1]!=0){
            return cache[m-1][n-1];
        }
        // the character will be match
        if(first.charAt(m-1) == second.charAt(n-1)){
            // Store the result in cache
            cache[m-1][n-1] = 1 + lcs(first, second, m-1, n-1, cache);
            return cache[m-1][n-1];
        }
        else{
            // Not Match
            int result1 = lcs(first, second, m, n-1, cache);
            int result2 = lcs(first, second, m-1, n, cache);
            cache[m-1][n-1] = Math.max(result1, result2);
            return cache[m-1][n-1];
        }
    }

    static int lcs(String first, String second){
        // Termination Case - If String Exhaust
        if(first.length()==0 || second.length()==0){
            return 0;
        }
        
        int count  = 0; // Maintain a Count

        // The Character will be matched 
        if(first.charAt(0) == second.charAt(0)){
            count = 1 + lcs(first.substring(1), second.substring(1));
        }
        else{
            // No Character Match
            int result1 = lcs(first.substring(1), second);
            int result2 = lcs(first, second.substring(1));
            count  = Math.max(result1, result2);
        }
        return count;
    }

    public static void main(String[] args) {
        //int len = lcs("abbg", "agbg");
        //System.out.println(len);
        String first = "abbg";
        String second = "agbg";
        //int cache [][] = new int[first.length()][second.length()];
        //int len = lcs(first, second, first.length(), second.length(),cache );
        //System.out.println("LCS "+len);
        int len  = lcsTabulation(first, second, first.length(),second.length());
        System.out.println(len);
    }
}