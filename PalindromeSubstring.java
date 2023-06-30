public class PalindromeSubstring {

    static boolean isPalindrome(String str){
        int i=0;
        int j = str.length()-1;
        while(i<=j){
            if(str.charAt(i)!= str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "abccbc";
        for(int i=0;i<str.length();i++){
            for(int j =i+1; j<=str.length();j++){
                String temp = str.substring(i, j);
                if(isPalindrome(temp)){
                    System.out.println(temp);
                }
            }
        }
    }
}
