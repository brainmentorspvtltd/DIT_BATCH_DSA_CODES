public class NaivePatternMatching {

    public static int naivePatternMatching(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();

        for (int i = 0; i <= n - m; i++) {
            int j = 0;

            while (j < m && text.charAt(i + j) == pattern.charAt(j)) {
                j++;
            }

            if (j == m) {
                return i; // Pattern found at index i
            }
        }

        return -1; // Pattern not found
    }

    public static void main(String[] args) {
        String text = "abbcdbcda";
        String pattern = "bcd";
        int result = naivePatternMatching(text, pattern);
        if (result != -1) {
            System.out.println("Pattern found at index: " + result);
        } else {
            System.out.println("Pattern not found");
        }
    }
}





