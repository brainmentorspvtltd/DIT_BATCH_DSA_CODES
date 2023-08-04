public class MinCoinChangeDP {
    public static void main(String[] args) {
        int coins[] = {1,3,7,10};
        int moneyValue = 15;
        int dp[] = new int[moneyValue+1];
        dp[0] = 0;
        for(int i = 1; i<=moneyValue; i++){
            dp[i] = Integer.MAX_VALUE;
            for(int coin : coins){
                if(i-coin>=0 && dp[i-coin]!=Integer.MAX_VALUE){
                    dp[i] = Math.min(dp[i], dp[i-coin]+1) ;
                }
            }
        }
        System.out.println(dp[moneyValue]==Integer.MAX_VALUE?"No Solution ":dp[moneyValue]);



    }
}
