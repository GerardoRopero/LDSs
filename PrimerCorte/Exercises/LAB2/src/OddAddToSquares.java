public class OddAddToSquares {
    public static void main(String[] args) {
        System.out.println(oddAddToSquaresIterative(10));
        System.out.println(oddAddToSquaresRecursive(20, 1));
    }

    public static int oddAddToSquaresIterative(int n) {
        int sum = 0;
        int j = 1;
        for (int i = 0; i < n; i++) {
            sum += j;
            j += 2;
        }

        return sum;
    }

    public static int oddAddToSquaresRecursive(int n, int m) {
        if (n == 0) {
            return 0;
        }
        return m + oddAddToSquaresRecursive(n - 1, m + 2);
    }
}
