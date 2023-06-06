public class PatternAnotherApproach {

    static void printStar(int star){
        if(star ==0){
            return ;
        }
        System.out.print("*");
        printStar(star-1);
    }
    static void printLine(int row){
         // Termination Case
         if(row ==0){
            return ;
         }
           
            printLine(row-1); // Small Problem
            printStar(row);
            System.out.println(); // Print a One Line (Processing Logic)
    }

    public static void main(String[] args) {
        printLine(5);
    }
}
