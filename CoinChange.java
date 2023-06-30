public class CoinChange {
    public static int coinChange(int[] coins, int amount) {
        return helper(coins, amount , 0);
    }

    public static int helper(int[] coins, int amount, int index){
        if(amount == 0){
            return 1;
        }
        if(amount<0){
            return 0;
        }

        if(amount > 0 && index== coins.length){
            return 0;        }

        return helper(coins, amount - coins[index], index) + helper(coins, amount , index + 1);
    }

    public static void main(String[] args) {
        int[] coins = {1,2};
        int amount = 3;
        System.out.println(coinChange(coins, amount)); // Output: 5
    }
}
