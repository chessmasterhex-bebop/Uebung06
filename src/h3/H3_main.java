package h3;

public class H3_main {

    public static boolean compareArraysVal(int[] a, int[] b) {

        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            int value = a[i];

            int countA = 0;
            int countB = 0;

            // Häufigkeit in a zählen
            for (int j = 0; j < a.length; j++) {
                if (a[j] == value) {
                    countA++;
                }
            }

            // Häufigkeit in b zählen
            for (int j = 0; j < b.length; j++) {
                if (b[j] == value) {
                    countB++;
                }
            }

            if (countA != countB) {
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {
        // optionale Tests
        int[] a = {1, 2, 3};
        int[] b = {3, 2, 1};
        int[] c = {1, 1, 2};
        int[] d = {1, 2, 1};
        int[] e = {1, 2, 4};

        System.out.println(compareArraysVal(a, b)); // true
        System.out.println(compareArraysVal(c, d)); // true
        System.out.println(compareArraysVal(a, e)); // false
    }
}
