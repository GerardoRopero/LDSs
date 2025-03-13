public class ShowInvertedNumber {
    public static void main(String[] args) {
        System.out.println(invertedNumberRecursive(456, 0));
        System.out.println(invertedNumberIterative(456));
    }

    public static int invertedNumberIterative(int n) {
        int number = 0;
        while (n > 0) {
            number = number * 10 + n % 10;
            n = n / 10;
        }
        return number;
    }

    public static int invertedNumberRecursive(int n, int reversed) {
        if (n == 0) {
            return reversed;
        }

        return invertedNumberRecursive(n / 10, reversed * 10 + n % 10);
    }
}
