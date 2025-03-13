public class addNOddIntegers {
    public static void main(String[] args) {
        System.out.println(addNOddIntegersIterative(10));
        System.out.println(addNOddIntegersRecursive(10));
    }

    public static int addNOddIntegersIterative(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }

        return sum;
    }

    public static int addNOddIntegersRecursive(int n) {
        if (n < 1) {
            return 0;
        }

        if (n % 2 == 0) {
            return addNOddIntegersRecursive(n - 1);
        }

        return n + addNOddIntegersRecursive(n - 2);
    }
}
