public class RopeCutting {

    static int ropecut(int n, int a, int b, int c){
        //termination case
        if(n==0){
            return 0;
        }
        if(n<0){
            return -1;
        }

        //cycle

        int cutFromA = ropecut(n-a, a, b, c);
        int cutFromB= ropecut(n-b, a, b, c);
        int cutFromC = ropecut(n-c, a, b, c);

        int pieces = Math.max(Math.max(cutFromA,cutFromB)
        , cutFromC);

        if(pieces == -1){
            return -1;
        }
        return pieces +1;
    }
    public static void main(String[] args) {
        System.out.println(ropecut(9, 5, 8, 7));
    }
}
