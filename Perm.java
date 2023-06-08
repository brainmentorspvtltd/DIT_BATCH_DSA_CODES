import java.util.ArrayList;

public class Perm {

    static ArrayList<String> getPerm(String str){
        // TERMINATION CASE
        if(str.length()==0){
            ArrayList<String> l = new ArrayList<>();
            l.add("");
            return l;
        }
        // get the first char
        char firstChar = str.charAt(0);
        ArrayList<String> finalList = new ArrayList<>();
        // Make the String small so it is easy to compute Perm of Small
        ArrayList<String> result = getPerm(str.substring(1));
        // Traverse the Result
        for(String t : result){
            for(int i = 0; i<=t.length(); i++){
            StringBuilder sb = new StringBuilder(t);
            sb.insert(i,firstChar);
            finalList.add(sb.toString());
            }
        }
        return finalList;
    }
    public static void main(String[] args) {
       System.out.println(getPerm("abc"));
    }
}
