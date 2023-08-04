public class CoinChangeProblem {

    static int count(int coins[], int coinsLen, int moneyValue){
        if(moneyValue==0){
            return 1;
        }
        if(moneyValue<=0)
        {
            return 0;
    }   
    if(coinsLen<=0){
        return 0;
    }
        // include coin
        // exclude coin
        return count(coins, coinsLen-1, moneyValue)  + 
        count(coins, coinsLen, moneyValue - coins[coinsLen-1]);
    }
    
    public static void main(String[] args) {
        int coins[] = {1,3,7,10};
        int moneyValue = 15;
        int countCoins = count(coins, coins.length, moneyValue);
        System.out.println(countCoins);
    }
}
