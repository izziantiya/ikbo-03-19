package PR8;

import java.util.Collection;

/**
 * @param <E> - generics type
 */
public interface IWaitList<E> {
    /**
     * @param element - add to waitList
     */
    void add(E element);

    /**
     * @return removed element
     */
    E remove();

    /**
     * @return true if contains element
     */
    boolean contains(E element);

    /**
     * @param c - if list contains in custom list
     * @return true if list contains
     */
    boolean containsAll(Collection<E> c);

    /**
     * @return waitList is empty
     */
    boolean isEmpty();
}
