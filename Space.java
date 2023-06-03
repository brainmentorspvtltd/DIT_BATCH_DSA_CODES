public class Space {
    static int computeSum(int arr[], int sum ){
        for(int i = 0 ; i<arr.length; i++){
            sum = sum + arr[i];
        }
        return sum;
    }
    static int[] makeDouble(int arr[]){
        int arr2 [] = new int[arr.length];
        for(int i = 0; i<arr.length; i++){
            arr2[i] = arr[i] * arr[i];
        }
        return arr2;
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        computeSum(arr,0);
    }
}

