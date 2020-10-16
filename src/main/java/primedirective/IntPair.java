package primedirective;

public class IntPair {
    public final int a;
    public final int b;

    public IntPair(int _a, int _b) {
        a = _a;
        b = _b;
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof IntPair)) {
            return false;
        }
        IntPair that = (IntPair) other;
        return ((this.a == that.a && this.b == that.b)
            || (this.a == that.b && this.b == that.a));
    }

    @Override
    public int hashCode() {
        return a * b;
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", a, b);
    }

}
