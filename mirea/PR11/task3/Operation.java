package PR11.task3;

public abstract class Operation implements Expression {
    private final Expression left;
    private final Expression right;

    public Operation(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    protected abstract int operation(int left, int right);

    public int evaluate(int x) {
        return operation(left.evaluate(x), right.evaluate(x));
    }
}