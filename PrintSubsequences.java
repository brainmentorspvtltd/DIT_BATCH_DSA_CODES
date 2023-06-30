import java.util.ArrayList;

public class PrintSubsequences {
    public static void main(String[] args) {
        String str = "abcd";
        ArrayList<String> subSeqList = new ArrayList<>();

        int n = str.length();
        for(int i=0;i<n;i++){
            char firstChar = str.charAt(i);
            if(subSeqList.size() == 0){
                subSeqList.add(" ");
                subSeqList.add("" + firstChar);
                continue;
            }
            int subLen = subSeqList.size();
            for(int j=0;j<subLen;j++){
                String temp = subSeqList.get(j) + firstChar;
                subSeqList.add(temp);
            }
        }

        System.out.println("Subsequences Are : " + subSeqList);
    }
}
