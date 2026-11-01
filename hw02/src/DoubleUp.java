public class DoubleUp {
    /**
     * Returns a new string where each character of the given string is repeated twice.
     * Example: doubleUp("hello") -> "hheelllloo"
     */
    public static String doubleUp(String s) {
        // TODO: Fill in this function
        String double_string = "";
        for (int i = 0; i < s.length();i++) {
            char c = s.charAt(i);
            double_string += c;
            double_string += c;
        }

        return double_string;
    }

    void main() {
        String s = doubleUp("hello");
        IO.println(s);

        IO.println(doubleUp("cat"));
    }
}
