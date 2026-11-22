/*
  Build a small program that counts operations instead of simply guessing complexity
*/


public class ComplexityLab {

    public static void main(String[] args) {

        int n = 8;

        // O(1)
        int constantCount = 0;
        constantCount++;

        // O(n)
        int linearCount = 0;
        for (int i = 0; i < n; i++) {
            linearCount++;
        }

        // O(n^2)
        int quadraticCount = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                quadraticCount++;
            }
        }

        // O(log n)
        int logarithmicCount = 0;
        for (int i = 1; i < n; i *= 2) {
            logarithmicCount++;
        }

        System.out.println("O(1): " + constantCount);
        System.out.println("O(n): " + linearCount);
        System.out.println("O(n^2): " + quadraticCount);
        System.out.println("O(log n): " + logarithmicCount);
    }
}
