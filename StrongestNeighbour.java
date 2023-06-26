public class StrongestNeighbour {
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,4,5};
        for(int i = 1; i<arr.length; i++){
            int max = Math.max(arr[i-1], arr[i]);
            System.out.print(max + " ");
        }
        System.out.println();

    }
}
