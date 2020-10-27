package PR8;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * @param <E> - generics type
 * @implNote class implements interface IWaitList
 */
public class WaitList<E> implements IWaitList<E>{
    /**
     * @param content - waitList
     */
    protected ConcurrentLinkedQueue<E> content;

    public WaitList() {
        this.content = new ConcurrentLinkedQueue<>();
    }

    public WaitList(Collection<E> content) {
        this.content = new ConcurrentLinkedQueue<>(content);
    }

    /**
     * @param element - add to waitList
     */
    @Override
    public void add(E element) {
        content.add(element);
    }

    /**
     * @return removed element
     */
    @Override
    public E remove() {
        return content.remove();
    }

    /**
     * @return true if contains element
     */
    @Override
    public boolean contains(E element) {
        return content.contains(element);
    }

    /**
     * @param c - if list contains in custom list
     * @return true if list contains
     */
    @Override
    public boolean containsAll(Collection<E> c) {
        return content.containsAll(c);
    }

    /**
     * @return waitList is empty
     */
    @Override
    public boolean isEmpty() {
        return content.isEmpty();
    }

    @Override
    public String toString() {
        return "WaitList{" +
                "content=" + content +
                '}';
    }
}
