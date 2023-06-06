public class Pattern2 {

    static void printStar(int star){
        if(star ==0){
            return ;
        }
        System.out.print("*");
        printStar(star-1);
    }

    static void printLine(int row){
        if(row==0){
            return;
        }
        printStar(row);
        System.out.println();
        printLine(row-1);
    }
    public static void main(String[] args) {
        printLine(5);
    }
}
