import java.util.Map;
import java.util.PriorityQueue;
import java.util.HashMap;

public class SortByFrequency {
    static String frequencySort(String str){
        Map<Character, Integer> map = new HashMap<>();
        for(char c : str.toCharArray()){
            map.put(c,map.getOrDefault(c, 0)+1);
        }

        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));
        maxHeap.addAll(map.keySet());
        StringBuilder res = new StringBuilder();
        while(!maxHeap.isEmpty()){
            char c = maxHeap.poll();
            int freq = map.get(c);
            for(int i=0;i<freq;i++){
                res.append(c);
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String str = "leetcode";
        String ans = frequencySort(str);
        System.out.println(ans);
    }
}
