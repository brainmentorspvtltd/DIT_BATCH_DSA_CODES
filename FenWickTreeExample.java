import java.util.*;

class FenwickTree{
    List<Integer> list ;
    int n; // size
    FenwickTree(int n){
        this.n = n + 1; // Consider start with 1 index
        Integer a[] = new Integer[this.n];
        Arrays.fill(a, 0); // Fill All values with 0
        list = Arrays.asList(a); // fill with 0

    }

    void add(int index, int value){
        index++;
        while(index<n){
            list.set(index, list.get(index) + value);
            // 2's complement &
            index +=(index & (-index)); // Last Set bit
        }
    }

    int rangeQueryHelper(int index){
        index++;
        int result = 0;
        while(index>0){
            result+=list.get(index);
            index -=(index & (-index));
        }
        return result;
    }

    int rangeQuery(int left, int right){
        return rangeQueryHelper(right) - rangeQueryHelper(left-1);
    }

}
class FenwickTreeExample{
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
        FenwickTree obj = new FenwickTree(list.size());
        for(int i = 0; i<list.size(); i++){
            obj.add(i, list.get(i));
        }
        System.out.println("Range (2,5) "+obj.rangeQuery(2, 5));
        System.out.println("Range (0,3) "+obj.rangeQuery(0, 3));
        System.out.println("Range (1,4) "+obj.rangeQuery(1, 4));
    }
}