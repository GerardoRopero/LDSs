public class RaiseBaseToPower {
    public static void main(String[] args) {
        System.out.println(raiseBaseToPowerIterative(2, 3));
        System.out.println(raiseBaseToPowerRecursive(2, 3));
    }

    public static int raiseBaseToPowerIterative(int base, int power) {
        int product = 1;
        for (int i = 1; i <= power; i++) {
            product *= base;
        }

        return product;
    }

    public static int raiseBaseToPowerRecursive(int base, int power) {
        if (power == 0) {
            return 1;
        }
        if (power == 1) {
            return base;
        }
        return base * raiseBaseToPowerRecursive(base, power - 1);
    }
}
