import java.util.Arrays;
import java.util.List;

public class ArrayListAndArray {
    public static void main(String[] args) {
       
        List<Integer> list = Arrays.asList(10,20,30,40,50);
        Integer x[] = new Integer[list.size()];
        Integer a[] = list.toArray(x);
        
    }
}
