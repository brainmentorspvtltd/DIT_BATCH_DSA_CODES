public class HashCode {
    static long HashValue(String pattern){
        long hashvalue =0;
        for(int i=0;i<pattern.length();i++){
            hashvalue += pattern.charAt(i) * Math.pow(10, i);
        }
        return hashvalue;
    }

    public static void main(String[] args) {
        String pattern = "ab";
        System.out.println(HashValue(pattern));
    }
}
