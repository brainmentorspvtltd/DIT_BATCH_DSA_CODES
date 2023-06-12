import java.util.ArrayList;

public class MazePathProblem2 {

    static ArrayList<String> getMazePos(int currentRow , int currentCol, int endRow, int endCol){
        
        // Termination Case (Positive Case and Negative Case)
        // Positive Case
        if(currentCol == endCol && currentRow == endRow){
            ArrayList<String> result = new ArrayList<>();
            result.add("");
            return result;
        }
        // Negative Case
        if(currentCol>endCol || currentRow>endRow){
            ArrayList<String> result = new ArrayList<>();
            return result;
        }
        
        // All the Right and Down Result Store in Final Result
        ArrayList<String> finalResult = new ArrayList<>();
        // Move to the Right
        ArrayList<String> rightResult = getMazePos(currentRow, currentCol+1, endRow, endCol);
        for(String t : rightResult){
            finalResult.add("R"+ t);
        }
        // On BackTrack so we have another choice (Makes Branch)
        // Move to the Down
        ArrayList<String> downResult = getMazePos(currentRow+1, currentCol, endRow, endCol);
        for(String t : downResult){
            finalResult.add("D"+ t);
        }
        // On BackTrack so we have another choice (Makes Branch)
        // Move to the Diagonal
        ArrayList<String> diagonalResult = getMazePos(currentRow+1, currentCol+1, endRow, endCol);
        for(String t : diagonalResult){
            finalResult.add("I"+ t);
        }
        return finalResult;
    }
    public static void main(String[] args) {
        ArrayList<String> result = getMazePos(0, 0, 2, 2);
        System.out.println(result);
    }
}
