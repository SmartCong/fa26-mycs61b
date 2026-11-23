public class StarTriangle5 {
    /**
     * Prints a right-aligned triangle of stars ('*') with 5 lines.
     * The first row contains 1 star, the second 2 stars, and so on.
     */
    public static void starTriangle5() {
        // TODO: Fill in this function
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                if (col > 3 - row) {
                    IO.print("*");
                } else {
                    IO.print(" ");
                }
            }
            IO.println();
        }
    }

    void main() {
        starTriangle5();
    }
}
