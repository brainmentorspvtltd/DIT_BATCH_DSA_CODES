import java.util.*;

public class PascalTriangle {

    public static List<List<Integer>> generate(int numRows) {
         List<List<Integer>> trows = new ArrayList<>();

        
        for(int i = 0; i < numRows; i++){
            List<Integer> col = new ArrayList<>();
                    
            for(int j = 0; j <= i; j++){
                if (j==0 || j==i){
                   // Every Column's First and Last Element are filled with 1
                    col.add(1);
                } else {
                   // Addition of previous Row's First two elements then second two elements , and so on 
                    col.add(j, trows.get(i-1).get(j-1)+trows.get(i-1).get(j));    
                }
            }
                  
            trows.add(col);
        }
        return trows;

    }
    
    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> triangle = generate(numRows);
        System.out.println(triangle);
        System.out.println();
    }
}
