public class NQueen {
    static boolean isQueenPlaceOnSafeArea(boolean [][]board, int row, int col){
        // Check - 1 Checking on Above Row
        for(int i = row; i>=0; i--){
            if(board[i][col]){ // There is a Queen
                return false;
            }
        }
        // check -2 Left Diagonal Check
        for(int i = row, j = col; i>=0&& j>=0 ; i--, j--){
            if(board[i][j]){
                return false;
            }
        }
        // Check -3 Right Diagonal Check
        for(int i = row, j=col; i>=0 && j<board[row].length; i--, j++){
            if(board[i][j]){
                return false;
            }
        }
        return true;
    }
    static int countNumberOfWays(boolean board[][], int currentRow){
        int count = 0;
        // Termination Case
        if(currentRow == board.length){
            return 1; // 1 Possiblity
        }
        // From the Row ( Need to Traverse Each Column)
       for(int column = 0 ; column<board[currentRow].length; column++){
            // Place the Queen on Column But Before Placing Check the Queen is Safe or not
            if(isQueenPlaceOnSafeArea(board, currentRow, column)){
                board[currentRow][column] = true; // Placing the Queen on Board
                // After Placing a Queen , Move to the Next Row
                int result = countNumberOfWays(board, currentRow+1);
                count = count + result;
                // Stack Fall (BackTracking)
                board[currentRow][column] = false; // Undo the Option
            }
       }
       return count;
    }
    public static void main(String[] args) {
        final int N = 4;
        boolean chessBoard[][] = new boolean[N][N]; // all values are field with false
        int count = countNumberOfWays(chessBoard, 0);
        System.out.println(count);
    }
}
