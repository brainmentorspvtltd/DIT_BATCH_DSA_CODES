public class KMP {

    static int[] computeWeight(String pattern){
        int []weightArray = new int[pattern.length()];
        int length =0;
        int j=1;

        weightArray[0] = 0;
        while(j<pattern.length()){
            if(pattern.charAt(j) == pattern.charAt(length)){
                length++;
                weightArray[j] = length;
                j++;
            }
            else{
                if(length !=0){
                    length = weightArray[length-1];
                }
                else{
                    weightArray[j] =0;
                    j++;
                }
            }
        }
        return weightArray;
    }

    static int searchPattern(String text, String pattern, int []weightArray){
        int i=0;
        int j=0;
        while(i<text.length()){
            if(text.charAt(i) == pattern.charAt(j)){
                i++;
                j++;
                if(j==pattern.length()){
                    return i-j;
                }
            }
            else{
                if(j!=0){
                    j = weightArray[j-1];
                }
                else{
                    i++;
                }
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        String text = "ABABDABACDABAB";
        String pattern ="ABACD";
        int []wArray = computeWeight(pattern);
        int findIndex = searchPattern(text, pattern, wArray);
        System.out.println(findIndex);
    }
}
