public class PreComputationTech {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60,70,80,90,100};
        int prefix[] = new int[arr.length]; // fill with 0 
        prefix[0] = arr[0];
        for(int i = 1; i<arr.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        System.out.println("Org Array");
        for(int element  : arr){
            System.out.print(element+" ");
        }
        System.out.println();
        System.out.println("Prefix Array");
        for(int element  : prefix){
            System.out.print(element+" ");
        }
        System.out.println();
        int left = 2;
        int right = 5;
        System.out.println("Range of "+left+" "+right);
        System.out.println(prefix[right] - prefix[left-1]);
    }
}
