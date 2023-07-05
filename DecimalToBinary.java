public class DecimalToBinary {

    static String DecToBinary(int n){
        StringBuilder ans = new StringBuilder();
        while(n>0){
            int bit = n&1;
            ans.append(bit);
            n = n>>1;
        }
        return ans.reverse().toString();
    }
    public static void main(String[] args) {
        int n=12;
        System.out.println(DecToBinary(n));
    }
}
