import java.util.ArrayList;
import java.util.List;

public class LCSubsequence {

    static List<String> generateSubsequence(String str){
        ArrayList<String> subSeqList = new ArrayList<>();

        int n = str.length();
        for(int i=0;i<n;i++){
            char firstChar = str.charAt(i);
            if(subSeqList.size() == 0){
                subSeqList.add("");
                subSeqList.add("" + firstChar);
                continue;
            }
            int subLen = subSeqList.size();
            for(int j=0;j<subLen;j++){
                String temp = subSeqList.get(j) + firstChar;
                subSeqList.add(temp);
            }
        }
        return subSeqList;
    }

    static String lcs(String str1, String str2){
        List<String> subsequenceslist1 = generateSubsequence(str1);
        List<String> subsequenceslist2 = generateSubsequence(str2);

        String lcs = "";
        for(String word1 : subsequenceslist1){
            for(String word2 : subsequenceslist2){
                if(word1.equals(word2) && word1.length()>lcs.length()){
                    lcs = word1;
                }
            }
        }
        return lcs;

    }
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "aebyc";
        String ans = lcs(str1, str2);
        System.out.println("LCS IS : " + ans);
    }
}
