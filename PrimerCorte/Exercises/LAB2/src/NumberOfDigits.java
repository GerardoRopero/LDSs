public class NumberOfDigits {
    public static void main(String[] args) {
        System.out.println(numberOfDigitsIterative(1234567891));
        System.out.println(numberOfDigitsRecursive(123456789));
    }

    public static int numberOfDigitsIterative(int n) {
        int numberOfDigits = 0;
        while (n > 0) {
            numberOfDigits++;
            n /= 10;
        }
        return numberOfDigits;
    }

    public static int numberOfDigitsRecursive(int n) {
        if (n == 0) {
            return 0;
        }
        return 1 + numberOfDigitsRecursive(n / 10);
    }
}
