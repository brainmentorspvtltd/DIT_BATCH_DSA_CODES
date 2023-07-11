public class StockSpan {

    static int[] func(int []prices){
        int n = prices.length;
        int []ans = new int[n];
        for(int i=0;i<n;i++){
            int c = 1;
            int j =i-1;
            while(j>=0 && prices[j]<=prices[i]){
                c++;
                j--;
            }
            ans[i] = c;
        }
        return ans;
    }
    public static void main(String[] args) {
        int prices[] = {60,50,40,30,85,90,60};
        int []ans = func(prices);
        for(int i:ans){
            System.out.print(i + " ");
        }
    }
}
