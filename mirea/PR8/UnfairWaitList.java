package PR8;

/**
 * @param <E> - generics type
 */
public class UnfairWaitList<E> extends WaitList<E> {
    public UnfairWaitList() {
        super();
    }

    /**
     * @return removed element
     */
    @Override
    public E remove() {
        return super.remove();
    }

    /**
     * @param element - add to back
     */
    public void moveToBack(E element) {
        super.add(element);
    }
}
