public class RecursionDemo {
    // n is a local variable
    static void show(int n){
        if(n==0){ // Termination Case  (Brake)
            return ; // exit from the function
        }
        System.out.println("Hello Amit "+n); // Logic During Stack Build
        // Making a Cycle
        show(n-1); // Stack Build
        System.out.println("Hi Amit "+n); // Logic During Stack Fall
    }

    static void disp(int n){
        for(int i = 1;i<=n;i++){
            System.out.println("Hi Amit");
        }
    }
    public static void main(String[] args) {
        show(5);
    }
}
