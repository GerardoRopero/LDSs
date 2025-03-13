public class DataInArray {
    public static void main(String[] args) {
        System.out.println(dataInArrayIterative(new int[] {2, 4, 6, 8}, 2));
        System.out.println(dataInArrayRecursive(new int[] {2, 4, 6, 8}, 2, 0));
    }

    public static boolean dataInArrayIterative(int[] n, int m) {
        for (int i = 0; i < n.length; i++) {
            if (n[i] == m) {
                return true;
            }
        }

        return false;
    }

    public static boolean dataInArrayRecursive(int[] n, int m, int index) {
        if (index == n.length) {
            return false;
        }

        return n[index] == m || dataInArrayRecursive(n, m, index + 1);
    }
}
