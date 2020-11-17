package mirea.PR10.Chair;

public class MagicChair implements Chair{
    public void doMagic() {
        System.out.println("минус три ехуууууууууууууу");
    }

    @Override
    public boolean run() {
        doMagic();
        return true;
    }
}
