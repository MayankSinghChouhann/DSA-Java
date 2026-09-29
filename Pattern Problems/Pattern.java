public class Pattern {
    public static void main(String[] args) {
        int n = 5;

        // Pattern 1: Square Pattern
        // Logic: For each row, print 'n' number of stars.
        System.out.println("Pattern 1: Square");
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println(); // move to the next line
        }

        // Pattern 2: Right-Angled Triangle
        // Logic: For each row 'i', print 'i' number of stars.
        System.out.println("\nPattern 2: Right-Angled Triangle");
        for (int row = 1; row <= n; row++) {
            // each row has 'row' number of columns
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Pattern 3: Inverted Right-Angled Triangle
        // Logic: For each row 'i', print 'n - i + 1' stars.
        System.out.println("\nPattern 3: Inverted Right-Angled Triangle");
        for (int row = 1; row <= n; row++) {
            // stars decrease as row increases
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        // Pattern 4: Right-Aligned Triangle
        // Logic: First print spaces (n - row), then print stars (row).
        System.out.println("\nPattern 4: Right-Aligned Triangle");
        for (int row = 1; row <= n; row++) {
            // print spaces
            for (int col = 1; col <= n - row; col++) {
                System.out.print("  "); // 2 spaces for alignment
            }
            // print stars
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
