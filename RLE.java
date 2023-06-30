public class RLE {

    static void runCode(String str){
        int n = str.length();
        for(int i=0;i<n;i++){
            int count =1;
            while(i<n-1 && str.charAt(i) == str.charAt(i+1)){
                i++;
                count++;
            }
            // Character a = str.charAt(i);
            System.out.print(str.charAt(i) +","+  count +" ");
        }
    }
    public static void main(String[] args) {
        runCode("aaaabbbcc");
    }
}
