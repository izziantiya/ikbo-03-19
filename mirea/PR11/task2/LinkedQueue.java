package PR11.task2;

public class LinkedQueue extends AbstractQueue {
    private Node tail;
    private Node head;

    protected void enqueueRealisation(Object element) {
        tail = new Node(element, null, tail);
        if (head == null)
            head = tail;
        else
            tail.next.prev = tail;


    }

    protected Object elementRealisation() {
        return head.value;
    }

    protected void dequeueRealisation() {
        if (head.prev != null) head.prev.next = null;
        head = head.prev;

    }

    private static class Node {
        Object value;
        Node prev;
        Node next;

        Node(Object element, Node prev, Node next) {
            value = element;
            this.prev = prev;
            this.next = next;
        }
    }
}