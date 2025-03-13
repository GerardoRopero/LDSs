public class EqualArrays {
    public static void main(String[] args) {
        System.out.println(equalArraysIterative(new int[] {2, 4, 6, 8, 9}, new int[] {2, 4, 6, 8, 9}));
        System.out.println(equalArraysRecursive(new int[] {2, 4, 6, 9, 8}, new int[] {2, 4, 6, 9, 8}, 0));


    }

    public static boolean equalArraysIterative(int[] n, int[] m) {
        for (int i = 0; i < n.length; i++) {
            if (n[i] != m[i]) {
                return false;
            }
        }

        return true;
    }

    public static boolean equalArraysRecursive(int[] n, int[] m, int index) {
        if (index == n.length) {
            return true;
        }

        return n[index] == m[index] && equalArraysRecursive(n, m, index + 1);
    }
}
