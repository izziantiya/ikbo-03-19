package PR11.task3;

public class Const implements Expression {
    private final int val;

    public Const(int value) {
        val = value;
    }

    public int evaluate(int x) {
        return val;
    }
}
