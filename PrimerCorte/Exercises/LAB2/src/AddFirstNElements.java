public class AddFirstNElements {
    public static void main(String[] args) {
        System.out.println(addFirstNElementsIterative(new int[] {2, 4, 6, 8, 10, 12}, 3 ));
        System.out.println(addFirstNElementsRecursive(new int[] {2, 4, 6, 8, 10, 12} , 3 ));

    }

    public static int addFirstNElementsIterative(int[] numbers, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += numbers[i];
        }

        return sum;
    }

    public static int addFirstNElementsRecursive(int[] numbers, int n) {
        if (n == 0) {
            return 0;
        }
        return numbers[n - 1] + addFirstNElementsRecursive(numbers, n - 1);
    }
}
