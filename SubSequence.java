import java.util.ArrayList;

public class SubSequence {

   static ArrayList<String> getAllSubSequence(String str){
    // Termination Case
    if(str.length() ==0){
        ArrayList<String> list = new ArrayList<>();
        list.add("");
        return list;
    }
        // Small Problem (Make a String small)
        char firstChar = str.charAt(0);
        ArrayList<String> result = new ArrayList<>();
        ArrayList<String> list = getAllSubSequence(str.substring(1));
        for(String s : list){
            // Not Include it
            result.add(s);
            // Include it
            result.add(firstChar + s);
        }  
        return result;       
    }

    public static void main(String[] args) {
        ArrayList<String> result = getAllSubSequence("amit");
        System.out.println(result);
    }
}
