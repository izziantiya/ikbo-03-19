package PR11.task3;

public class Multiply extends Operation {
    public Multiply(Expression left, Expression right) {
        super(left, right);
    }

    protected int operation(int left, int right) {
        return left * right;
    }
}
