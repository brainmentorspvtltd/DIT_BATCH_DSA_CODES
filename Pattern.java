public class Pattern {
    static void printStar(int numberOfStar){
        if(numberOfStar ==0){
            return ;
        }
        System.out.print("*");
        printStar(numberOfStar-1);
    }
    static void printLine(int row, int star){
        if(row ==0){
            return ; 
        }
        printStar(star); // Before Print Line , we call star
        System.out.println(); // Print One Line (One Row)
        printLine(row-1, star + 1);
    }
    public static void main(String[] args) {
        final int MAX_ROW = 5;
        final int STAR = 1;
        printLine(MAX_ROW, STAR);
    }
}
