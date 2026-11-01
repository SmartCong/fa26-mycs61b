public class StarTriangleN {
    /**
     * Prints a right-aligned triangle of stars ('*') with N lines.
     * The first row contains 1 star, the second 2 stars, and so on.
     */
    public static void starTriangle(int N) {
        // TODO: Fill in this function
        for (int row = 0;row < N;row++) {
            for (int column = 0;column < N+1;column++) {
                if (column == N) {
                    System.out.println();
                }
                else if (column >= N-row-1) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
        }
    }

    void main() {
        starTriangle(7);
    }
}
