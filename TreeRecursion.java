public class TreeRecursion {

    /*
     * Branch Recursion or Tree Recursion  or Multi Branch
     */

     static void branch(int x){
        if(x>=5){
            return ;
        }
        System.out.println(x);
        branch(x+1); // Inner Call
        branch(x+2); // Outer Call
        branch(x+3);
     }

     /*
      * 0
        1
        2
        2
      */

    public static void main(String[] args) {
        branch(0);
    }
}
