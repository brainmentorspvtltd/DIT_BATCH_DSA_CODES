import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int arr [] = {3,2,4};
        int target = 6;
        // Approach -1 O(n^2)
        // for(int  i = 0; i<arr.length; i++){
        //     for(int j =i + 1; j<arr.length; j++){
        //         int sum = arr[i] + arr[j];
        //         if(sum == target){
        //             System.out.println("Two sum "+arr[i]+" "+arr[j]);
        //             return ;
        //         }
        //      }
        // }
        // Approach - 2 Sort the Array and Use 2 Pointer Approach
        // Arrays.sort(arr); // N Log N
        // int low = 0 ;
        // int high = arr.length-1;
        // while(low<high){ // N
        //     if((arr[low] + arr[high]) == target){
        //         System.out.println("Two Sum "+arr[low]+" "+arr[high]);
        //         return;
        //     }
        //    if((arr[low] + arr[high]) < target){
        //     low ++;
        //    }
        //    else 
        //    if((arr[low] + arr[high]) > target){
        //     high--;
        //    }
         
        // Approach-3
        int max = 0;
        for(int element : arr){
            if(element>max){
                max = element;
            }
        }
        int hash[] = new int[max+1]; // fill 0 
                // all 5 fills with 0
                for(int i = 0; i<arr.length; i++){
                    if(hash[arr[i]]==0){
                        int index = target - arr[i];
                        hash[index] = arr[i]; 
                    }
                    else{
                        int secondPair = hash[arr[i]];
                        int firstPair = arr[i];
                        System.out.println("Two Sum "+firstPair + " "+secondPair);
                        return;
                    }
                }
        
    }
}
