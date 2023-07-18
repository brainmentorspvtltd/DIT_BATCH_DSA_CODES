public class ConvertTo2D {

    static int[][] convert2D(int []arr, int n, int m){
        int [][]result = new int[n][m];

        if((m*n) != arr.length){
            return new int[0][0];
        }
        int row =0;
        int col =0;
        for(int i=0;i<arr.length;i++){
            result[row][col] = arr[i];
            col++;
            if(col==m){
                row++;
                col=0;
            } 
        }
        return result;
    }
    public static void main(String[] args) {
        int []arr = {1,2,3,4};
        int n =2;
        int c =2;
        int [][]ans = convert2D(arr, n, c);

        for(int []row : ans){
            for(int i:row){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
