package DP;

public class DiceCountRec {
    static int countWays(int current, int target) {
        // Positive base case
        if(current == target) {
            return 1;
        }
        // Negative base case
        if(current > target) {
            return 0;
        }
        int count = 0;
        for(int dice = 1; dice <= 6; dice++) {
            count = count + countWays(current+dice, target);
        }
        return count;
    }

    public static void main(String[] args) {
        int res = countWays(0, 10);
        System.out.println(res);
    }
}
