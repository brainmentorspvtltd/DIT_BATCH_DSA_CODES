
import java.util.Arrays;

public class Anagram {

    static boolean areAnagram(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }

        char []a = s1.toCharArray();
        Arrays.sort(a);
        s1 = new String(a);

        char[] b = s2.toCharArray();
        Arrays.sort(b);
        s2 = new String(b);

        return s1.equals(s2);
    }
    public static void main(String[] args) {
        String s1 = "cod";
        String s2 = "code";
        System.out.println(areAnagram(s1, s2));
    }
}
