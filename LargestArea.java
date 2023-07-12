public class LargestArea {

    static int getMaxArea(int arr[]){
        int ans =0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            int current = arr[i];

            //previous area
            for(int j=i-1;j>=0;j--){
                if(arr[j] >= arr[i]){
                    current += arr[i];
                }
                else{
                    break;
                }
            }
            //next area
            for(int j=i+1;j<n;j++){
                if(arr[j] >= arr[i]){
                    current += arr[i];
                }
                else{
                    break;
                }
            }
            ans = Math.max(ans,current);
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {6,2,5,4,5,6};
        System.out.println("Max Area Is :" + getMaxArea(arr));
    }
}
