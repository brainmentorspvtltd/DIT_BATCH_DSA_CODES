public class BinarySearchAlgo {
    public static void main(String[] args) {
        int arr [] = {10,20,30,40,50,60,70,80,90};
        int search = 2000;
        int low = 0;
        int high = arr.length-1;
        int mid =0;
        while(low<high){
            mid = (low+high)/2;
            if(search == arr[mid]){
                System.out.println("Element Found...");
                return ;
            }
            if(search>arr[mid]){
                low = mid + 1; // Search in Upper Side
            }
            else if (search<arr[mid]){
                high = mid -1 ; // Search in Lower Side
            }
        }
        System.out.println("Element Not Found...");
    }
}
