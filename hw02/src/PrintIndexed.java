public class PrintIndexed {
    /**
     * Prints each character of a given string followed by the reverse of its index.
     * Example: printIndexed("hello") -> h4e3l2l1o0
     */
    public static void printIndexed(String s) {
        // TODO: Fill in this function
        for (int i = 0; i < s.length();i++) {
            char c = s.charAt(i);
            System.out.print(c);
            System.out.print(s.length()-i-1);
        }
        System.out.println();
    }

    void main() {
        printIndexed("hello");
        printIndexed("cat"); // should print c2a1t0
    }
}
