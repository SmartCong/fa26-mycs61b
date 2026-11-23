public class StarTriangleN {
    /**
     * Prints a right-aligned triangle of stars ('*') with N lines.
     * The first row contains 1 star, the second 2 stars, and so on.
     */
    public static void starTriangle(int N) {
        // TODO: Fill in this function
        for (int row = 0; row < N; row++) {
            for (int col = 0; col < N; col++) {
                if (col > N - 2 - row) {
                    IO.print("*");
                } else {
                    IO.print(" ");
                }
            }
            IO.println();
        }
    }

    void main() {
        starTriangle(7);
    }
}
