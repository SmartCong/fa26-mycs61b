public class StarTriangle5 {
    /**
     * Prints a right-aligned triangle of stars ('*') with 5 lines.
     * The first row contains 1 star, the second 2 stars, and so on.
     */
    public static void starTriangle5() {
        // TODO: Fill in this function
        for (int row = 0;row < 5;row++) {
            for (int column = 0;column < 6;column++) {
                if (column == 5) {
                    System.out.println();
                }
                else if (column >= 4-row) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
        }
    }

    void main() {
        starTriangle5();
    }
}
