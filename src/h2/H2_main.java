package h2;

public class H2_main {

    public static boolean compareArrays(int[] a, int[] b) {

        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // optionale Tests
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        int[] c = {1, 3, 2};
        int[] d = {1, 2};

        System.out.println(compareArrays(a, b)); // true
        System.out.println(compareArrays(a, c)); // false
        System.out.println(compareArrays(a, d)); // false
    }
}
