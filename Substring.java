public class Substring {

    static boolean isPalindrome(String temp){
        int i=0;
        int j = temp.length()-1;
        while(i<=j){
            if(temp.charAt(i)!= temp.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    static void subString(String str){
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                String temp = str.substring(i, j);
                // System.out.print(temp + ",");
                if(isPalindrome(temp)){
                    System.out.println(temp);
                }
            }
        }
    }
    public static void main(String[] args) {
        String str ="abcba";
        subString(str);
    }
}
