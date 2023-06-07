import java.util.ArrayList;

public class ArrayVsArrayList {
    public static void main(String[] args) {
        int arr[] = new int[5];
        
        for(int e : arr){
            System.out.println(e);
        }
        ArrayList<Integer> list = new ArrayList<>();
        Object o = 10;
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(10);
        list.add(10);
        list.add(0,99);
        list.removeIf((Integer element)->element==10);
        //System.out.println(list);
       // list.remove(o);
       System.out.println(list);
        //list.remove(100);
        
        list.set(0, 11111);
        System.out.println(list);

        ArrayList<String> names = new ArrayList<>();
        names.add("amit");
        names.add("ram");
        names.add("shyam");
        names.remove("ram");
        System.out.println(names);

    }
}
