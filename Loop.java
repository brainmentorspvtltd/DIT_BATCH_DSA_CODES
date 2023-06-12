import java.util.ArrayList;

public class Loop {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<>();
       // l.add("");
        System.out.println(l.size());
        for(String e : l){
            System.out.println("E is "+e);
        }
    }
}
