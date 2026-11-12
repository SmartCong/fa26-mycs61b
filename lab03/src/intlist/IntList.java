package intlist;

public class IntList {
    public int first;
    public IntList rest;

    public IntList(int f, IntList r) {
        first = f;
        rest = r;
    }

    /** Replaces all instances of a with b in L.
     *  Modifies the passed list. Iterative (no recursion allowed). */
    public static void replaceID(IntList L, int a, int b) {
        // TODO: Fill in this method (destructive, iterative)L;
        while (L != null) {
            if (L.first == a) {
                L.first = b;
            }
            L = L.rest;
        }
    }

    /** Returns a copy of L, but with all instances of a replaced by b.
     *  Does not modify the passed list. Recursive. */
    public static IntList replaceRND(IntList L, int a, int b) {
        // TODO: Fill in this method (non-destructive, recursive)
        if (L == null) {
            return null;
        }
        IntList copyNode = new IntList(L.first, null);
        if (copyNode.first == a) {
            copyNode.first = b;
        }
        copyNode.rest = replaceRND(L.rest,a,b);
        return copyNode;
    }

    /** Replaces all instances of a with b in L.
     *  Modifies the passed list. Recursive. */
    public static void replaceRD(IntList L, int a, int b) {
        // TODO: Fill in this method (destructive, recursive)
        if (L == null) {
            return;
        }
        if (L.first == a) {
            L.first = b;
        }
        replaceRD(L.rest,a,b);
    }

    /** Adds nodes to this list so that the resulting sequence is a stair,
     *  i.e. each element after the first is one more, one less, or equal
     *  to the previous element. Does not remove or modify any elements.
     *  If the sequence is already a stair, does nothing. Returns this list.
     *  Example: [2, 5, 3].stairify() results in [2, 3, 4, 5, 4, 3]. */
    public IntList stairify() {
        // TODO: Fill in this method (extra, exam-level practice)
        IntList p = this;
        while (p.rest != null) {
            if (p.first-p.rest.first > 1) {
                while (p.first-p.rest.first > 1){
                    p.rest = new IntList(p.first-1,p.rest);
                    p = p.rest;
                }
            } else if (p.first-p.rest.first < -1) {
                while (p.first-p.rest.first < -1){
                    p.rest = new IntList(p.first+1,p.rest);
                    p = p.rest;
                }
            }
            p = p.rest;
        }
        return this;
    }

    /** The Boxes and Pointers exercise from the spec. Set a breakpoint on the
     *  first line, then step through in the Java Visualizer, predicting the
     *  picture before each step. (Careful: partway through, the lists briefly
     *  contain a cycle, so code that walks a list would loop forever.) */
    public static void main(String[] args) {
        IntList L1 = IntList.of(1, 2, 3);
        IntList L2 = new IntList(4, L1.rest);
        L2.rest.first = 13;
        L1.rest.rest.rest = L2;
        IntList L3 = IntList.of(50);
        L2.rest.rest = L3;
    }

    /* The methods below are used by the tests for this assignment.
       You do not need to read or understand them. */

    /** Returns a new IntList containing the given values.
     *  Example: IntList.of(1, 2, 3) is the list 1 -> 2 -> 3. */
    public static IntList of(int... values) {
        IntList L = null;
        for (int i = values.length - 1; i >= 0; i -= 1) {
            L = new IntList(values[i], L);
        }
        return L;
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof IntList oL) {
            if (first != oL.first) {
                return false;
            } else if (rest == null && oL.rest == null) {
                return true;
            } else if (rest != null && oL.rest != null) {
                return rest.equals(oL.rest);
            }
        }
        return false;
    }
}
