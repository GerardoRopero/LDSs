public class showPairedArrays {
    public static void main(String[] args) {
        showPairedArraysIterative(new int[] {1, 2, 3}, new int[] {4, 5, 6});
    }

    public static void showPairedArraysIterative(int[] n, int[] m) {
        int[] array = new int[2];
        for (int i = 0; i < n.length && i < m.length; i++) {
            array[0] = n[i];
            array[1] = m[i];
            System.out.println("[" + array[0] + ", " + array[1] + "]");
        }

    }

    public static void showPairedArraysRecursive(int[] n, int[] m) {

    }
}
