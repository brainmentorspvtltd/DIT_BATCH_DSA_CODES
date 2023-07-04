public class RabinKarp {

    static long HashValue(String pattern){
        long hashvalue =0;
        for(int i=0;i<pattern.length();i++){
            hashvalue += pattern.charAt(i) * Math.pow(10, i);
        }
        return hashvalue;
    }

    static int searchPattern(String text, String pattern){
        int textlength = text.length();
        int patternlength = pattern.length();
        long patternHash = HashValue(pattern);
        

        for(int i=0;i<textlength - patternlength;i++){
            long textHash = HashValue(text.substring(i, i+patternlength));
            if(patternHash == textHash && pattern.equals(text.substring(i, i+patternlength))){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String text = "ABCABDAC";
        String pattern ="ABDA";
        System.out.println(searchPattern(text, pattern));
    }
}
