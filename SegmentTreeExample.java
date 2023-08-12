import java.util.*;

class SegmentTree{
    List<Integer> segments;
    int n;
    SegmentTree(int n){
        this.n = n;
        Integer arr[] = new Integer[4*n]; // null
        Arrays.fill(arr, 0);
        segments = Arrays.asList(arr); // All Segments are fill with 0 value


    }

    void createSegmentTreeHelper(int startIndex, int endIndex, int node, List<Integer> list){
       // Termination Case
       if(startIndex == endIndex){
        // Reach to Leaf node
        segments.set(node, list.get(startIndex));
        return ;
       }
        // compute mid point
        int mid = (startIndex + endIndex)/2;
        // Create Left Sub Tree
        createSegmentTreeHelper(startIndex, mid, 2 * node + 1, list);
        // Create Right Sub Tree
        createSegmentTreeHelper(mid + 1, endIndex, 2 * node + 2, list);

        // BackTrack
        // Fill the Ancestor
        int leftChildValue = segments.get(2 * node + 1);
        int rightChildValue = segments.get(2 * node + 2); 
        int ancestor = leftChildValue + rightChildValue;
        segments.set(node, ancestor);
    }

    void createSegmentTree(List<Integer> list){
        createSegmentTreeHelper(0, n-1,0, list);

    }
    int rangeQueryHelper(int startIndex, int endIndex, int left, int right, int node){
        // No Overlapping case
        if(startIndex>right || endIndex< left){
            return 0 ; // No Answer Found...
        }
        // Complete Overlapping Case
        if(startIndex>=left && endIndex<=right){
            return segments.get(node);
        }
        // Parital Overlapping Case
        int mid = (startIndex + endIndex)/2;
        int leftNodeValue = rangeQueryHelper(startIndex, mid, left, right, 2* node + 1);
        int rightNodeValue = rangeQueryHelper(mid + 1, endIndex, left, right, 2* node + 2);
        return leftNodeValue + rightNodeValue;


    }
    int rangeQuery(int left , int right){
        return rangeQueryHelper(0, n-1, left, right, 0);
    }

    void updateHelper(int startIndex, int endIndex,int node, int index, int value){
        // Termination Case
        if(startIndex == endIndex){
            segments.set(node, value);
            return ; 
        }
        
        int mid = (startIndex + endIndex )/2;
        // either Lookup the Value on Left SubTree or Right SubTree
        if(index<=mid){
            // Go to Left Sub Tree
            updateHelper(startIndex, mid, 2*node+1, index, value);
        }
        else{
            // Go to Right Sub Tree
            updateHelper(mid+1, endIndex, 2*node+2, index, value);
        }
        // Back Track
        // Update Ancestor Update
        int leftChildValue = segments.get(2 * node + 1);
        int rightChildValue = segments.get(2 * node + 2);
        int ancestor = leftChildValue + rightChildValue;
        segments.set(node, ancestor);

    }

    void update(int index, int value){
        updateHelper(0, n-1, 0, index, value);
    }

}
class SegmentTreeExample{
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
        SegmentTree obj = new SegmentTree(list.size());
        obj.createSegmentTree(list);
        System.out.println("Range (0,3) " +obj.rangeQuery(0, 3));
        System.out.println("Range (2,5) " +obj.rangeQuery(2, 5));
        System.out.println("Range (4,4) " +obj.rangeQuery(4, 4));
        obj.update(4, 100);
        System.out.println("*********** After Update");
        System.out.println("Range (0,3) " +obj.rangeQuery(0, 3));
        System.out.println("Range (2,5) " +obj.rangeQuery(2, 5));
        System.out.println("Range (4,4) " +obj.rangeQuery(4, 4));

    }
}