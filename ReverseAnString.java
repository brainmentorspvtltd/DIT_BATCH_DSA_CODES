public class ReverseAnString {

    static String reverse(String str){
        // Termination Case
        // if(str.length()==0){
        //     return "";
        // }

        if(str.length()==1){
                return str;
                //return String.valueOf(str.charAt(0));
            }
        // Small Problem (Make the String small) + Recursion (Cycle)
        String smallString = str.substring(1);
        String smallResult = reverse(smallString);
        // Processing Logic
        char firstChar = str.charAt(0);
        return smallResult + firstChar;

        
    }
    public static void main(String[] args) {
        String org = "Amit";
        String result = reverse(org);
        //System.out.println(reverse(org));
        
    }
}
