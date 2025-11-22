package p3;

public class P3_main {

    public static int methodeNeu(int[] a) {

        if (a.length < 2) {
            return -1;
        }

        // Schritt 1: absolut größtes und zweitgrößtes bestimmen
        int maxAbs = 0;
        int secondMaxAbs = 0;

        for (int value : a) {
            int absVal = Math.abs(value);

            if (absVal > maxAbs) {
                secondMaxAbs = maxAbs;
                maxAbs = absVal;
            } else if (absVal > secondMaxAbs && absVal != maxAbs) {
                secondMaxAbs = absVal;
            }
        }

        // Wenn kein zweitgrößtes |x| existiert
        if (secondMaxAbs == 0) {
            return -1;
        }

        // Schritt 2: prüfen, ob ± secondMaxAbs existiert
        boolean hasPositive = false;
        boolean hasNegative = false;

        for (int value : a) {
            if (value == secondMaxAbs) hasPositive = true;
            if (value == -secondMaxAbs) hasNegative = true;
        }

        // Schritt 3: Rückgabeentscheidung
        if (hasPositive) {
            return secondMaxAbs; // positiver Wert bevorzugt
        } else if (hasNegative) {
            return -secondMaxAbs;
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] a = {1, -4, -5, 5, -2};
        int[] b = {1, -4, -5, 4, -2};
        int[] c = {4, -4, 4, -4};
        int[] d = {};
        int[] e = {-1, -2, -3};
        int[] f = {2, -2, 5};

        System.out.println(methodeNeu(a)); // -4
        System.out.println(methodeNeu(b)); // 4
        System.out.println(methodeNeu(c)); // -1
        System.out.println(methodeNeu(d)); // -1
        System.out.println(methodeNeu(e)); // -2
        System.out.println(methodeNeu(f)); // 2
    }
}
