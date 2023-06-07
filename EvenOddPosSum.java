public class EvenOddPosSum {

   static int[] sumEvenOddPos(int num, int pos){
    // Termination Case
    if(num ==0){ // Init Once
        int result [] = new int[2]; // {0,0}
        return result;
    }

    
        // Small Problem
        int arr[] = sumEvenOddPos(num/10, pos + 1); // Make a number small
        int digit = num % 10;
        if(pos%2!=0){
            arr[0] = arr[0] + digit;  // Every time fill
        }
        else{
            arr[1] = arr[1] + digit; // Every time fill
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = sumEvenOddPos(2789, 0);
        System.out.println("Odd Sum "+arr[0]);
        System.out.println("Even Sum "+arr[1]);
    }
}
