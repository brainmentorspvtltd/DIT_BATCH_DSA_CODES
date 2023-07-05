public class BinaryToDecimal {

    static int binaryToDec(String str){
        int ans =0;
        int mask =0;
        for(int i=str.length()-1;i>=0;i--){
            int bit = str.charAt(i) - '0';
            ans+= (bit << mask);
            mask++;
        }
        return ans;
    }
    public static void main(String[] args) {
        String str = "1001";
        System.out.println("NUMBER IS : " + binaryToDec(str));
    }
}
