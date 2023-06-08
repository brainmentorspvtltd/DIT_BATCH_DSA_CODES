public class Fibo {

    public static int fib(int n) {
        if(n<=1){
            return n;
        }
        return fib(n-1) + fib(n-2);
      
        // int firstTerm = fib(n-2);
        // int secondTerm = fib(n-1);
        // return firstTerm + secondTerm;
    }

    public static void main(String[] args) {
        int r = fib(70);
        System.out.println(r);
    }
}
