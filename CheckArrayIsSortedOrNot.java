public class CheckArrayIsSortedOrNot {
    public static void main(String[] args) {
        int arr[] = {10,20,30,30,40,50};
        // for(int i = 0; i<arr.length; i++){
        //     for(int j = i+1; j<arr.length; j++){
        //         if(arr[i]>arr[j]){
        //             System.out.println("Not Sorted...");
        //             return ;
        //         }
        //     }
        // }
        for(int i = 1; i<arr.length; i++){
            if(arr[i-1]>arr[i]){
                System.out.println("Not Sorted...");
                return ;
            }
        }
        System.out.println("Sorted...");
    }
}
