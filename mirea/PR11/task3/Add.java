package PR11.task3;

public class Add extends Operation {
    public Add(Expression left, Expression right) {
        super(left, right);
    }

    protected int operation(int left, int right) {
        return left + right;
    }
}
