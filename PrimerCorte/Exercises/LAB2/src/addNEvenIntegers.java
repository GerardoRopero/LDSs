public class addNEvenIntegers {
    public static void main(String[] args) {
        System.out.println(addNEvenIntegersIterative(10));
        System.out.println(addEvenIntegersRecursive(10));
    }

    public static int addNEvenIntegersIterative(int n) {
        int sum = 0;
        for (int i = 2; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }

    public static int addEvenIntegersRecursive(int n) {
        if (n < 2) {
            return 0;
        }

        if (n % 2 != 0) {
            return addEvenIntegersRecursive(n - 1);
        }

        return n + addEvenIntegersRecursive(n - 2);
    }
}
