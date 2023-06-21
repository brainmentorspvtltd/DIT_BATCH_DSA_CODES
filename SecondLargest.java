public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = {1000,20,90,100,1,44};
        // First Largest
        int firstLargest = Integer.MIN_VALUE; 
        int secondLargest = Integer.MIN_VALUE;
        if(arr.length<2){
            System.out.println("Small Array...");
            return ;
        }
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>firstLargest){
                secondLargest = firstLargest;
                firstLargest = arr[i];
            }
            else if(arr[i]>secondLargest && arr[i]!=firstLargest){
                secondLargest = arr[i];
            }
        }
        System.out.println(firstLargest+ " "+secondLargest);
    }
}
