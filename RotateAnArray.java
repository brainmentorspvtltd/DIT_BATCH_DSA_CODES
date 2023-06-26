public class RotateAnArray {

    static void reverse(int arr[], int low, int high){
        while(low<high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
    public static void main(String[] args) {
        int rotations = -3;
        int arr[] = {10,20,30,40,50}; 
        // rotations must be in range
        rotations = rotations % arr.length;
        // rotations negative
        if(rotations<0){
            rotations = arr.length + rotations;
        }
        // 1st part reverse
        reverse(arr, 0, arr.length-rotations-1);
        // 2nd part reverse
        reverse(arr, arr.length-rotations, arr.length-1);
        // full reverse
        reverse(arr, 0, arr.length-1);
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();


       
    }
}
