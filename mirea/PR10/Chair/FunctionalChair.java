package mirea.PR10.Chair;

public class FunctionalChair implements Chair{
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public boolean run() {
        sum(4, 5);
        return true;
    }
}
