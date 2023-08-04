class CoinChangeProblem2{
    static int count (int coins[], int len , int moneyValue){
        if(moneyValue==0){
            return 0;
        }
        // maintain initalize result
        int res  = Integer.MAX_VALUE;
        for(int i = 0; i<len; i++){
            if(coins[i]<=moneyValue){
                int result = count(coins, len, moneyValue - coins[i] );
                if(result!=Integer.MAX_VALUE && result + 1 < res){
                    res = result + 1;
                }
            }
        
        }
        return res;
    }
    public static void main(String[] args) {
        int coins[] = {1,3,7,10};
        int moneyValue = 15;
        System.out.println(count(coins, coins.length, moneyValue));
    }
}