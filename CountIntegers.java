public class CountIntegers {

    //PROBLEM COUNT INTEGERS
    public static int countIntegers(int n) {
        int count = 0;

        for (int x = 0; x <= n; x++) {
            if ((n & x) == x) {
                count++;
            }
        }

        return count;
    }



    // PROBLEM findMaximumBitwiseAnd

    public static int findMaximumBitwiseAnd(int[] array) {
        int maxAnd = 0;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int bitwiseAnd = array[i] & array[j];
                if (bitwiseAnd > maxAnd) {
                    maxAnd = bitwiseAnd;
                }
            }
        }

        return maxAnd;
    }

    public static void main(String[] args) {
        int n = 5;
        int output = countIntegers(n);
        System.out.println(output); // Output: 4

        int []arr = {3, 5, 8, 10, 12};
        System.out.println(findMaximumBitwiseAnd(arr));
    }
}