public class ZigZagArray {
    public static void main(String[] args) {
        int arr[] = {4,3,7,8,6,2,1};
        boolean flag = true;
        int temp = 0;
        for(int i = 0; i<arr.length-1; i++){
            if(flag){
                if(arr[i]>arr[i+1]){
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
            else{ // flag is false
                if(arr[i]<arr[i+1]){
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
            // toggle flag
            flag = !flag;
        }
        System.out.println("Zig Zag Array....");
        for(int i : arr){
            System.out.println(i);
        }
    }
}
