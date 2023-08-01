public class EditDistanceProblem {

    static int editDistance(String first, String second, int m , int n){
        if(m==0){
            return n;
        }
        if(n==0){
            return m;
        }
        // if both last characters are match , move to the next char
        if(first.charAt(m-1) == second.charAt(n-1)){
            return editDistance(first, second, m-1, n-1);
        }
        // character not matched
        // 3 Choices (Insert, Delete, Replace)
        int insert = editDistance(first, second, m, n-1);
        int delete = editDistance(first, second, m-1, n);
        int replace = editDistance(first, second, m-1, n-1);
        int min = Math.min(insert, delete);
        return 1 + Math.min(min, replace);


    }

    public static void main(String[] args) {
        String first = "cat";
        String second = "cut";
        int result = editDistance(first,second, first.length(), second.length());
        System.out.println("Number of Operations "+result);
    }
}
