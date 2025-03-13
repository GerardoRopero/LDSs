public class AddEvenNumbers {
    public static void main(String[] args) {
        System.out.println(addEvenNumbersIterative(16582234));
        System.out.println(addEvenNumbersRecursive(16582234));
    }

    public static int addEvenNumbersIterative(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 == 0) {
                sum += digit;
            }
            n /= 10;
        }
        return sum;
    }

    public static int addEvenNumbersRecursive(int n) {
        if (n == 0) {
            return 0;
        }
        int digit = n % 10;
        if (digit % 2 == 0) {
            return digit + addEvenNumbersRecursive(n / 10);
        } else {
            return addEvenNumbersRecursive(n / 10);
        }
    }
}
