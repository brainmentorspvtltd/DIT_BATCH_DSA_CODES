package DP;

public class DiceCountMemo {
    static int countWays(int current, int target, int cache[]) {
        // Positive base case
        if(current == target) {
            return 1;
        }
        // Negative base case
        if(current > target) {
            return 0;
        }
        if(cache[current] != 0) {
            return cache[current];
        }
        int count = 0;
        for(int dice = 1; dice <= 6; dice++) {
            count = count + countWays(current+dice, target, cache);
        }
        cache[current] = count;
        return count;
    }

    public static void main(String[] args) {
        int target = 5;
        int cache[] = new int[target+1];
        int res = countWays(0, target, cache);
        System.out.println(res);
    }
}
