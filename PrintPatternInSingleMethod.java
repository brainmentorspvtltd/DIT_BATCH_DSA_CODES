public class PrintPatternInSingleMethod {

    static void printLeftPyramidPattern(int row, int star, int cs){
        if(row ==0){
           System.exit(0);
        }
           if(star ==0){

            return ;
           }
           System.out.print("*");
           printLeftPyramidPattern(row, star-1 , cs);
           System.out.println();
           star = cs;
           printLeftPyramidPattern(row-1, star+1, cs + 1);
    }
    public static void main(String[] args) {
        printLeftPyramidPattern(5,1, 1);
    }
}
