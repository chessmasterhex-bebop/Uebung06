package p2;

public class P2_main {

    public static boolean pairwiseDifferent(int[] someNumbers) {

        for (int i = 0; i < someNumbers.length; i++) {
            for (int j = i + 1; j < someNumbers.length; j++) {
                if (someNumbers[i] == someNumbers[j]) {
                    return false; // Doppelung gefunden
                }
            }
        }

        return true; // keine Doppelung
    }

    public static void main(String[] args) {
        // Tests
        int[] a = {1, 2, 5, 6};
        int[] b = {7, 3, 4, 3};
        int[] c = {};
        int[] d = {5};

        System.out.println(pairwiseDifferent(a)); // true
        System.out.println(pairwiseDifferent(b)); // false
        System.out.println(pairwiseDifferent(c)); // true
        System.out.println(pairwiseDifferent(d)); // true
    }
}
