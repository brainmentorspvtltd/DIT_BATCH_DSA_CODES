public class SortedArray {

    static boolean isSortedArray(int []arr, int index){
        // Termination Case
        if(arr.length-1 == index){
            return true; // Array is Sorted
        }
        if(arr[index]>arr[index+1]){
            return false; // Array is not sorted
        }
        // 0 , 1, 2 , 3 , 4 (Index will keep moving)
        // Small Problem (Moving Index) (recursion (cycle))
        return isSortedArray(arr, index+1);
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,90,50};
        System.out.println(isSortedArray(arr, 0)?"Array is Sorted ":"Array is Not Sorted");

    }
}
