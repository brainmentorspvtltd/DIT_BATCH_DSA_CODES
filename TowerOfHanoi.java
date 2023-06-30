public class TowerOfHanoi {

    static void toh(int n, char A ,char B, char C){
        if(n==1){
            System.out.println(A + " ---> " + C);
            return;
        }
        toh(n-1, A, C, B);
        toh(1,A,B,C);
        toh(n-1, B, A, C);
    }
    public static void main(String[] args) {
        toh(3, 'A', 'B', 'C');
    }
}
