public class SumOfDigit {

    static int sod(int num){
        // Termination Case
        if(num ==0){
            return 0; // It is a sum initial value
        }
        int singleDigit = num % 10;
        int sum =sod(num/10); // Make a Number Small (Small Problem)
        // Stack Fall
       
        sum = sum + singleDigit;
        return sum;
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
        //sod(num, 0);
        System.out.println(sod(123));

    }
}
