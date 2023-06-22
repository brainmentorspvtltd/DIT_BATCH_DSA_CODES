import java.util.HashSet;

public class RemoveDup {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        int nums [] = {1,1,2};
        for(int element : nums){
            set.add(element);
        }
       System.out.println(set);
    }
}
