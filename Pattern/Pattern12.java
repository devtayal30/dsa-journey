public class Pattern12 {
    public static void main(String[] args) {
        P12(5); // Change the value to adjust height
    }

    static void P12(int n) {
        // First line: full stars
        for (int i = 1; i <= 2 * n - 1; i++) {
            System.out.print("*");
        }
        System.out.println();

        // Lower hollow triangle
        for (int row = 1; row < n; row++) {
            // Leading spaces
            for (int space = 1; space <= row; space++) {
                System.out.print(" ");
            }

            // Stars and spaces
            System.out.print("*"); // Left border star

            for (int space = 1; space <= 2 * (n - row) - 3; space++) {
                System.out.print(" ");
            }

            // Right border star, only if not last row
            if (row != n - 1) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}