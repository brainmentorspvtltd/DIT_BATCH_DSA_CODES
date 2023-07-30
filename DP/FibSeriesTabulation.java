package DP;

public class FibSeriesTabulation {

    static int fib(int n) {
        int cache[] = new int[n+1];
        cache[0] = 0;
        cache[1] = 1;
        // cache[2] = cache[1] + cache[0];
        // cache[3] = cache[2] + cache[1];
        for(int i = 2; i <= n; i++) {
            cache[i] = cache[i-1] + cache[i-2];
        }
        return cache[n];
    }
    public static void main(String[] args) {
        int res = fib(5);
        System.out.println(res);
    }
}
