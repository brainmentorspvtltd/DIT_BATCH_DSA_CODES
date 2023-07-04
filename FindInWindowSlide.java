public class FindInWindowSlide {
    public static void main(String[] args) {
        int arr[] = {1,2,3,2,1,2,3,1};
        int k = 3;
        int x = 2;
        int f = 0;
        for(int i = 0; i<k; i++){
            if(arr[i]==x){
                f++;
            }
        }
        System.out.println("First "+f);
        for(int  i= k ; i<arr.length; i++){
            int outElement = arr[i-k];
            if(outElement==x){
                f--;
            }
            int inElement = arr[i];
            if(inElement==x){
                f++;
            }
            System.out.println("Freq Count "+f);
        }
    }
}
