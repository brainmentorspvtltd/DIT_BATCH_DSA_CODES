public class NearestLowestAndGreatest {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60,70,80,90,100};
        int low = 0;
        int high = arr.length-1;
        int searchElement = 72;
        int i =0;
        int nearestLowestElement = 0;
        int nearestGreaterElement = 0;
        while(i<arr.length){
            int mid = (low+high)/2;
            if(searchElement>arr[mid]){
                nearestLowestElement = arr[mid];
                low = mid + 1;
            }
            else if(searchElement<arr[mid]){
                nearestGreaterElement = arr[mid];
                high = mid -1 ;
            }
            else if(arr[mid]==searchElement){
                nearestLowestElement = nearestGreaterElement = arr[mid];
                return;
            }
            i++;
        }
        System.out.println("Search "+searchElement);
        System.out.println("Nearest Greater Element "+nearestGreaterElement);
        System.out.println("Nearest Lowest Element "+nearestLowestElement);
    }
}
