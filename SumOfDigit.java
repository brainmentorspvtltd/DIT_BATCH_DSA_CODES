public class SumOfDigit {

    static int sod(int num){
        return 0;
    }
   
    static void sod(int num, int sum ){

        // Termination Case
        if(num==0){
            System.out.println("Sum "+sum);
            return ; 
        }

        // get the reminder (Single digit)
        // Local Variable
        int singleDigit = num % 10; // Business Logic
        sum = sum + singleDigit;
        // Small Problem
        // num/10 make the number small and pass the sum for the next call
        sod(num/10, sum); // Tail Recursion

    }
    public static void main(String[] args) {
        int num = 123;
        sod(num, 0);

    }
}
