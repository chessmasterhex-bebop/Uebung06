package p1;

public class P1_main {

    // Geforderte Methode
    public static int squared(int x) {
        int sum = x + 1;      // Schritt 1: x um 1 erhöhen
        int result = sum * sum; // Schritt 2: quadrieren
        return result;
    }

    public static void main(String[] args) {
        // Testaufrufe zum Überprüfen
        System.out.println(squared(8));   // 81
        System.out.println(squared(-3));  // 4
        System.out.println(squared(0));   // 1
    }
}
