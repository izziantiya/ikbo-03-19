package PR8;

/**
 * @param <E> - generics type
 */
public class BoundedWaitList<E> extends WaitList<E> {
    private int capacity;

    /**
     * @param capacity - capacity of waitList
     */
    public BoundedWaitList(int capacity) {
        super();
        this.capacity = capacity;
    }

    /**
     * @return capacity of waitList
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * @param element - add to waitList
     */
    @Override
    public void add(E element) {
        super.add(element);
    }

    @Override
    public String toString() {
        return "BoundedWaitList{" +
                "capacity=" + capacity +
                '}';
    }
}
