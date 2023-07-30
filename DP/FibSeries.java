package DP;

public class FibSeries {
    static int fibRec(int n) {
        // Base Case
        if(n <= 1) {
            return n;
        }
        int first = fibRec(n - 1);
        int second = fibRec(n - 2);
        int result = first + second;
        return result;
    }

    // Memoization
    static int fibMemo(int n, int cache[]) {
        // Base Case
        if(n <= 1) {
            return n;
        }
        if(cache[n] != 0) {
            return cache[n];
        }
        int first = fibMemo(n - 1, cache);
        int second = fibMemo(n - 2, cache);
        int result = first + second;
        cache[n] = result;
        return cache[n];
    }

    public static void main(String[] args) {
        int n = 30;
        long start = System.currentTimeMillis();
        int res = fibRec(n);
        long end = System.currentTimeMillis();
        long total = end - start;
        System.out.println("Result using recursion : " + res);
        System.out.println("Time taken using recursion : " + total);
        int cache[] = new int[n+1];
        start = System.currentTimeMillis();
        res = fibMemo(n, cache);
        end = System.currentTimeMillis();
        total = end - start;
        System.out.println("Result using memoization : " + res);
        System.out.println("Time taken using memoization : " + total);
    }
}
