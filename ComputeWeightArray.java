public class ComputeWeightArray {

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
    
    public static void main(String[] args) {
        String pattern = "abcabecabd";
        int []res = computeWeight(pattern);

        for(int i:res){
            System.out.print(i);
        }
    }
}
